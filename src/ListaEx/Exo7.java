package ListaEx;

import java.util.Scanner;

public class Exo7 {
     static boolean ehPar(int numero){
       return (numero%2==0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um Nùmero:");
        int num= sc.nextInt();
        System.out.println(ehPar(num));
        if(ehPar(num)){
            System.out.println(num+" é PAR!");
        }else {
            System.out.println(num+" é IMPAR!");
        }

        }
    }

