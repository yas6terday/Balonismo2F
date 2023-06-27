import Classes.Balao;

public class Main {
    public static void main(String[] args) {

        //Construir balões

        Balao b1 = new Balao();
        String resultado = b1.voar();
        System.out.println(resultado);
        b1.id = 66666;
        b1.registro = "aleatorio";
        b1.cor = "vermelho";
        b1.tipo = "comum";
        b1.capacidade = 3;
        b1.altura = 100.00;
        b1.porte = "medio";
        b1.peso = 70;



    }
}