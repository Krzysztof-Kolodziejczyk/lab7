package org.example;

public class RefugeeRegistratorProxy implements IRefugeeRegistrator {
  private final IRefugeeRegistrator refugeeRegistrator;

  public RefugeeRegistratorProxy() {
    this.refugeeRegistrator = new RefugeeRegistrator();
  }

  @Override
  public void register(String name, String lastName, double x, double y) {
    name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    refugeeRegistrator.register(name, lastName, x, y);
  }
}
