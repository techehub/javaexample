public class Employee {
    String empid;
    String name;
    double basic;
    double hra;
    Employee (String empid, String name,
              double basic, double hra){

        this(empid,name);
        this.basic=basic;
        this.hra= hra;
    }


    Employee (String empid, String name
              ){

        this.empid=empid;
        this.name=name;
    }


    Employee(){
        System.out.println("Employee created ....");
    }


    void display(){
        System.out.println("-------------------");
        System.out.println("Id :"+ empid);
        System.out.println("Name :"+ name);
        System.out.println("basic :"+ basic);
        System.out.println("hra :"+ hra);
    }
}
