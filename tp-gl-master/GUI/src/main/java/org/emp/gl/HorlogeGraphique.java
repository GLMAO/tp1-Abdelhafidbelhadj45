package org.emp.gl;

import org.emp.gl.timer.service.TimerChangeListener;
import org.emp.gl.timer.service.TimerService;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;

public class HorlogeGraphique extends JFrame implements TimerChangeListener {

    private final JLabel heureLabel;
    private final TimerService timerService;

    public HorlogeGraphique(TimerService timerService) {
        this.timerService = timerService;
        this.timerService.addTimeChangeListener(this);

        // Configuration de la fenêtre
        setTitle("Horloge Graphique");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label d’affichage de l’heure
        heureLabel = new JLabel("00:00:00", SwingConstants.CENTER);
        heureLabel.setFont(new Font("Consolas", Font.BOLD, 36));
        add(heureLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void afficherHeure() {
        String heure = String.format("%02d:%02d:%02d",
                timerService.getHeures(),
                timerService.getMinutes(),
                timerService.getSecondes());
        heureLabel.setText(heure);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (TimerChangeListener.SECONDE_PROP.equals(evt.getPropertyName())) {
            SwingUtilities.invokeLater(this::afficherHeure);
        }
    }

    @Override
    public void propertyChange(String prop, Object oldValue, Object newValue) {

    }
}
