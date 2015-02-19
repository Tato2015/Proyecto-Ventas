package uni.entity;

import java.util.List;

public class VentaDTO {

    private int idventa;
    private String idcliente;
    private String idempleado;
    private String tipodoc;
    private String nrodoc;
    private double total;
    private List<DetalleDTO>detalle;
    
    //constructor

    public VentaDTO() {
    }

    public VentaDTO(int idventa, String idcliente, String idempleado, String tipodoc, String nrodoc, double total, List<DetalleDTO> detalle) {
        this.idventa = idventa;
        this.idcliente = idcliente;
        this.idempleado = idempleado;
        this.tipodoc = tipodoc;
        this.nrodoc = nrodoc;
        this.total = total;
        this.detalle = detalle;
    }
    
     public List<DetalleDTO> getDetalle() {
        return detalle;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNrodoc() {
        return nrodoc;
    }

    public void setNrodoc(String nrodoc) {
        this.nrodoc = nrodoc;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


    public void setDetalle(List<DetalleDTO> detalle) {
        this.detalle = detalle;
    }
    
    
}
