public class WhyCompareToMethodDiffers {

    public static void main(String[] args) {
//Don't understand why these methods return different answers
        compareToMethod();
        compareToMethod2();
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