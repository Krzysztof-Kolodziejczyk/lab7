package org.example.model;

import org.example.mapper.RefugeeBasis;

public class RefugeeDetails {
  private final String lastname;
  private final Coordinates coordinates;
  private final RefugeeBasis refugeeBasis;

  public RefugeeDetails(String lastName, Coordinates coordinates, RefugeeBasis refugeeBasis) {
    this.lastname = lastName;
    this.coordinates = coordinates;
    this.refugeeBasis = refugeeBasis;
  }

  public String getLastname() {
    return lastname;
  }

  public Coordinates getCoordinates() {
    return coordinates;
  }

  public RefugeeBasis getRefugeeBasis() {
    return refugeeBasis;
  }
}
