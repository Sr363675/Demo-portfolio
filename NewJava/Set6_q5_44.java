public class Set6_q5_44 {
    public static void main(String[] args) {
        int [] arr = {1,2,6,5,3,9};
        int l = arr.length;
        int n = Math.floorDiv(1,2);
        int temp ;
        for(int i=0; i<n; i++){
            //swap a[i] and a[l-i-1]
            //a  b   temp
            //|4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
            for (int element: arr){
                System.out.print(element + " ");
            }
    }
}
