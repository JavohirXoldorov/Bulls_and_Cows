import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int  ans = 0, index = 0;
        while(true){
            index = str.indexOf(str2,index);
            if (index == -1){
                break;
            } else {
                index = index+str2.length();
            }

            ans++;
        }
        System.out.println(ans);
    }
}