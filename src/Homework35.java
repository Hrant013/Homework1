public class Homework35 {
    public static void main(String[] args) {

        boolean x = false;
        int a = 2, b = 2, c = 8, d = 12;

        if (a + b + c == d || a + b + d == c || b + d + c == a || a + d + c == b) {
            x = true;
            System.out.println(x);
        }else System.out.println(x);

    }
}
