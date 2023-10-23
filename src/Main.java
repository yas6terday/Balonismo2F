import java.util.Scanner;

import Classes.Piloto;
import Classes.Balao;
import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
 Scanner tcd = new Scanner(System.in);
        int x =0;
        while  (x == 0){

            System.out.println("Bem vindo a agencia de balão, digite 1 se quiser adicionar um balão, digite 2 se quiser ver o balão já registrado, digite 3 se quiser registrar um piloto, digite 4 se quiser ver o piloto já regisrado, digite 5 se quiser registrar um passageiro, digite 6 se quiser ver o passsageiro já registrado");

             x = tcd.nextInt();

            if (x == 1){
                 Balao b1 = new Balao();
                 b1.registroBalao();
            }
            else if(x == 2){
                Balao b2 = new Balao();
                b2.registradoBalao();
            }
            else if (x == 3){
                Piloto p1 = new Piloto();
                p1.registroPiloto();
            }
            else if (x == 4){
                Piloto p2 = new Piloto();
                p2.registradoPiloto();
            }
            else if (x == 5){
                Pessoa pe1 = new Pessoa();
                pe1.registroPessoa();
            }
            else if (x == 6){
                Pessoa pe2 = new Pessoa();
                pe2.registradoPessoa();
            }

            System.out.println("Deseja continuar no Sistema? " + "0 para sim / 1 para não ");
             x = tcd.nextInt();
        }
        

   
}

}
