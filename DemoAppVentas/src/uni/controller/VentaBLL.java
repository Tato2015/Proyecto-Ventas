package uni.controller;

import uni.dao.VentaDAO;
import uni.entity.VentaDTO;

public class VentaBLL {
    
    private VentaDAO oventa;
    
    public VentaBLL(){
    oventa = new VentaDAO();
    }
    
    // metodo
    
    public int registraVenta(VentaDTO reg)throws Exception{
    return oventa.registraVenta(reg);
    }
    
    
}
