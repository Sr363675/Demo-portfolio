public class Set6_q2_41 {
    public static void main(String[] args) {
        System.out.println("Given array number are integer or not! ");
        float [] marks = {45.3f,47.3f,85.3f,96.1f,75.2f};
        float num = 45.5f;
        boolean isInArray = false;
         for (float element:marks){
             if (num==element){
                 isInArray = true;
                 break;
             }
         }
         if (isInArray){
             System.out.println("The value is present in array");

         }else {
             System.out.println("The value is not present in the array");
         }
    }
}
