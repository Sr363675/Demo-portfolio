//Quick Quiz: Create a class animal and Derived another class Dog from it.
class Animal{
    public String color;
    public String getColor(){
       return color;
    }
    public void setColor(String color){
        System.out.println("The Dog color is: ");
        this.color = color;
    }
}

class Dog extends Animal{
    public String streetDog;

    public String getstreetDog(){
        return streetDog;
    }
    public void setstreetDog(String streetDog){
        this.streetDog= streetDog;
    }
}
public class Inheritance2_72 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setColor("Brown");
        System.out.println(d.getColor());
        System.out.println("Name of Dog is: ");
        d.setstreetDog("Tommy");
        System.out.println(d.getstreetDog());
    }
}
