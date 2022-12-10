package org.example;

public class RefugeeRegistrator implements IRefugeeRegistrator{
  @Override
  public void register(String name, String lastName, double x, double y) {
    var refugeeBasis = RefugeeBasisFactory.getRefugee(name);
    var toSafe = new RefugeeDetails(lastName, new Coordinates(x, y), refugeeBasis);
    // TODO zapisz do bazy
    System.out.println(toSafe);
  }
}
