package org.emp.gl.clients;

import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

import java.beans.PropertyChangeEvent;

public class CompteARebour implements TimerChangeListener {
    int Compteur;
    String name;
    TimerService timerService ;

    public CompteARebour(int Compteur,String name,TimerService timerService){
        this.Compteur=Compteur;
        this.name = name;
        this.timerService = timerService;
        this.timerService.addTimeChangeListener(this);
        System.out.println("Le Compteur "+name + " est initialisée !");
    }


    public void propertyChange(String prop, Object oldValue, Object newValue) {
        if(prop.equals(this.SECONDE_PROP) && this.Compteur>0) {
            this.Compteur -= 1;
            System.out.println("Compteur "+this.name+"= " + this.Compteur);
        }
        if(this.Compteur==0) {
            this.timerService.removeTimeChangeListener(this);
            System.out.println("Compteur "+this.name+"  est desincrie" );
        }


    }



    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getPropertyName().equals(this.SECONDE_PROP) && this.Compteur>0) {
            this.Compteur -= 1;
            System.out.println("Compteur "+this.name+"= " + this.Compteur);
        }
        if(this.Compteur==0) {
            this.timerService.removeTimeChangeListener(this);
            System.out.println("Compteur "+this.name+"  est desincrie" );
        }
    }
}
