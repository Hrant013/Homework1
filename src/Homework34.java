public class Homework34 {
    public static void main(String[] args) {

        boolean x = false;
        int a = 2, b = 4, c = 6, d = 20;

        if (a + b == c + d || a + c == b + d || a + d == b + c) {
            x = true;
            System.out.println(x);
        } else System.out.println(x);
    }
}
