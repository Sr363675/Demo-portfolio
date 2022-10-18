public class Set7_q9_57 {
    //convert celsius temperature into fahrenheit
    //(0^0C * 9/5) + 32=32^0f
    static float ftemp(float x){
        float temp = 0.0f;
        temp = (x*1.8f)+32;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(ftemp(29.5f));
    }
}
