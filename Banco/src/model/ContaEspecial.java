package model;

public class ContaEspecial extends ContaBancaria{
    private float limiteCheque;

    public ContaEspecial() {
    }

    public ContaEspecial(float limiteCheque, int numero, String agencia, String senha, Cliente cliente) {
        super(numero, agencia, senha, cliente);
        this.limiteCheque = limiteCheque;
    }
    
    @Override
    public void setSaldo(){
        super.setSaldo();
        float valor = super.saldo;
        this.saldo = valor + limiteCheque;
    }

    public float getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(float limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
}
