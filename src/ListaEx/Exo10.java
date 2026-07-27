package ListaEx;

import java.util.Scanner;

public class Exo10 {
    static double aplicarDesconto(double valor, double percentual){
        return (valor-(valor*percentual/100));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Informe o valor Total:");
        double valorTotal=sc.nextDouble();
        System.out.print("informe o percentual applicado (em %):");
        double percentual=sc.nextDouble();
        System.out.println("valor final apòs desconto:R$ "+aplicarDesconto(valorTotal,percentual));

    }
}
