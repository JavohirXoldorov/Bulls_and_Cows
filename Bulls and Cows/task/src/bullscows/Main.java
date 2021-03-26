package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        String len = sc.nextLine();
        if (stringToInt(len) <= 0) {
            System.out.println("Error: \"" + len + "\" isn't a valid number.");
        } else {
            System.out.println("Input the number of possible symbols in the code:");
            String symbolNumber = sc.nextLine();
            if (stringToInt(symbolNumber) <= 0) {
                System.out.println("Error: \"" + symbolNumber + "\" isn't a valid number.");
            } else {
                int lenght = stringToInt(len);
                int symbol = stringToInt(symbolNumber);
                if (lenght > symbol) {
                    System.out.println("Error: it's not possible to generate a code with a length of " + lenght + " with " + symbol + " unique symbols.");
                } else if (symbol > 36) {
                    System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
                } else {
                    System.out.print("The secret is prepared: ");
                    for (int i = 0; i < lenght; i++) {
                        System.out.print("*");
                    }
                    if (symbol > 10) System.out.println(" 0-9, " + "a - " + (char) (97 + symbol - 11));
                    else {
                        System.out.println(" 0-" + Integer.toString(symbol - 1));
                    }

                    System.out.println("Okay, let's start a game!");
                    int bull = 0, cow = 0, total = 0, count = 1;
                    String num = random(lenght, symbol);
                    while (bull != num.length()) {
                        System.out.println("Turn " + count++);
                        String code = sc.next();
                        for (int i = 0; i < num.length(); i++) {

                            if (num.charAt(i) == code.charAt(i))
                                bull++;
                            for (int j = 0; j < num.length(); j++) {
                                if (num.charAt(j) == code.charAt(i)) {
                                    total++;
                                    break;
                                }
                            }
                        }
                        cow = total - bull;
                        boolean isContinue = false;
                        if (bull == num.length()) {
                            System.out.println(bull + " bulls");
                            System.out.println("Congratulations! You guessed the secret code.");
                            break;
                        }
                        System.out.println("Grade: " + bull + " bulls and " + cow + " cow");
                        bull = 0;
                        total = 0;

                    }
                }
            }
        }
    }

    public static String random(int len, int symbolNumber) {
        Random randomIndex = new Random();
        char vec[] = new char[symbolNumber];
        int numD = 48, letC = 97;
        for (int i = 0; i < symbolNumber; i++) {
            if (i <= 9) {
                vec[i] = (char) (numD++);
            } else {
                vec[i] = ((char) letC++);
            }
        }
        String ans = "";
        while (ans.length() != len) {
            int randomIn = randomIndex.nextInt(symbolNumber);
            if (vec[randomIn] != '*') {
                ans = ans.concat(Character.toString(vec[randomIn]));
                vec[randomIn] = '*';
            }
        }
        return ans;
    }

    public static int stringToInt(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - 48 >= 0 && str.charAt(i) - 48 <= 9) {
                num *= 10;
                num += (int) (str.charAt(i) - 48);
            } else {
                return -1;
            }
        }
        return num;
    }
}
