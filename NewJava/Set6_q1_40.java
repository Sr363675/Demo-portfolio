public class Set6_q1_40 {
    public static void main(String[] args) {
        // 5 float and calculate their sum
        float [] marks = {96.2f,45.3f,78.3f,48.6f,78.1f};
        float sum = 0;
        for (float element: marks){
            System.out.println(element);
            sum = sum + element;

        }
        System.out.println("Total marks:"+ sum);
    }
}
