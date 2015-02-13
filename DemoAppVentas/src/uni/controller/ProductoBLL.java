package uni.controller;

import java.util.List;
import uni.dao.ProductoDAO;
import uni.entity.ProductoDTO;

public class ProductoBLL {

    // atributos
    private ProductoDAO dao;

    // constructor
    public ProductoBLL() {
        dao = new ProductoDAO();
    }

    // metodos de negocio
    public List<ProductoDTO> ProductosTodo() throws Exception {
        return dao.readAll();
    }
    
     public List<ProductoDTO> ProductosPorNombre(Object x) throws Exception {
        return dao.getAll(x);
    }
     
     public List<ProductoDTO> ProductosPorLinea(Object x) throws Exception {
        return dao.getAllforLinea(x);
    }
     
     
    public void ProductoAdicional(ProductoDTO o) throws Exception{
    dao.create(o);
    }
    
    
    public void ProductoActualizar(ProductoDTO o) throws Exception{
    dao.update(o);
    }
    
    public void ProductoEliminar(ProductoDTO o) throws Exception{
    dao.delete(o);
    }
    
    public ProductoDTO ProductoBuscar(String x) throws Exception{
    return dao.find(x);
    }
    
    

}
