package EstruturasSequenciais;

import java.util.Scanner;

public class Exercicio5 {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);
        int codeOne = sc.nextInt();
        int numberOne = sc.nextInt();
        double unityValueOne = sc.nextDouble();
        double totalValueOne = numberOne * unityValueOne;

        int codeTwo = sc.nextInt();
        int numberTwo = sc.nextInt();
        double unityValueTwo = sc.nextDouble();
        double totalValueTwo = numberTwo * unityValueTwo;

        double totalValue = totalValueOne + totalValueTwo;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalValue);
        sc.close();
    }
}
