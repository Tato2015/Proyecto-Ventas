
package controller;

import dao.EmpleadoDAO;
import entity.EmpleadoDTO;
import java.util.List;


public class EmpleadoBLL {

      //atributo
    private EmpleadoDAO dao;
    
    
    public EmpleadoBLL() {
    dao = new EmpleadoDAO();    
    }
    
   //metodos de negocio
    
    public List<EmpleadoDTO> EmpleadosTodo()throws Exception{
        return dao.readAll();
    }
    
    public void EmpleadosAdicionar(EmpleadoDTO e)throws Exception{
     dao.create(e);
    }
    
    public void EmpleadoActualizar(EmpleadoDTO e)throws Exception{
    dao.update(e);
    }
    
    public void EmpleadoEliminar(EmpleadoDTO e)throws Exception{
    dao.delete(e);
    }
    
    public void EmpleadoBuscar(EmpleadoDTO x)throws Exception{
    dao.find(x);
    }
    
    
    
}
