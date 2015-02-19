package uni.controller;

import java.util.List;
import uni.dao.ClienteDAO;
import uni.entity.ClienteDTO;


public class ClienteBLL {
    
    ClienteDAO cli = new ClienteDAO();
    
    public List<ClienteDTO>ListarClientes(){
    return cli.listar();            
    }
}
