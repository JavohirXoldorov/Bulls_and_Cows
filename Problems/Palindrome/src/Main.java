import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean isPalindrom = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) System.out.println("yes");
        else System.out.println("no");
    }
}