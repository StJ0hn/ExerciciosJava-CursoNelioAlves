package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        int quantity = sc.nextInt();
        double price;
        if (code == 1){
            price = 4.00;
        }
        else if (code == 2) {
            price = 4.50;
        }
        else if (code == 3) {
            price = 5.00;
        }
        else if (code == 4) {
            price = 2.00;
        }
        else {
            price = 1.50;
        }
        System.out.printf("TOTAL: R$%.2f %n", price*quantity);
        sc.close();
    }
}
