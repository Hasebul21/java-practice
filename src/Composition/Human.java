package Composition;

public class Human {

    public Hasebul object1;
    public Turja object2;

    public Human(){

        System.out.println("Default Constructor Created\n");
    }

    public void setObjectHaseb(Hasebul object1){
          this.object1=object1;
    }
    public void setObjectTurja(Turja object2){
        this.object2=object2;
    }

    public void GetInfo(){
          object1.getInfo();
          object2.getInfo();
          object1.PersonalDetails();
          object2.Calculate();
    }
}
