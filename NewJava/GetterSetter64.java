class MyEmployee{
    private int id;
    private String name;
     public String getName(){
         return name;
     }
     public void setName(String n){
         this.name = n;
     }
     public void setId(int i){
         this.id = i;
     }
     public int getId(){
         return id;
     }

}

public class GetterSetter64 {
    public static void main(String[] args) {
        MyEmployee sandeep = new MyEmployee();
        sandeep.setName("Sandeep Kumar");
        System.out.println(sandeep.getName());
        sandeep.setId(232);
        System.out.println(sandeep.getId());
    }
}
