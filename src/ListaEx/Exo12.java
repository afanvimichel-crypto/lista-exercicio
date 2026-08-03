package ListaEx;

import java.util.Scanner;

public class Exo12 {
    static long calcularFatorial(int n){
        int fat=1;
        for (int i=1;i<=n;i+=1){
            fat=fat*i;
        }
        return fat;
    }
   static void exibirFatorial(int n){
       System.out.println(" O Fatoriel de "+n+" é "+calcularFatorial(n));
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Digite um nùmero:");
       int valor= sc.nextInt();
       exibirFatorial(valor);
   }
}
