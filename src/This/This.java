package This;

public class This {

    private int age;
    private String name;
    private int salary;

    public This(int age, String name){
        this(20,"Hasan",300);
        System.out.println("Two parameter Constructor Created");
        this.age=age;
        this.name=name;
        System.out.println("Age : "+age+" Name : "+name);
    }

    public This(int age, int name){
        // method overloading
    }

    public This(int age, String name, int salary){
        //this(50,"Turja");
        System.out.println("Three parameter Constructor Created");
        this.age=age;
        this.name=name;
        System.out.println("Age : "+age+" Name : "+name+" Salary : "+salary);
        System.out.println("Printing This : "+this);
    }
}
