package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

public class ClientesDAO {
    private List<Cliente> lista = null;

    public ClientesDAO() {
        lista = new ArrayList<Cliente>();
    }
    
    public void insereCliente(Cliente cliente){
        lista.add(cliente);
    }
    
    public Cliente buscaCliente(String CPF){
        Cliente cli = null;
        for(Cliente c : lista){
            if(c.getCPF().equals(CPF)){
                cli = c;
            }
        }
        return cli;
    }
    
    public void alterarCliente(Cliente cliente){
        Cliente cli = buscaCliente(cliente.getCPF());
        if(cli != null){
            int idx = lista.indexOf(cli);
            lista.set(idx, cliente);
        }
    }
    
    public void removerCliente(String CPF){
        for(Cliente c : lista){
            if(c.getCPF().equals(CPF)){
                lista.remove(c);
            }
        }
    }
    
    public List<Cliente> todosClientes(){
        return lista;
    }
}
