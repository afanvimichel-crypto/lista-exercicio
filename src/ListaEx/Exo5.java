package ListaEx;

import java.util.Scanner;

public class Exo5 {
    static int somar(int a, int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite dois nùmeros");
        System.out.print("Nùmero 1:");
        int numA= sc.nextInt();
        System.out.print("Nùmero 2:");
        int numB= sc.nextInt();
        int toTal=somar(numA,numB);
        System.out.print("a soma é:");
        System.out.print(toTal);
    }
}
