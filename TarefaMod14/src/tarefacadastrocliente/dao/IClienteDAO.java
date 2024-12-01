/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tarefacadastrocliente.dao;

import java.util.Collection;
import tarefamod14.Cliente;

/**
 *
 * @author moham
 */
public interface IClienteDAO {
    
        public Boolean cadastrar(Cliente cliente);
        public Boolean excluir(Long cpf);
        public void alterar(Cliente cliente);
        public Cliente consultar(Long cpf);
        public Collection <Cliente> buscarTodos() ;
    
}
