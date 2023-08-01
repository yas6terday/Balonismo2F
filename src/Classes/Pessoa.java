package Classes;

public class Pessoa {
    private String nome;
    private String CPF;
    private String RG;
    private int telefone;
    private int emergencia;
    private String assinaturaTermo;
    private String endereco;


    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getCPF(){
        return CPF;
    }

    public void setRG(String RG){
        this.RG = RG;
    }
    public String getRG(){
        return RG;
    }

    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public int getTelefone(){
        return telefone;
    }

    public void setEmergencia(int emergencia){
        this.emergencia = emergencia;
    }
    public int getEmergencia(){
        return emergencia;
    }

    public void setAssinaturaTermo(String assinaturaTermo){
        this.assinaturaTermo = assinaturaTermo;
    }
    public String getAssinaturaTermo(){
        return assinaturaTermo;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return endereco;
    }


    public String Embarcado(){
        return "Embarcado";
    }
}