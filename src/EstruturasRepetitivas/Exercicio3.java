package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        int choice = sc.nextInt();
        while (choice != 4){
            if (choice == 1){
                alcohol += 1;
            }
            else if (choice == 2) {
                gasoline += 1;
            }
            else if (choice == 3){
                diesel += 1;
            }
            choice = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO \n" +
                           "Alcool: " + alcohol + "\n" +
                           "Gasolina: " + gasoline + "\n" +
                           "Diesel: " + diesel);
        sc.close();
    }
}
