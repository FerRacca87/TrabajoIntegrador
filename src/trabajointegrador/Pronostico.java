
package trabajointegrador;

//@author Fernando Racca
 
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
    
    
    
    
    
    
    public static int calcularPuntajePronostico(Partido partido, Pronostico pronostico){
        int puntaje = 0;
        if(partido.getResultado() == pronostico.getResultado()){
            puntaje += 1;
        }
        return puntaje;
    }
    
    

}
