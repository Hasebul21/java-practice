package Interface;

public class Dog implements Animal,Owner{

    public int run(int x){
        return 0;
    }
    public void run(){
        System.out.println("Dog is running");
    }
    public void eat(){
        System.out.println("Dog is Eating");
    }
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }

    public void ownerDetails(){

        System.out.println("Owner name is Mickey");
    }
    public void dogInformation(){
        System.out.println("Dog name is john. His age is 2 years.");
    }
}
