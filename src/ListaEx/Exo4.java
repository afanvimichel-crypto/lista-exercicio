package ListaEx;

import java.util.Scanner;

public class Exo4 {
   static void analisarSenha(String senha){
        if(senha.length()<6){
            System.out.println("SENHA FRACA");
        } else if (senha.length()<9) {
            System.out.println("SENHA MEDIA");

        }else {
            System.out.println("SENHA FORTE");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Informe sua sanha:");
        String mPass=sc.nextLine();
        analisarSenha(mPass);

    }
}
