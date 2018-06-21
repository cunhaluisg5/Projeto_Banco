package model;

public class ContaEspecial extends ContaBancaria{
    private final double limiteCheque = 300;

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(int numero, String agencia, String senha, Cliente cliente) {
        super(numero, agencia, senha, cliente);
    }
    
    @Override
    public void setSaldo(){
        super.setSaldo();
        double valor = super.saldo;
        this.saldo = valor + limiteCheque;
    }

    public double getLimiteCheque() {
        return limiteCheque;
    }
}
