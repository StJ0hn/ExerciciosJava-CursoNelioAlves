package EstruturasSequenciais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double ray = sc.nextDouble();
        sc.nextLine();
        double pi = Math.PI;
        double area = pi * (ray*ray);
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
