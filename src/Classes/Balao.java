package Classes;

import java.util.Scanner;
public class Balao {

    private int id;
    private String registro;
    private String cor;
    private String tipo;
    private int capacidade;
    private double altura;
    private String porte;
    private double peso;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String voar(){
        return "voando";
    }

    public void registroBalao(){
        System.out.println("Digite o id, o registro, a cor, o tipo, a capacidade, a altura, o porte e o peso suportado pelo balão:");
        Scanner tcd = new Scanner(System.in);
        this.id = tcd.nextInt();
        this.registro = tcd.next();
        this.cor= tcd.next();
        this.tipo = tcd.next();
        this.capacidade = tcd.nextInt();
        this.altura = tcd.nextDouble();
        this.porte = tcd.next();
        this.peso = tcd.nextDouble();
        System.out.println("id: " + this.id + " Registro: " + this.registro + " Cor: " + this.cor + " Tipo: " + this.tipo + " Capacidade Máxima: " + this.capacidade
         + " Altura Máxima: " + this.altura + " Porte: " + this.porte + " Peso Máximo: " + this.peso );
    }

        public void registradoBalao(){
        System.out.println("Balão já registrado");
        this.id = 254554;
        this.registro = "sfsdf";
        this.cor = "azul";
        this.tipo = "comum";
        this.capacidade = 5;
        this.altura = 100.00;
        this.porte = "grande";
        this.peso = 110.00;
         System.out.println("id: " + this.id + " Registro: " + this.registro + " Cor: " + this.cor + " Tipo: " + this.tipo + " Capacidade Máxima: " + this.capacidade
         + " Altura Máxima: " + this.altura + " Porte: " + this.porte + " Peso Máximo: " + this.peso );
    }
    }
