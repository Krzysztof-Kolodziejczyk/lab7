package org.example.registration;

import org.example.mapper.RefugeeMapper;
import org.example.mapper.RefugeeMapperImpl;
import org.example.model.Coordinates;
import org.example.model.RefugeeBasisFactory;
import org.example.model.RefugeeDetails;
import org.example.repository.RefugeeRepository;

public class RefugeeRegistrator implements IRefugeeRegistrator {

  private final RefugeeRepository repository = new RefugeeRepository();
  private final RefugeeMapper mapper = new RefugeeMapperImpl();
  @Override
  public void register(String name, String lastName, double x, double y) {
    var refugeeBasis = RefugeeBasisFactory.getRefugee(name);
    var toSafe = new RefugeeDetails(lastName, new Coordinates(x, y), refugeeBasis);
    repository.saveRefugee(mapper.map(toSafe));
    repository.getRefugees().forEach(System.out::println);
  }
}
