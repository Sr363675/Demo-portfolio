import javax.swing.plaf.PanelUI;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-name-here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId (int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class constructor3_67 {
    public static void main(String[] args) {
        MyMainEmployee sandeep = new MyMainEmployee();
        System.out.println(sandeep.getId());
        System.out.println(sandeep.getName());
    }
}
