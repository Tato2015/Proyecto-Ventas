package uni.controller;

import java.util.List;
import uni.dao.EmpleadoDAO;
import uni.entity.EmpleadoDTO;
import uni.entity.ProductoDTO;

public class EmpleadoBLL {

    //atributo
    private EmpleadoDAO dao;
    
    //constructor
    public EmpleadoBLL() {
    dao = new EmpleadoDAO();
    }
    
    // metodos de negocio
    
     public List<EmpleadoDTO> EmpleadosTodo() throws Exception {
        return dao.readAll();
    }
    
    
    public void EmpleadoAdicionar(EmpleadoDTO e) throws Exception{
    dao.create(e);
    }
        
    public void EmpleadoActualizar(EmpleadoDTO e) throws Exception{
    dao.update(e);
    }
    
    public void EmpleadoEliminar(EmpleadoDTO e) throws Exception{
    dao.delete(e);
    }
    
     public EmpleadoDTO EmpleadoBuscar(String x) throws Exception{
    return dao.find(x);
    }
    
    
    
    
    
    
    
}
