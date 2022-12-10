package org.example;

public class RefugeeDetails {
  private final String lastName;
  private final Coordinates coordinates;
  private final RefugeeBasis refugeeBasis;

  public RefugeeDetails(String lastName, Coordinates coordinates, RefugeeBasis refugeeBasis) {
    this.lastName = lastName;
    this.coordinates = coordinates;
    this.refugeeBasis = refugeeBasis;
  }

  public String getLastName() {
    return lastName;
  }

  public Coordinates getCoordinates() {
    return coordinates;
  }

  public RefugeeBasis getRefugeeBasis() {
    return refugeeBasis;
  }
}
