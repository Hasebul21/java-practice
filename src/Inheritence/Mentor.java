package Inheritence;

import org.w3c.dom.ls.LSOutput;

public class Mentor extends Human {


      protected int yearOfExperinece;
      protected String slackName;
      protected String organizationName;

      protected Mentor(){

         System.out.println("Mentor Default Constructor created\n");
      }

      public Mentor(int yearOfExperinece,String slackName,String organizationName){

          super("Turja",25,"Dhaka");
          System.out.println("Mentor Constructor created\n");
          this.yearOfExperinece=yearOfExperinece;
          this.slackName=slackName;
          this.organizationName=organizationName;

          //System.out.println(wow);
      }

      public void personalInformation(){

          super.personalInformation();
          System.out.println("Personal Information of Mentor class");
          name="Hasebul";
          age=30;
          address="Cumilla";
          System.out.println("Name : "+name);
          System.out.println("Age : "+age);
          System.out.println("Address : "+address+"\n");
      }

      public void ProfessionalInformation(){

          System.out.println("Organization Name : "+organizationName);
          System.out.println("Year Of Experinece : "+yearOfExperinece);
          System.out.println("SlackName : "+slackName);
      }
}
