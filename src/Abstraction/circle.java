package Abstraction;

public class circle extends Shape {

    protected double radius;
    public circle(double radius){

        this.radius=radius;
        System.out.println("Circle Constructor Created");
    }
    public void area(){

          Area=2*Math.PI*radius;
    }
}
