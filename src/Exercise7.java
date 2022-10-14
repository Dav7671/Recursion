public class Exercise7 {
    public static void main(String[] args) {
        int a = 2;
        int e = 3;
        System.out.println(a + "^" + e + " = " + power(a,e));

    }

    public static int power(int b,int e)
    {
        if(e==0) {
            return 1;
        }
        else {
            return (b * power(b, e - 1));
        }
    }
}
