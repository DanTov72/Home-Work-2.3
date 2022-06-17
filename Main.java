import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);
        System.out.println("Hello");

        while (true) {
            System.out.println("\nBalance: " + bankAccount.getAmount());
            System.out.println("\n" + "Enter the amount you want to withdraw");
            Scanner scanner = new Scanner(System.in);
            int with = scanner.nextInt();
            try {
                bankAccount.withDraw(with);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

            }

        }
    }

}