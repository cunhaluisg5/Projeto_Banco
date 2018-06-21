package model;

public class ContaBancaria {
    private int numero;
    private String agencia;
    protected double saldo;
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
        String str = "\n" + numero + "\n" + agencia + "\n" + saldo + "\n" + cliente.getCPF() + 
                     "\n" + cliente.getNome() + "\n";
        return str;
    }
    
    public void setSaldo(){
        double valor = cliente.getRenda();
        if(valor <= 800){
            valor = valor * 0.25;
        }else if(valor > 800 && valor <= 1700){
            valor = valor * 0.53;
        }else{
            valor = 1000;
        }
        this.saldo = valor;
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

    public double getSaldo() {
        return saldo;
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
