package Constructor_Overload_Override;

public class Graphics extends AnotherGraphics {

    public Graphics(){

        //System.out.println("Default Constructor Created");
    }
    public Graphics(String string){

        System.out.println("Parameter Constructor Created");
    }
    public Graphics(String string1,String string2){

        System.out.println("2 Parameter Constructor Created");
    }
    public void salary(int salary){

        System.out.println("Integer Salary "+ salary);
    }
    public void salary(double salary){

        System.out.println("Double Salary "+ salary);
    }
    public Graphics(Reactangle rectangle){

        System.out.println("Reactangle Object parameter Created");
        rectangle.Perimeter();
    }
    public Graphics(Circle circle){

        System.out.println("Reactangle Object parameter Created");
        circle.Perimeter();
    }
    public void Override(){

        System.out.println("Its in Graphics Class");
    }
}
