import java.util.Scanner;

class Question10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string value:");
        String str = sc.nextLine();
        String reverse = "";
        for (int i =str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("It is a palidrome");
            } else {
                System.out.println("It is not a palidrome");
            }

            sc.close();
        }
    }
