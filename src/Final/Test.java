package Final;

public class Test extends Checking{

    final int count=10;
    final int salary;
    // Static final variable
    static final int age;

    static {
          age=30;
    }

    public Test(){

        // Must initiliaze into constructor
        //count=20;
        salary=10;
    }
    // Final method cannot overridden
    /*public void draw(){

    }*/
}
