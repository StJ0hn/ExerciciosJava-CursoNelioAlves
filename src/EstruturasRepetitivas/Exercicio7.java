package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            double numberOne = sc.nextInt();
            double numberTwo = sc.nextInt();
            double division = numberOne/numberTwo;
            if (numberTwo == 0) {
                System.out.println("divisao impossivel");
            }
            else{
                System.out.printf("%.1f %n", division);
            }
        }
    }
}
