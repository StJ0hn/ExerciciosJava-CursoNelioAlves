package EstruturasSequenciais;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        double numberOne = sc.nextDouble();
        double numberTwo = sc.nextDouble();
        double numberThree = sc.nextDouble();
        double triangleArea = (numberOne * numberThree) / 2;
        double circleArea = Math.pow(numberThree, 2) * 3.14159; //numero PI;
        double trapeziusArea = ((numberOne + numberTwo) * numberThree) / 2;
        double squareArea = numberTwo * numberTwo;
        double retangleArea = numberOne * numberTwo;
        System.out.printf("TRIANGULO: %.3f %n" +
                          "CIRCULO: %.3f %n" +
                          "TRAPEZIO: %.3f %n" +
                          "QUADRADO: %.3f %n" +
                          "RETANGULO: %.3f %n", triangleArea, circleArea, trapeziusArea, squareArea, retangleArea);
        sc.close();
    }
}
