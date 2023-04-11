
package trabajointegrador;

//@author Fernando Racca

import java.io.IOException;
import static java.nio.file.Files.readAllLines;
import java.nio.file.Path;

 
public class Pronostico {
    
    private Partido partido;
    private ResultadoEnum resultado;

    public Pronostico() {
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }
    
    
    
    /*public ResultadoEnum resultadoPronostico(Path tabla) throws IOException{
        for(String linea : readAllLines(tabla)){
            
        }
        
        
        return resultado;
    }*/
    
    
    public static int calcularPuntajePronostico(int puntaje, Partido partido, Pronostico pronostico){
        if(partido.getResultado() == pronostico.getResultado()){
            puntaje += 1;
        }
        return puntaje;
    }
    
    

}
