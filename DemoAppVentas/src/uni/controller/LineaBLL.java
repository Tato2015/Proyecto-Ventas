package uni.controller;

import java.util.List;
import uni.dao.LineaDAO;
import uni.entity.LineaDTO;

public class LineaBLL {
    
      // atributos
    private LineaDAO dao;
    
    //constructor
    public LineaBLL() {
        dao = new LineaDAO();
    }

    //metodos
     
    public List<LineaDTO>LineaListar() throws Exception{
    return dao.readAll();
    }
    
    
    
}