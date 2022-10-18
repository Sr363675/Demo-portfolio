class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }

}
public class CreateJavaClass58 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee sandeep = new Employee();
        Employee john = new Employee();

        //setting attributes for sandeep
        sandeep.id = 12;
        sandeep.salary = 30000;
        sandeep.name = "sandeep kumar";
        //setting attributes for John
        john.id = 52;
        john.salary = 20000;
        john.name = "john kumar";
        //printing the attributes
        sandeep.printDetails();
        john.printDetails();
        //--------------------
        int salary = john.getSalary();
        System.out.println(salary);
        System.out.println(sandeep.id);
        System.out.println(sandeep.name);

    }
}
