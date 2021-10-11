import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int number0fOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int number0fQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int number0fDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int number0fPennies = remainingAmount / 5;

        System.out.println("Your amount " + amount + " consist of");
        System.out.println(" " + number0fOneDollars + " dollars");
        System.out.println(" " + number0fQuarters + " quarters");
        System.out.println(" " + number0fDimes + " dimes");
        System.out.println(" " + number0fPennies + " pennies");
    }
}
