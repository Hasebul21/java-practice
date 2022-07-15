package Composition;

public class Hasebul {

    public String name;
    public String Position;

    public Hasebul(String name, String Position){

        this.name=name;
        this.Position=Position;
    }
    public void getInfo(){
        System.out.println("Name : "+name);
        System.out.println("Position: "+Position+"\n");
    }
    public void PersonalDetails(){

        System.out.println("Hasebul\nDhaka\nAIUB\n");
    }
}
