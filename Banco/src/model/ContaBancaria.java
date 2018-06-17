package model;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private float saldo;
    private String senha;
    private Cliente cliente;

    public ContaBancaria() {
    }

    public ContaBancaria(int numero, String agencia, String senha, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.senha = senha;
        this.cliente = cliente;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += "Número: " + numero;
        str += "Agência: " + agencia;
        str += "Saldo: " + saldo;
        str += "CPF: " + cliente.getCPF();
        str += "Nome: " + cliente.getNome();
        return str;
    }
    
    public void setSaldo(){
        if(cliente.getRenda() <= 800){
            saldo = (25 / 100) * cliente.getRenda();
        }else if((cliente.getRenda() > 800) && (cliente.getRenda() <= 1700)){
            saldo = (53 / 100) * cliente.getRenda();
        }else if(cliente.getRenda() > 1700){
            saldo = 1000;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public boolean validaConta(){
        return numero > 0 &&
               !agencia.equals("    -  ") &&
               !senha.equals("");
    }
}
