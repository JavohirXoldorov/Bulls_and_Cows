import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, num, ans = 0;
        boolean f = false;
        while (true) {
            num = sc.nextInt();
            sum += num;
            if (num == 0) {
                ans = sum;
                f = true;
                break;
            }
            if (sum >= 1000) {
                break;
            }
        }
        if (!f) ans = sum - 1000;
        System.out.println(ans);
    }
}