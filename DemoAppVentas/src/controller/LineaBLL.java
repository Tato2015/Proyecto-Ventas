package controller;

import dao.LineaDAO;
import entity.LineaDTO;
import java.util.List;

public class LineaBLL {
    
    // atributos
    private LineaDAO dao;
    
    // constructor

    public LineaBLL() {
        dao = new LineaDAO();
    }
    
    // metodos
    
    public List<LineaDTO>LineaListar()throws Exception{
    return dao.readAll();
    }
    
}
