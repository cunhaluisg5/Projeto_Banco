package model;

public class Cliente {
    private String CPF;
    private String nome;
    private String endereco;
    private float renda;

    public Cliente() {
    }

    public Cliente(String CPF, String nome, String endereco, float renda) {
        this.CPF = CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.renda = renda;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
    
    public boolean validarCliente(){
        return !CPF.equals("") &&
               !nome.equals("") &&
               !endereco.equals("") &&
               renda > 0;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "\nCPF: " + CPF;
        str += "\nNome: " + nome;
        str += "\nEndereço: " + endereco;
        str += "\nRenda: " + renda;
        return str;
    }
}
