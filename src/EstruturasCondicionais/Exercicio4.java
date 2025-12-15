package EstruturasCondicionais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int startHour = sc.nextInt();
        int endHour = sc.nextInt();
        int duration;
        if (startHour < endHour){
            duration = endHour - startHour;
        }
        else {
            duration = 24 - startHour + endHour;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)", duration);
    }
}
