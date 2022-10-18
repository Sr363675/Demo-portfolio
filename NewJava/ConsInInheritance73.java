class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: "+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
       // super(1);
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y as: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int x ,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived with value of z as: "+z);
    }
}
public class ConsInInheritance73 {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d =new Derived1();
        //Derived1 d = new Derived1(5,9);
        ChildOfDerived c =new ChildOfDerived(6,8,7);
    }
}
