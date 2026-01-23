package Arrays;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("How many numbers you are going type? ");
        int n = sc.nextByte();
        int[] vect = new int[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextByte();;
        }
        System.out.println("NEGATIVE NUMBERS");
        for (int i = 0; i < n; i++) {
            if (vect[i] < 0){
                System.out.printf("%d%n", vect[i]);
            }
        }
        sc.close();
    }
}
