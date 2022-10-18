public class Set6_q6_45 {
    public static void main(String[] args) {
        int [] arr = {1,5,6,13,2,4};
        int max =0; //Integer.MAX_VALUE;
         for (int e: arr){
             if (e > max){
                 max = e;
             }
         }
        System.out.println("The value of maximum element in this array is:" + max);

        //minimum value
       // int [] arr = {1,5,6,13,2,4};
        int min = 0; //Integer.MIN_VALUE;
        for (int e: arr){
            if (e < min){
                min = e;
            }
        }
        System.out.println("The value of minimum element in this array is:" + min);
    }
}
