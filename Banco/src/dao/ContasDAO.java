package dao;

import java.util.ArrayList;
import java.util.List;
import model.ContaBancaria;

public class ContasDAO {
    private List<ContaBancaria> lista = null;

    public ContasDAO() {
        lista = new ArrayList<ContaBancaria>();
    }
    
    public void inserirConta(ContaBancaria conta){
        lista.add(conta);
    }
    
    public ContaBancaria buscarConta(int numero){
        ContaBancaria cont = null;
        for(ContaBancaria c : lista){
            if(c.getNumero() == numero){
                cont = c;
            }
        }
        return cont;
    }
    
    public void alterarConta(ContaBancaria conta){
        ContaBancaria cont = buscarConta(conta.getNumero());
        if(cont != null){
            int idx = lista.indexOf(cont);
            lista.set(idx, conta);
        }
    }
    
    public void removerConta(int numero){
        for(ContaBancaria c : lista){
            if(c.getNumero() == numero){
                lista.remove(c);
            }
        }
    }
    
    public List<ContaBancaria> todasContas(){
        return lista;
    }
}
