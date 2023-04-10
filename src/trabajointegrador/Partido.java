package trabajointegrador;

//@author Fernando Racca
public class Partido {

    private Equipo equipo1, equipo2;
    private int golesEquipo1, golesEquipo2;

    private ResultadoEnum resultado;

    public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public Partido() {
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public ResultadoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoEnum resultado) {
        this.resultado = resultado;
    }
    
    

    public void decidirResultado() {
        if (this.golesEquipo1 > this.golesEquipo2) {
            this.resultado = ResultadoEnum.GANA_EQUIPO_1;
        } else if (this.golesEquipo1 < this.golesEquipo2) {
            this.resultado = ResultadoEnum.GANA_EQUIPO_2;
        } else {
            this.resultado = ResultadoEnum.EMPATE;
        }
    }

}
