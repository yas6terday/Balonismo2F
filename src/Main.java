import Classes.Balao;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);

        b1.setId();
        b1.setRegistro();
        b1.setCor();
        b1.setTipo();
        b1.setCapacidade();
        b1.setAltura();
        b1.setPorte();
        b1.setPeso();

        Scanner tcd = new Scanner(System.in);

        Balao b2 = new Balao();
        System.out.println("Digite o ID, o Registro, a cor, o tipo, a Capacidade, a Altura máxima, o Porte e o Peso máximo permito do balão");
        b2.setId();
        b2.setRegistro();
        b2.setCor();
        b2.setTipo();
        b2.setCapacidade();
        b2.setAltura();
        b2.setPorte();
        b2.setPeso();
    }
}
