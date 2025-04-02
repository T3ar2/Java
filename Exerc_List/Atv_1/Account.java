import java.util.Scanner;

public class Account {

    private int account_num;
    private String account_user;
    private double account_balance;



//     Account(int account_num, String account_user, double account_balance){
//
//         this.account_balance = account_balance;
//        this.account_num = account_num;
//        this.account_user = account_user;
//    }

    public void setAccount_num(int account_num) {
        this.account_num = account_num;
    }

    public void setAccount_user(String account_user) {
        this.account_user = account_user;
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }


    public int getAccount_num(){
        return account_num;
    }
    public String getAccount_user(){
        return account_user;
    }
    public double getAccount_balance(){
        return account_balance;
    }


    public static void deposit(Scanner scanner, Account account) {

        System.out.println("How much you need deposit? ");
        double valor = scanner.nextDouble();
        valor = valor + account.getAccount_balance();
        account.setAccount_balance(valor);
        System.out.println("Deposit has been made. New balance is: " + account.getAccount_balance());

    }


    public static void withdraw(Scanner scanner, Account account) {


        System.out.println("How much you need withdraw? ");
        double withdraw = scanner.nextDouble();

        if (withdraw > account.getAccount_balance()) {
            System.out.println("You don't have money to withdraw ");
        } else {
            double some = account.getAccount_balance();
            double result = some - withdraw;
            account.setAccount_balance(result);
            System.out.println("Withdraw successful ");
        }
    }
}
