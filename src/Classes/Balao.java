package Classes;

public class Balao {

    private int id;

    private String registro;

    private String cor;
    private String tipo;
    private int capacidade;
    private double altura;
    private String porte;
    private double peso;

    public void setId(){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setRegistro(){
        this.registro = registro;
    }
    public String getRegistro(){
        return registro;
    }

    public void setCor(){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    public void setTipo(){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }

    public void setCapacidade(){
        this.capacidade = capacidade;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public void setAltura(){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

    public void setPorte(){
        this.porte = porte;
    }
    public String getPorte(){
        return porte;
    }

    public void setPeso(){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }




    public String voar(){
        return "voando";
    }
}