package org.emp.gl.core.launcher;

import org.emp.gl.clients.CompteARebour;
import org.emp.gl.clients.Horloge;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;
import org.emp.gl.timer.service.TimerService;

public class Horlogesss {

    public static void main(String[] args) {

        testDuTimeService();
    }

    private static void testDuTimeService() {
        TimerService timerService=new DummyTimeServiceImpl();
        Horloge horloge1 = new Horloge("hologe 1",timerService) ;
        Horloge horloge2 = new Horloge("hologe 2",timerService) ;
        Horloge horloge3 = new Horloge("hologe 3",timerService) ;
        Horloge horloge4 = new Horloge("hologe 4",timerService) ;


    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
