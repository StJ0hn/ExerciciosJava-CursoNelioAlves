package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA = sc.nextInt();
        int numberB = sc.nextInt();
        if (numberB % numberA == 0 || numberA % numberB == 0){
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
}
