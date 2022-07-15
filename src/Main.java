import Composition.Human;
import Static.*;
import This.*;
import Constructor_Overload_Override.*;
import Inheritence.*;
import Encapsulation.*;
import Interface.*;
import Abstraction.*;
import Composition.*;
import java.util.Collection;


public class Main {

    void Enum(){

        enum day{
            SATURDAY,
            SUNDAY,
            MONDAY;
        }

        day arr[]=day.values();
        System.out.println(arr[2]);
        for( day d : arr) System.out.println(d);
        for( day d : arr) System.out.println(d+" at index "+d.ordinal());
        System.out.println(day.valueOf("MONDAY"));

    }

    void ThisKey() {

        This object1=new This(10,"Hasebul");
        System.out.println("\n");
        object1=new This(20,"Turja",400);
    }

    void StaticKey(){

        Test
                Hasebul = new Test();
        System.out.println("Static Variable "+Hasebul.staticVar);
        System.out.println("Class Variable "+Hasebul.instanceVar);
                Hasebul = new Test();
        System.out.println("Static Variable "+Hasebul.staticVar);
        System.out.println("Class Variable "+Hasebul.instanceVar);
                Hasebul = new Test();
        System.out.println("Static Variable "+Hasebul.staticVar);
        System.out.println("Class Variable "+Hasebul.instanceVar);

        Test.information();
        Hasebul.information();

    }
    void Abstraction(){

         //Abstract class can contain only concrete method
        // subclass has to be abstract
          Shape object=new circle(2.5);
          object.area();
          System.out.println("Area of Circle : "+object.getArea());
    }
    void Interface(){

        Dog object=new Dog();
        object.run();
        object.dogInformation();

    }

    void Encapsulation(){

        // Setter getter method
        // Not access from outside the world
        Hide object=new Hide();
        object.setName("Hasebul");
        System.out.println(object.getName());

    }

    void Cons_override_overload(){

        /*Graphics
                object=new Graphics();
                object=new Graphics("Hello","World");
                object=new Graphics(new Circle());
                object=new Graphics(new Reactangle());*/

        AnotherGraphics object2=new AnotherGraphics();
        object2.Override();
        Graphics object3=new Graphics();
        object3.Override();
        AnotherGraphics object4=new Graphics();
        object4.Override();
        /*
        Error
        Graphics object5=new AnotherGraphics();
        object5.Override();
        */

    }
    void Composition(){

        Human object=new Human();
        Hasebul Haseb=new Hasebul("Hasebul","Traine SWE");
        Turja Tur=new Turja("Turja","Senior Swe");
        object.setObjectHaseb(Haseb);
        object.setObjectTurja(Tur);
        //object.GetInfo();
        object.object1.PersonalDetails();
        object.object2.Calculate();

    }
    void Inheritance(){

        Mentor Turja=new Mentor(4,"Turja","Google");
        Turja.personalInformation();
        //Turja.ProfessionalInformation();


        //Contestant Hasebul=new Contestant();
        //Hasebul.favouriteLanguage;
        //Hasebul.personalInformation();

    }


    public static void main(String[] args) {

         Main object=new Main();
         object.Composition();
         //object.Inheritance();
        //object.Cons_override_overload();
        //object.Encapsulation();
          //object.Abstraction();
        //object.Interface();
        //object.ThisKey();
        //object.StaticKey();
        //object.Enum();

    }
}