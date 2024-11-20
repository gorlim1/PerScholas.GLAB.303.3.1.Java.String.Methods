import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Run all String methods with examples
        lengthMethod();
        isEmptyMethod();
        trimMethod();
        toLowerCaseMethod();
        toUpperCaseMethod();
        concatMethod();
        splitMethod();
        charAtMethod();
        compareToMethod();
        substringMethod();
        indexOfMethod();
        containsMethod();
        replaceMethod();
        replaceAllMethod();
        equalsMethod();
        doubleEqualSignsOperatorMethod();
        compareToMethod2();
    }

    //String method methods

    static void lengthMethod() {
        String str1 = "Java";
        String str2 = "";

        System.out.println("length() Method Example");
        System.out.println(str1.length());  // 4
        System.out.println(str2.length());  // 0
        System.out.println("Java".length());  // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10
        System.out.println();
    }

    static void isEmptyMethod() {

        String s1 = "";
        String s2 = "hello";

        System.out.println("isEmpty() Method Example");
        System.out.println(s1.isEmpty());      // true
        System.out.println(s2.isEmpty());      //false
        System.out.println();
    }

    static void trimMethod() {

        String s1 = "  hello   ";

        System.out.println("trim() Method Example");
        System.out.println(s1+"how are you");        // without trim()
        System.out.println(s1.trim()+"how are you"); // with trim()
        System.out.println();
    }

    static void toLowerCaseMethod() {

        String s1 = "HELLO HOW Are You?";
        String s1lower = s1.toLowerCase();

        System.out.println("toLowerCase() Method Example");
        System.out.println(s1lower);
        System.out.println();
    }

    static void toUpperCaseMethod() {

        String s1 = "hello how are you";
        String s1upper = s1.toUpperCase();

        System.out.println("toUpperCase() Method Example");
        System.out.println(s1upper);
        System.out.println();
    }

    static void concatMethod() {

        //------By using concat method----
        String str1 = "Learn ";
        String str2 = "Java";

        System.out.println("concat() Method Example");

        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "

        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";

        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        System.out.println(s5);
        //both of the above statements will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";
        System.out.println(message);

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2
        System.out.println(s);

        // String Supplement is concatenated with character B
        String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
        System.out.println(s1);
        System.out.println();
    }

    static void splitMethod() {

        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        System.out.println("split() Method Example");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
        System.out.println();
    }

    static void charAtMethod() {

        String message = "Welcome to Java";

        System.out.println("charAt() Method Example");
        System.out.println("The first character in the message is " + message.charAt(0));
        System.out.println();
    }

    static void compareToMethod() {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";

        System.out.println("compareTo() Method Example");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
        System.out.println();
    }

    static void substringMethod() {

        String str1 = "java is fun";

        System.out.println("substring() Method Example");

        // extract substring from index 0 to 3
        System.out.println(str1.substring(0, 4));
        System.out.println();
    }

    static void indexOfMethod() {

        String str1 = "Java is fun";
        int result;

        System.out.println("indexOf() Method Example");

        // getting index of character 's'
        result = str1.indexOf('s');
        System.out.println(result); // 6

        // getting index of character 'J'
        result = str1.lastIndexOf('J');
        System.out.println(result); // 0

        // the last occurrence of 'a' is returned
        result = str1.lastIndexOf('a');
        System.out.println(result); // 3

        // character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result); // -1

        // getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result); // 1

        // substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result); // -1
        System.out.println();
    }

    static void containsMethod() {

        String str1 = "Learn Java";
        Boolean result;

        System.out.println("contains() Method Example");

        // check if str1 contains "Java"
        result = str1.contains("Java");
        System.out.println(result);  // true

        // check if str1 contains "Python"
        result = str1.contains("Python");
        System.out.println(result);  // false

        // check if str1 contains ""
        result = str1.contains("");

        System.out.println(result);  // true
        System.out.println();
    }

    static void replaceMethod() {

        String str1 = "abc cba";

        System.out.println("replace() Method Example");

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z'));

        // all occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J'));

        // character not in the string
        System.out.println("Hello".replace('4', 'J'));

        // all occurrences of "C++" is replaced with "Java"
        System.out.println(str1.replace("C++", "Java"));

        // all occurrences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));

        // substring not in the string
        System.out.println("Java".replace("C++", "C"));
        System.out.println();
    }

    static void replaceAllMethod() {

        String str1 = "Java123is456fun";

        // regex for sequence of digits
        String regex = "\\d+";

        System.out.println("replaceAll() Method Example");

        // replace all occurrences of numeric
        // digits by a space
        System.out.println(str1.replaceAll(regex, " "));
        System.out.println();
    }

    static void equalsMethod() {

        String s1 = "PerScholas";
        String s2 = "PerScholas";
        String s3 = new String("PerScholas");
        String s4 = "Teksystem";

        System.out.println("equals() Method Example");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false
        System.out.println();
    }

    static void doubleEqualSignsOperatorMethod() {

        String s1 ="Perscholas";
        String s2 ="Perscholas";
        String s3 = new String("Perscholas");

        System.out.println("== Operator Method Example");
        System.out.println(s1 == s2);//true (because both refer to same instance)
        System.out.println(s1 == s3);//false(because s3 refers to instance created in nonpool)
        System.out.println();
    }

    static void compareToMethod2() {

        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = "Perschola";
        String s4 = "PerscholasX";

        System.out.println("compareTo() Method2 Example");
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )
    }
}