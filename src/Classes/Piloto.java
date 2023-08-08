package Classes;

public class Piloto {
    private String nome;
    private int CPF;
    private int registroAnac;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCPF(int CPF){
        this.CPF = CPF;
    }
    public int getCPF(){
        return CPF;
    }

    public void setRegistroAnac(String RG){
        this.registroAnac = registroAnac;
    }
    public int getRegistroAnac(){
        return registroAnac;
    }

    public String pilotando(){
        return "Pilotando";
    }
}