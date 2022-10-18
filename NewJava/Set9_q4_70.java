  class Rectangle{
    private int lenght;
    private int breadth;

    public Rectangle(){
        this.lenght = 4;
        this.breadth = 5;
    }
    public Rectangle(int lenght, int breadth){
        this.lenght = lenght;
        this.breadth = breadth;
    }
    public int getLenght(){
        return lenght;
    }
    public int getBreadth(){
        return breadth;
    }
  }
public class Set9_q4_70 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(12,56);
        System.out.println(r.getLenght());
        System.out.println(r.getBreadth());
    }
}










