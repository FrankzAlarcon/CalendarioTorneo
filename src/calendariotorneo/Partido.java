
package calendariotorneo;

import java.util.Random;

/**
 * @author dell
 */
public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private int goles1,goles2;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.goles1 = 0;
        this.goles2 = 0;
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
    
    public void determinarResultados(){
        if(this.goles1==this.goles2){
            //Equipo 1
            this.equipo1.setPuntos(this.equipo1.getPuntos()+1); //Puntos
            this.equipo1.setGolesAfavor(this.equipo1.getGolesAfavor()+goles1); //Goles A Favor
            this.equipo1.setGolesEnContra(this.equipo1.getGolesEnContra()+goles2); // Goles En Contra
            this.equipo1.setPartidosEmpatados(this.equipo1.getPartidosEmpatados()+1); //Partidos Empatados
            this.equipo1.setDiferenciaDeGoles(this.equipo1.getGolesAfavor()-this.equipo1.getGolesEnContra()); //Goles en contra
            this.equipo1.setPartidosJugados(this.equipo1.getPartidosJugados()+1); //Partidos Jugados
            //Equipo2
            this.equipo2.setPuntos(this.equipo2.getPuntos()+1);
            this.equipo2.setGolesAfavor(this.equipo2.getGolesAfavor()+goles2);
            this.equipo2.setGolesEnContra(this.equipo2.getGolesEnContra()+goles1);
            this.equipo2.setPartidosEmpatados(this.equipo2.getPartidosEmpatados()+1);
            this.equipo2.setDiferenciaDeGoles(this.equipo2.getGolesAfavor()-this.equipo2.getGolesEnContra());
            this.equipo2.setPartidosJugados(this.equipo2.getPartidosJugados()+1);
            
           
        }else{
            if(this.goles1>goles2){
                
            }else{
               
            }
        }
    }
    
    public void jugarPartido(){
        generarResultado();
       
       
            
        }
    }
    
    

