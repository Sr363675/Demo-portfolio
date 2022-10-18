class NewEmployee{
    //first constructor
    NewEmployee(String s, int i){
        System.out.println("The name of the first employee is :" + s);
        System.out.println("the id of the first empoyee is :"+ i);
    }
    NewEmployee(String s, int i, int salary){
        System.out.println("The name of the first employee is :" + s);
        System.out.println("the id of the first empoyee is :"+ i);
        System.out.println("The salary of second employee is :" + salary);
    }
}

public class Constructor2_66 {
    public static void main(String[] args) {
        NewEmployee sandeep = new NewEmployee("Sandeep kumar",3);
        NewEmployee kumar = new NewEmployee("Pandey",2,60000);
    }
}
