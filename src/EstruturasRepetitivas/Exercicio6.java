package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            double value1 = sc.nextDouble();
            double value2 = sc.nextDouble();
            double value3 = sc.nextDouble();
            double avarage = ((value1 * 2) + (value2 * 3)  + (value3 * 5)) / 10;
            System.out.printf("%.1f %n", avarage);
        }
        sc.close();
    }
}
