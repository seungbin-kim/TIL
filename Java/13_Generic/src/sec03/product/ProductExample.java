package io.wisoft.java_seminar.chap13.sec03.product;

public class ProductExample {

  public static void main(String[] args) {
    Product<Tv, String> product1 = new Product<>();

    product1.setKind(new Tv());
    product1.setModel("스마트Tv");
    Tv tv = product1.getKind();
    String tvModel1 = product1.getModel();

    Product<Car, String> product2 = new Product<>();
    product2.setKind(new Car());
    product2.setModel("디젤");
    Car car = product2.getKind();
    String carModel = product2.getModel();
  }

}

class Tv {
}

class Car {
}
