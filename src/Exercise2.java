public class Exercise2 {
    public static void main(String[] args) {

        System.out.println("Number 6 fibonacci = " + fibonacci(6));



    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
