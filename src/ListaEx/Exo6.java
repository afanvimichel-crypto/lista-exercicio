package ListaEx;

import java.util.Scanner;

public class Exo6 {
   static double calcularMedia(double n1, double n2, double n3){
        return ((n1+n2+n3)/3);
    }
     static void exibirSituacao(double media){
        if(media>=6){
            System.out.println("APPROVADO(A)");
        }else {
            System.out.println("REPROVADO(A)");
        }

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("****Digite três notas****");
    System.out.print("nota 1:");
    double nota1= sc.nextDouble();
    System.out.print("nota 2:");
    double nota2= sc.nextDouble();
    System.out.print("nota 3:");
    double nota3= sc.nextDouble();
    double media=calcularMedia(nota1,nota2,nota3);
    System.out.println("A media é: "+media);
    exibirSituacao(media);

}
}
