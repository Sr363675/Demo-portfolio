
class Rectangular{
    int length;
    int breadth;
    public int rect(){
        return length*breadth;
    }

}
public class Set8_q4_62 {
    public static void main(String[] args) {
        Rectangular rect = new Rectangular();
        System.out.print("Area of length: ");
        System.out.println(rect.length=8);
        //rect.length = 8;
        System.out.print("Area of breadth: ");
        System.out.println(rect.breadth=3);
        //rect.breadth = 3;
        System.out.print("Area of Rectangular: ");
        System.out.println(rect.rect());
    }
}
//Output
//Area of length: 8
//Area of breadth: 3
//Area of Rectangular: 24