package EstruturasSequenciais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int workerNumber = sc.nextInt();
        int hoursWorked = sc.nextInt();
        double salaryPerHour = sc.nextDouble();
        double salaryTotal = hoursWorked * salaryPerHour;
        System.out.printf("NUMBER = %d%n", workerNumber);
        System.out.printf("SALARY: U$ %.2f%n", salaryTotal);
        sc.close();
    }
}
