package org.example;

import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    IRefugeeRegistrator refugeeRegistrator = new RefugeeRegistratorProxy();
    String name;
    String lastName;
    double x, y;
    while (true){
      System.out.println("imie : ");
      name = scanner.nextLine();
      System.out.println("nazwisko : ");
      lastName = scanner.nextLine();
      x = getCord("x");
      y = getCord("y");
      refugeeRegistrator.register(name, lastName, x, y);
      System.out.println();
    }
  }

  private static double getCord(String name){
    while (true){
      System.out.println("wzpółrzędna " + name + " : ");
      try {
        return Double.parseDouble(scanner.nextLine());
      }catch (Exception e){
        System.out.println("niepoprawny format");
      }
    }
  }
}