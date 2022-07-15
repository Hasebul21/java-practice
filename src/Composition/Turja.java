package Composition;

public class Turja {

    public String name;
    public String Position;

    public Turja(String name, String Position){

        this.name=name;
        this.Position=Position;
    }
    public void getInfo(){
        System.out.println("Name : "+name);
        System.out.println("Position: "+Position+"\n");
    }
    public void Calculate(){
        for(int i=1;i<=10;i++) System.out.println(i);
    }
}
