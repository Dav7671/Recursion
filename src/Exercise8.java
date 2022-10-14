public class Exercise8 {
    public static void main(String[] args) {

        int decimal = 124;
        System.out.println("Binary =  " + decimalToBinary(decimal));
    }

    static int decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return 0;
        } else {

            return (decimalNumber % 2 + 10 *
                    decimalToBinary(decimalNumber / 2));
        }
    }
}
