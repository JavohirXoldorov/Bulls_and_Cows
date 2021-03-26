import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(area(a, b, c));
    }

    public static double area(int a, int b, int c) {
        double halfP = (a + b + c) / 2.0;
        return (Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c)));
    }
}