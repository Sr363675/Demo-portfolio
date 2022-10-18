public class Set6_q3_42 {
    public static void main(String[] args) {
        float[] marks = {56.5f,56.6f,45.3f,98.2f,78.3f};
        float sum = 0 ;
        for (float element: marks){
            sum = sum + element;

        }
        System.out.println("Total average marks of physics:" + sum/marks.length);
    }
}
