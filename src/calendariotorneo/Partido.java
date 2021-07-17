
package calendariotorneo;

import java.util.Random;

/**
 * @author dell
 */
public class Partido {
    private String equipo1;
    private String equipo2;
    private int goles1,goles2;

    public Partido(String equipo1, String equipo2, int goles1, int goles2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles1 = goles1;
        this.goles2 = goles2;
    }
    
     public Partido() {
        this.equipo1 = "";
        this.equipo2 = "";
        this.goles1 = 0;
        this.goles2 = 0;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGoles1() {
        return goles1;
    }

    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }

    public int getGoles2() {
        return goles2;
    }

    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }
    
    public void generarResultado(){
        int min=0,max=5;
        Random random1 = new Random();
        Random random2 = new Random();
        
        this.goles1= random1.nextInt(max+min)+min;
        this.goles2= random2.nextInt(max+min)+min;
    }
    
    public int determinarGanador(){
        if(this.goles1==this.goles2){
            return 0; //0 EMPATE
        }else{
            if(this.goles1>goles2){
                return 1;
            }else{
                return 2;
            }
        }
    }
    
    public void jugarPartido(String equipo1, String equipo2){
        generarResultado();
        
    }
    
}
