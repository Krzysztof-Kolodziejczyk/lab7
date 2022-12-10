package org.example.mapper;

import java.util.Objects;

public class RefugeeBasis {
  private final String name;

  public RefugeeBasis(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    RefugeeBasis that = (RefugeeBasis) o;
    return Objects.equals(name, that.name);
  }

}
