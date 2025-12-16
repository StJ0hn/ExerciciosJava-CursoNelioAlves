package EstruturasRepetitivas;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int counterIn = 0;
        int counterOut = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                counterIn += 1;
            }
            else {
                counterOut += 1;
            }
        }
        System.out.printf("%d in %n", counterIn);
        System.out.printf("%d out %n", counterOut);
        sc.close();
    }
}
