public class ArratLen38 {
    public static void main(String[] args) {
        //Array length
        /*float [] marks = {95.5f,65.4f,85.7f,45.6f,98.2f};
        System.out.println(marks.length);
        String [] students= {"sandeep", "sonu", "sumit", "sachin"};
        System.out.println(students.length);
        System.out.println(students[3]);*/


        int [] marks = {95,78,65,23,87};

        //Display the array (Native way)
       /* System.out.println("Printing using native way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/

        //Display the Array (for loop)
       /* System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }*/


        //Quick Quiz: Display the array in reverse order (for loop)
        /*for (int i = marks.length-1; i >= 0 ; i--) {
            System.out.println(marks[i]);
        }*/


        // Display for-each loop
        for (int element: marks) {
            System.out.println(element);
        }

    }
}
