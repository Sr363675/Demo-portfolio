class Employe{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Set8_q1_59 {
    public static void main(String[] args) {
        Employe sandeep = new Employe();
        sandeep.setName("sandeep Kumar");
        sandeep.salary = 30000;
        System.out.println(sandeep.getSalary());
        System.out.println(sandeep.getName());
    }

}
//Output:-
  //30000
  //sandeep Kumar