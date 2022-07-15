package Static;

public class Test {

    public static int staticVar;
    public int instanceVar;
    public String employeeName;
    public static int employee_1_age;
    public static int employee_2_age;
    public static int employee_3_age;

    static {

        System.out.println("Static block is called");
        employee_1_age=23;
        employee_2_age=24;
        employee_3_age=25;
    }

    public Test(){
        System.out.println("Constructor Created");
        staticVar++;
        instanceVar++;
    }
    public static void information(){

        /*  cannot access instance variable
            System.out.println(employeeName);
        */
        System.out.println("Welcome to the Cefalo");
        System.out.println("Number Employee Number "+staticVar);
    }
    public void personalInformation(){

        // Can acess static content;
        System.out.println(staticVar);
    }
}
