package dao;

import entity.ProductoDTO;
import java.util.ArrayList;
import java.util.List;
import servicio.Icrud;

public class ProductoDAO implements Icrud<ProductoDTO>{

    private List<ProductoDTO>lista;
    
    @Override
    public void create(ProductoDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(ProductoDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ProductoDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductoDTO find(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductoDTO> readAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductoDTO> getAll(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    // no hay metodo override porque no esta dentro de la interfaz
    public List<ProductoDTO>getAllforLinea(Object t)throws Exception{
    lista = new ArrayList<>();
        return lista;
    }
    
    
    
}
