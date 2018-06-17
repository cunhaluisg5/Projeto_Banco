package model;

public class ContaBancaria {
    private int numero;
    private int agencia;
    private float saldo;
    private String senha;
    private Cliente cliente;

    public ContaBancaria() {
    }

    public ContaBancaria(int numero, int agencia, float saldo, String senha, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
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
    
    private void setSaldo(){
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

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
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
}
