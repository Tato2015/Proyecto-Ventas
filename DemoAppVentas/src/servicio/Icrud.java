package servicio;

import java.util.List;

public interface Icrud<T> {
    
    
    //definir las firmas
    
    void create(T t)throws Exception;
    
    void update(T t)throws Exception;
    
    void delete(T t)throws Exception;
    
    T find(T t)throws Exception;
    
    List<T>readAll()throws Exception;
    
    List<T>getAll(Object t)throws Exception;
    
}
