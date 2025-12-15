package EstruturasSequenciais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstValue = sc.nextInt();
        sc.nextLine();
        int secondValue = sc.nextInt();
        int sum = firstValue + secondValue;
        System.out.printf("SOMA = %d%n", sum);
        sc.close();
    }
}