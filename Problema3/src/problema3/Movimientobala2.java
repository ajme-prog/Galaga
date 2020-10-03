/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import static problema3.Ventanaprincipal.muerte2;
import static problema3.Ventanaprincipal.navej1;
import static problema3.Ventanaprincipal.navej2;
import static problema3.Ventanaprincipal.rect1;
import static problema3.Ventanaprincipal.rect2;
import static problema3.Ventanaprincipal.sedisparo1;
import static problema3.Ventanaprincipal.x1;
import static problema3.Ventanaprincipal.y1;

/**
 *
 * @author bruno
 */
public class Movimientobala2 extends Thread {

    //constantes de movimiento
    private final int MOVIMIENTO_ARRIBA = 1;
  

    @Override
    public void run() {
        while (true) {
          
            switch (Ventanaprincipal.movimientobala2) {
                // 0 arriba - 1 abajo
                case MOVIMIENTO_ARRIBA:
                 if (muerte2 == false) {
                        disparo(navej2.getX() + 30, 2);
                    }
                    break;
              
            }
        
              try {
                this.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimientobala2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    
    
        private void disparo(int posicionX, int numeronave) {

        JLabel disparo1 = new JLabel();
        //  rectangulo3=new Rectangle();
        ImageIcon d = new ImageIcon(getClass().getResource("/Imagenes/boladefuego.png"));
        Icon icono3 = new ImageIcon(d.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        disparo1.setIcon(icono3);
        disparo1.setBounds(800, 200, 40, 40);
        disparo1.setVisible(false);
        Ventanaprincipal.jlfondo.add(disparo1);
        sedisparo1 = true;
        Disparo d2 = new Disparo(posicionX, disparo1);
        d2.numeronave = numeronave;
        d2.start();

    }

}
