public class Exercise4 {
    public static void main(String[] args) {

        countdown(4);
    }

    public static void countdown(int n) {
        if(n == 0){
            System.out.println("0");
        }
         else {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }
}
