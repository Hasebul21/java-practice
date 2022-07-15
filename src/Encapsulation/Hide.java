package Encapsulation;

public class Hide {

    private String name;
    private int salary;
    private String address;

    public void setName(String name){

        this.name=name;
    }
    public void setSalary(int salary){

        this.salary=salary;
    }
    public void setAddress(String address){

        this.address=address;
    }

    public String getName(){

        return this.name;
    }
    public int getSalary(){

        return this.salary;
    }
}
