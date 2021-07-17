/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendariotorneo;

/**
 *
 * @author Jhona
 */
public class Jornada {
    Partido[] match= new Partido[6];

    public Jornada() {
        this.match=null;
    }

public void insertarPartidoEnJornada(Partido p1,Partido p2,Partido p3,Partido p4,Partido p5, Partido p6){
     this.match[0]=p1;
     this.match[1]=p2;
     this.match[2]=p3;
     this.match[3]=p4;
     this.match[4]=p5; 
     this.match[5]=p6;
}
    
           
}
