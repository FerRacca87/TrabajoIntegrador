
package trabajointegrador;

//@author Fernando Racca
 
public class Equipo {
    
    private String nombre, descripcion;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    public Equipo(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

}
