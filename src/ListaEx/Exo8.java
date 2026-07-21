package ListaEx;

import java.util.Scanner;

public class Exo8 {
    static int maiorDeTres(int a, int b, int c){
       if(a>b && a>c){
           return a;
       }else if(b>a && b>c){
           return b;
       }else {
           return c;
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite três Nùmeros");
        System.out.print("N1:");
        int num1= sc.nextInt();
        System.out.print("N2:");
        int num2= sc.nextInt();
        System.out.print("N3:");
        int num3= sc.nextInt();
        System.out.println("O maior valor digitou é: "+maiorDeTres(num1,num2,num3));

    }
}
