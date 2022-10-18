import java.util.Locale;

public class Set3AllProblem17 {
    public static void main(String[] args){
        //Problem-1
        String name = "SaNdeEp";
        System.out.println(name);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        //------------*-----------*-------------*---------

        // Problem-2
        String text = "My name is      sandeep";
        text = text.replace(" ","_");
        System.out.println(text);
        //--------*--------------*------------------*-----------

        //Problem-3
        String letter = "Dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>", "Harry");
        System.out.println(letter);
        //----------*-------------------*------------*----------*------------

        //Problem-4
        String mystring = "This is contain double  and   triple string";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
        //--------------*------------------*--------------*-------------*---------------

        //Problem-5
        String myletter = "Dear Harry,\n\tThis java course very nice.\nThanks!";
        System.out.println(myletter);
        //---------*END*--------------
    }
}










