package org.example.mapper;

import org.example.model.RefugeeDetails;
import org.example.dto.Refugee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface RefugeeMapper {

    @Mapping(target = "name", source = "refugeeBasis.name")
    @Mapping(target = "x", source = "coordinates.x")
    @Mapping(target = "y", source = "coordinates.y")
    Refugee map(RefugeeDetails refugeeDetails);
}
