package Arrays;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you are going type? ");
        int n = sc.nextInt();
        sc.nextLine();
        double[] vect = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        System.out.printf("VALUES: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }
        System.out.println("");
        System.out.printf("SUM: %.1f%n",sum);
        System.out.printf("AVARAGE: %.1f", sum / n);
    }
}
