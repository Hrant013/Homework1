public class Homework30 {
    public static void main(String[] args){

        int a = 4, b = 8, c = 12;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else System.out.println(c);
        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else if (c > a && c < b || c < a && c > b) {
            System.out.println(c);
        }
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < a && b < c) {
            System.out.println(b);
        } else System.out.println(c);
    }
}