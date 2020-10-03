/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import javax.swing.Timer;
import static problema3.Ventanaprincipal.muerte1;
import static problema3.Ventanaprincipal.muerte2;
import static problema3.Ventanaprincipal.navej1;
import static problema3.Ventanaprincipal.navej2;
import static problema3.Ventanaprincipal.rect1;
import static problema3.Ventanaprincipal.rect2;
import static problema3.Ventanaprincipal.x1;
import static problema3.Ventanaprincipal.x2;
import static problema3.Ventanaprincipal.y1;
import static problema3.Ventanaprincipal.y2;

/**
 *
 * @author bruno
 */
public class MovimientoNave2 extends Thread {

    //constantes de movimiento
    private final int MOVIMIENTO_ARRIBA = 3;
    private final int MOVIMIENTO_ABAJO = 4;

    @Override
    public void run() {
    
        Ventanaprincipal.x2 = navej2.getX();
        Ventanaprincipal.y2 = navej2.getY();
        while (true) {
            switch (Ventanaprincipal.movimientoNave2) {
                // 0 arriba - 1 abajo
                case MOVIMIENTO_ARRIBA:
                    if (navej2.getX() >= 0) {
                        if (muerte2 == false) {
                            if (rect2.intersects(rect1)) {
                                navej2.setLocation(x2 + 10, y2);
                                rect2.setLocation(x2 + 10, y2);
                            } else {
                                navej2.setLocation(x2 - 10, y2);
                                rect2.setLocation(x2 - 10, y2);
                            }

                        }
                    }
                    break;
                case MOVIMIENTO_ABAJO:
                    if (navej2.getX() < 700) {
                        if (muerte2 == false) {
                            if (rect2.intersects(rect1)) {
                                //  navej2.setLocation(x2 - 10, y2);
                                //d rect2.setLocation(x2 - 10, y2);
                                //  navej2.setLocation(x2 + 3, y2);
                                //drect2.setLocation(x2 + 3, y2);
                            } else {
                                navej2.setLocation(x2 + 10, y2);
                                rect2.setLocation(x2 + 10, y2);

                            }
                        }
                    }
                    break;
            }

        }

    }

}
