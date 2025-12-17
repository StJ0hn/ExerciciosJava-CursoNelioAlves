package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int square;
        int cube;
        for (int i = 1; i <= N; i++) {
            square = i * i;
            cube = i * i * i;
            System.out.printf("%d %d %d %n",i, square, cube);
        }
        sc.close();
    }
}
