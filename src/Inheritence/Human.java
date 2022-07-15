package Inheritence;

public class Human {

    protected String name;
    protected int age;
    protected String address;
    //private int wow=4000;

      protected Human(){

          System.out.println("Human Constructor created\n");
      }

      protected Human(String name,int age,String address){

        System.out.println("Human Parameter Constructor created\n");
        this.name=name;
        this.age=age;
        this.address=address;

      }

      public void personalInformation(){

          System.out.println("Personal Information of Human class");
          System.out.println("Name : "+this.name);
          System.out.println("Age : "+this.age);
          System.out.println("Address : "+this.address+"\n");
      }
}
