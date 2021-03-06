package uni.entity;

public class LineaDTO {

    //atributos
    private int idlinea;
    private String nombre;

    //constructor
    public LineaDTO() {
    }

    public LineaDTO(int idlinea, String nombre) {
        this.idlinea = idlinea;
        this.nombre = nombre;
    }

    //metodos get y set
    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // redefinir metodo toString
    @Override
    public String toString() {
        return nombre;
    }

}
