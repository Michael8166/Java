import java.util.Scanner;

class Question9 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("It is a palidrome");
            } else {
                System.out.println("It is not a palidrome");
            }
            sc.close();
        }
    }