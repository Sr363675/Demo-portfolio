class Cylinder{
    private int height;

    private int radius;

   public Cylinder(int radius, int height){
       this.radius = radius;
       this.height = height;
   }
   public int getRadius(){
       return radius;
   }
   public void setRadius(int radius){
       this.radius = radius;
   }
   public int getHeight(){
       return height;
   }
   public void setHeight(int height){
       this.height = height;
   }
   //Question-2
   public double surfaceArea(){
       return 2*Math.PI * radius * radius + 2*Math.PI*radius*height;
   }
   public double volume(){
       return Math.PI * radius *radius ;
   }
}
public class Set9_q1_68 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9,12);
        //Question-1
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Radius: " + myCylinder.getRadius());
        // Question-2
        System.out.println("Surface area of Cylinder: " + myCylinder.surfaceArea());
        System.out.println("Volume of the Cylinder: " + myCylinder.volume());
    }
}
//Output
//Height: 12
//Radius: 9
//Surface area of Cylinder: 1187.5220230569416
//Volume of the Cylinder: 933.0530181161685
