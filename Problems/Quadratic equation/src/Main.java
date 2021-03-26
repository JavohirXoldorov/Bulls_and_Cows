import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        solve(a, b, c);
    }

    public static void solve(double a, double b, double c) {
        double D = (b * b - 4 * a * c);
        double root1 = (-b - Math.sqrt(D)) / (2.0 * a);
        double root2 = (-b + Math.sqrt(D)) / (2.0 * a);
        if (root1 - root2 < 0.000000001) {
            System.out.println(root1 + " " + root2);
        } else {
            System.out.println(root2 + " " + root1);
        }
    }
}