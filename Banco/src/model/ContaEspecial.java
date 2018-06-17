package model;

public class ContaEspecial extends ContaBancaria{
    private float limiteCheque;

    public ContaEspecial() {
    }

    public ContaEspecial(float limiteCheque, int numero, int agencia, float saldo, String senha, Cliente cliente) {
        super(numero, agencia, saldo, senha, cliente);
        this.limiteCheque = limiteCheque;
    }
    
    @Override
    public void setSaldo(){
        if(getCliente().getRenda() <= 800){
            setSaldo(((25 / 100) * getCliente().getRenda()) + limiteCheque);
        }else if((getCliente().getRenda() > 800) && (getCliente().getRenda() <= 1700)){
            setSaldo(((53 / 100) * getCliente().getRenda()) + limiteCheque);
        }else if(getCliente().getRenda() > 1700){
            setSaldo(1000 + limiteCheque);
        }
    }

    public float getLimiteCheque() {
        return limiteCheque;
    }

    public void setLimiteCheque(float limiteCheque) {
        this.limiteCheque = limiteCheque;
    }
}
