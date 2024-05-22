package org.example.decorator;

public class Main {
    public static void main(String[] args) {
      Soda coca = new Coca();
      System.out.println("prix "+coca.price() +" type "+ coca.getDescription());

      Soda cocaHot = new Hot(coca);
      System.out.println("prix "+cocaHot.price() +" type "+ cocaHot.getDescription());

      Soda cocaFreshHot = new Fresh(cocaHot);
      System.out.println("prix "+cocaFreshHot.price() +" type "+ cocaFreshHot.getDescription());

    }
}