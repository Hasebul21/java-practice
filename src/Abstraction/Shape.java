package Abstraction;

public abstract class Shape {

      protected double Area;
      public Shape(){
          System.out.println("Abstract Constructor Created");
      }
      public abstract  void area();
      public double getArea(){
          return Area;
      }
}
