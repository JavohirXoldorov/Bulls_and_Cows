import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num1 = str.charAt(0)+str.charAt(1)+str.charAt(2)-48*3;
        int num2 = str.charAt(str.length()-1)+str.charAt(str.length()-2)+str.charAt(str.length()-3)-48*3;
        if(num1 == num2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}