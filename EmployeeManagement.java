
class Employee{
    String name;
    int id, Salary;

    void calculateSalary(){
        System.out.println("Salary");
    }
}
class Manager extends Employee{
    int bonus;
    Manager(int id, String name, int Salary, int bonus ){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.bonus = bonus;
    }
    @Override
    void calculateSalary(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+(bonus+Salary));
    }

}
class Developer extends Employee{
    int projectHandled, Salary;
    Developer(int id, String name, int Salary, int projectHandled ){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.projectHandled = projectHandled*5000;
    }
    @Override
    void calculateSalary(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Bonus: "+projectHandled);
        System.out.println("Total Salary: "+(projectHandled+Salary));
    }
}
class Tester extends Employee{
    int bug;
    Tester(int id, String name, int Salary, int bug ){
        this.id = id;
        this.name = name;
        this.Salary = Salary;
        this.bug = bug*2000;
    }
    @Override
    void calculateSalary(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Bonus: "+bug);
        System.out.println("Total Salary: "+(bug+Salary));
    }
}

public class EmployeeManagement {
    public static void main(String[]args){
        Employee manager = new Manager(1,"Fatima",30000,5000);
        Employee developer = new Developer(2,"Maham",40000,4);
        Employee tester = new Tester(3,"Kainat",40000,3);
        manager.calculateSalary();
        developer.calculateSalary();
        tester.calculateSalary();
    }
}
