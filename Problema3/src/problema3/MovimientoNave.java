/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import javax.swing.Timer;
import static problema3.Ventanaprincipal.muerte1;
import static problema3.Ventanaprincipal.navej1;
import static problema3.Ventanaprincipal.navej2;
import static problema3.Ventanaprincipal.rect1;
import static problema3.Ventanaprincipal.rect2;
import static problema3.Ventanaprincipal.x1;
import static problema3.Ventanaprincipal.y1;

/**
 *
 * @author bruno
 */
public class MovimientoNave extends Thread {

    //constantes de movimiento
    private final int MOVIMIENTO_ARRIBA = 0;
    private final int MOVIMIENTO_ABAJO = 1;

    @Override
    public void run() {
        Ventanaprincipal.x1 = navej1.getX();
        Ventanaprincipal.y1 = navej1.getY();
        Ventanaprincipal.x2 = navej2.getX();
        Ventanaprincipal.y2 = navej2.getY();
        while (true) {
            switch (Ventanaprincipal.movimientoNave) {
                // 0 arriba - 1 abajo
                case MOVIMIENTO_ARRIBA:
                //    System.out.println("CASE 1");
                    if (navej1.getX() >= 0) {
                        if (muerte1 == false) {
                            if (rect1.intersects(rect2)) {
                                // break;
                                navej1.setLocation(x1 - 3, y1);
                                rect1.setLocation(x1 - 3, y1);
                            } else {
                                navej1.setLocation(x1 - 10, y1);
                                rect1.setLocation(x1 - 10, y1);
                            }
                        }
                    }
                    break;
                case MOVIMIENTO_ABAJO:
                     if (navej1.getX() < 700) {
                        if (muerte1 == false) {
                            if (rect1.intersects(rect2)) {
                                navej1.setLocation(x1 - 10, y1);
                                rect1.setLocation(x1 - 10, y1);

                                // navej2.setLocation(x2 + 3, y2);
                                //rect2.setLocation(x2 + 3, y2);
                            } else {
                                navej1.setLocation(x1 + 10, y1);
                                rect1.setLocation(x1 + 10, y1);
                            }

                        }
                    }
                    break;
            }
        
        }

    }

}
