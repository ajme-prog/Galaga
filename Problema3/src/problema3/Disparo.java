/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.Rectangle;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Alan
 */
public class Disparo extends Thread {

    int posx;
    int posy;
    JLabel imagen, nave;
    Timer timer;
    int n = 400;
    Rectangle rectangulo;

    public Disparo(int posicionX, JLabel disp) {
        this.posx = posicionX;
        this.imagen = disp;
        this.rectangulo = new Rectangle();
        this.rectangulo.setBounds(this.imagen.getX(), this.imagen.getY(), this.imagen.getWidth(), this.imagen.getHeight());

    }

    public Disparo() {

    }

    public Disparo(int valorDado, int n) {
        this.n = n;
        this.posy = valorDado;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public Disparo(JLabel imagen, int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
        this.imagen = imagen;
    }

    public boolean colisionBala(int posicionEnemigoY, int posicionEnemigoX, int posicionBalaY, int posicionBalaX, int anchoEnemigo, int largoEnemigo, int anchoBala, int largoBala) {

        if (posicionEnemigoX <= posicionBalaX && anchoEnemigo + posicionEnemigoX >= posicionBalaX && posicionEnemigoY <= posicionBalaY && posicionEnemigoY + largoEnemigo + 30 >= posicionBalaY) {
            return true;
        } else if (posicionEnemigoX <= posicionBalaX && posicionEnemigoX + anchoEnemigo >= posicionBalaX && posicionBalaY <= posicionEnemigoY && posicionBalaY + largoBala - 30 >= posicionEnemigoY) {
            return true;
        } else if (posicionEnemigoX + anchoEnemigo >= posicionBalaX && posicionEnemigoX <= posicionBalaX && posicionEnemigoY <= posicionBalaY && posicionEnemigoY + largoEnemigo >= posicionBalaY) {
            return true;
        }

        return false;
    }

    @Override
    public void run() {

        imagen.setVisible(true);
        while (true) {
            // timer = new Timer(5, (ae) -> {
            // System.out.println("ESTOY EN RUN DISPARO");
            if (n > 0) {

                imagen.setLocation(this.posx, this.n);
                rectangulo.setLocation(this.posx, this.n);
                //   rectangulo.setLocation(n,posicionY);

                try {
                    sleep(3);
                    //   System.out.println("ESTOY EN RUN DISPARO");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Disparo.class.getName()).log(Level.SEVERE, null, ex);
                }

                //----------RECORRO EL ARRAY DE NAVES PARA VER Q
                for (int i = 0; i < Ventanaprincipal.arraynaves.size(); i++) {
                    Enemigo naveaux = Ventanaprincipal.arraynaves.get(i);
                    Rectangle rectaux = naveaux.getRectangulo1();

                    if (rectangulo.intersects(rectaux)) {
                        System.out.println("VOY A RESTAR VIDAS A LA NAVE");
                        naveaux.vidas--;

                        if (naveaux.vidas == 0) {
                            System.out.println("LAS VIDAS DE LA NAVE SON 0 VOY A BORRARLA");
                            Ventanaprincipal.arraynaves.get(i).stop();
                            Ventanaprincipal.arraynaves.get(i).imagen.setVisible(false);
                            Ventanaprincipal.arraynaves.remove(Ventanaprincipal.arraynaves.get(i));
                        }
                        imagen.setVisible(false);
                        this.stop();
                        
                    }
                }

            } else { //SI LLEGO A UNA POSICION IGUAL A 0 DETIENE ESE HILO
                //System.out.println("DETUVE LA BALA");
                imagen.setVisible(false);
                this.stop();
            }
            n--;
        }

        //   });
        // timer.start();    timer.start();
    }

}
