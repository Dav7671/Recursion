public class Exercise5 {
    public static void main(String[] args) {
        Reverse(90832);
    }

    public static void Reverse(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            Reverse(num / 10);
        }
    }
}
