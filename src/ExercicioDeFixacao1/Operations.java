package ExercicioDeFixacao1;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount newAccount;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.next();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            newAccount = new BankAccount(holder, number, initialDeposit);
        }
        else {
            newAccount = new BankAccount(number, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(newAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        newAccount.depositOperation(depositValue);
        System.out.println("Updated account data:");
        System.out.println(newAccount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        newAccount.withdrawMoney(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(newAccount);

        sc.close();
    }
}
