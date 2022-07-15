package Inheritence;

public class Contestant extends Mentor{

    public String favouriteLanguage="Cpp";

    public Contestant(){

        super(6,"Zakaria","Google");
        System.out.println("Contest Constructor created\n");
        //name;
        //slackName="Hasebul";
        //organizationName="Cefalo";
    }

    public void personalInformation(){

        super.personalInformation();
        System.out.println("Personal Information of Contestant class");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
        System.out.println("Organization Name : "+organizationName);
        System.out.println("Year Of Experinece : "+yearOfExperinece);
        System.out.println("SlackName : "+slackName+"\n");
    }
}
