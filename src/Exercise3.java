public class Exercise3 {
    public static void main(String[] args) {

        String str = "CodeAcademy";
        System.out.println("Original string:  " + str  + " Reversed : " + reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }
        else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
}
