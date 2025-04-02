import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        account.setAccount_num(1);
        account.setAccount_user("Notch");
        account.setAccount_balance(10.0);


        System.out.println("Deposit or Withdraw (D to deposit or W to Withdraw)? ");
        char selection = scanner.next().charAt(0);

        if ((selection == 'D') || (selection == 'd')) {
            System.out.println("Account number: " + account.getAccount_num());
            System.out.println("Account User: " + account.getAccount_user());
            System.out.println("Balance:  " + account.getAccount_balance());

            account.deposit(scanner, account);

            System.out.println("Account number: " + account.getAccount_num());
            System.out.println("Account User: " + account.getAccount_user());
            System.out.println("Balance:  " + account.getAccount_balance());

        } else if ((selection == 'W') || (selection == 'w')) {

            System.out.println("Account number: " + account.getAccount_num());
            System.out.println("Account User: " + account.getAccount_user());
            System.out.println("Balance:  " + account.getAccount_balance());

            account.withdraw(scanner, account);

            System.out.println("Account number: " + account.getAccount_num());
            System.out.println("Account User: " + account.getAccount_user());
            System.out.println("Balance:  " + account.getAccount_balance());
        }

    }



}
