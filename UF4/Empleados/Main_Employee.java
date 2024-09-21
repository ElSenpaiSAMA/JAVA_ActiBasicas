package Primer.UF4.HerenciaJerarquica;

public class Main_Employee {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();
        TemporalEmployee t = new TemporalEmployee();
        // All objects of inherited classes can access the variable of class Employee
        System.out.println("Permanent Employee salary is :" + p.getSalary());
        System.out.println("Hike for Permanent Employee is:" + p.getHike());
        System.out.println("Temporary Employee salary is :" +t.getSalary());
        System.out.println("Hike for Temporary Employee is :" + t.getHike());
    }
}
