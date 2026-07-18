package ListaEx;

import java.util.Scanner;

public class Exo3 {
     static void exibirTabuada(int numero){
         for(int i=0;i<=10;i+=1){
             System.out.println(numero+"*"+i+"= "+(numero*i));
         }
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********Tabuada de multiplicação*********\n");
        System.out.print("Digite um nùmero:");
        int numero= sc.nextInt();
        System.out.println("Tabuada de "+numero+" :");
        exibirTabuada(numero);
    }
}
