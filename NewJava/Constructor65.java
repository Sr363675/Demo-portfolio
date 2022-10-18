class Demo{
    Demo(){
        System.out.println("This is default constructor");
    }
    Demo(String s, int b){
        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }
}

public class Constructor65 {
    public static void main(String[] args) {
        //Default Constructor
        Demo obj1 = new Demo();
        //Parameterized constructor
        Demo obj2 = new Demo("CodeWithHarry java playlist", 42);
    }
}
