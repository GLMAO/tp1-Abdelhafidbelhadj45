package org.emp.gl.core.launcher;

import org.emp.gl.HorlogeGraphique;
import org.emp.gl.clients.CompteARebour;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerService;

public class Compteur {

    public static void main(String[] args) {

        testDuTimeService();
    }

    private static void testDuTimeService() {
        TimerService timerService=new DummyTimeServiceImpl();


       CompteARebour cp1=new CompteARebour(10,"Compteur 1",timerService);
        CompteARebour cp2=new CompteARebour(20,"Compteur 2",timerService);
        CompteARebour cp3=new CompteARebour(15,"Compteur 3",timerService);
        CompteARebour cp4=new CompteARebour(12,"Compteur 4",timerService);
        CompteARebour cp5=new CompteARebour(17,"Compteur 5",timerService);
        CompteARebour cp6=new CompteARebour(11,"Compteur 6",timerService);
        CompteARebour cp7=new CompteARebour(13,"Compteur 7",timerService);
        CompteARebour cp8=new CompteARebour(16,"Compteur 8",timerService);
        CompteARebour cp9=new CompteARebour(18,"Compteur 9",timerService);
        CompteARebour cp10=new CompteARebour(19,"Compteur 10",timerService);
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
