/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Alan
 */
public class Enemigo extends Thread {

    int posx = 0;
    int posy = 0;
    int vidas = 2;
    JLabel imagen;
    static int disparo = 0;
    int n = 0;
    public Rectangle rectangulo1;
    public boolean llegofin = false;

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

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public Enemigo(int x, int y, int vida, JLabel imagen) {
        this.posx = x;
        this.posy = y;
        this.vidas = vida;
        this.imagen = imagen;
    }

    public Rectangle getRectangulo1() {
        return rectangulo1;
    }

    public void setRectangulo1(Rectangle rectangulo1) {
        this.rectangulo1 = rectangulo1;
    }

    public Enemigo(JLabel imagen) {
        this.imagen = imagen;
        rectangulo1 = new Rectangle();
        this.rectangulo1.setBounds(imagen.getX(), imagen.getY(), imagen.getWidth(), imagen.getHeight());
    }

    public boolean colision(int posicionEnemigoY, int posicionEnemigoX, int posicionPrincipalY, int posicionPrincipalX, int anchoEnemigo, int largoEnemigo, int anchoPrincipal, int largoPrincipal) {

        if (posicionEnemigoX <= posicionPrincipalX && anchoEnemigo + posicionEnemigoX >= posicionPrincipalX && posicionEnemigoY <= posicionPrincipalY && posicionEnemigoY + largoEnemigo - 30 >= posicionPrincipalY) {
            return true;
        } else if (posicionEnemigoX <= posicionPrincipalX && posicionEnemigoX + anchoEnemigo >= posicionPrincipalX && posicionPrincipalY <= posicionEnemigoY && posicionPrincipalY + largoPrincipal - 30 >= posicionEnemigoY) {
            return true;
        } else if (posicionPrincipalX <= posicionEnemigoX && anchoPrincipal + posicionPrincipalX >= posicionEnemigoX && posicionPrincipalY <= posicionEnemigoY && posicionPrincipalY + largoPrincipal - 30 >= posicionEnemigoY) {
            return true;
        } else if (posicionPrincipalX <= posicionEnemigoX && posicionPrincipalX + anchoPrincipal >= posicionEnemigoX && posicionEnemigoY <= posicionPrincipalY && posicionEnemigoY + largoEnemigo - 30 >= posicionPrincipalY) {
            return true;
        }
        return false;
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

        int valorDado = (int) (Math.random() * 700 + 10);

        while (true) {

            if (Ventanaprincipal.muerte1 == true && Ventanaprincipal.muerte2 == true) {
                this.stop();
            }

            if (llegofin == true) {
                this.stop();
                imagen.setVisible(false);
            }

            if (n <= 500) {

                imagen.setLocation(valorDado, n);
                rectangulo1.setLocation(valorDado, n);

                // rectangulo.setLocation(n, valorDado);
                if (this.rectangulo1.intersects(Ventanaprincipal.rect1)) {

                    Ventanaprincipal.vidas1--;
                    this.imagen.setVisible(false);
                    this.stop();
                    Ventanaprincipal.arraynaves.remove(this);
                }

                if (this.rectangulo1.intersects(Ventanaprincipal.rect2)) {
                    Ventanaprincipal.vidas2--;
                    this.imagen.setVisible(false);
                    this.stop();
                    Ventanaprincipal.arraynaves.remove(this);
                }
                /*if (colision(valorDado, n, Ventanaprincipal.navej1.getY(), Ventanaprincipal.navej1.getX(), 100, 100, 100, 80)) {
                    System.out.println("HUBO COLISION");
                    imagen.setVisible(false);
                    llegofin = true;
                    suspend();

                    return;
                }*/

 /*   if (Ventanaprincipal.sedisparo1 == true) {

                    if (colision(valorDado, n, Ventanaprincipal.disparo1.getY(), Ventanaprincipal.disparo1.getX(), 100, 100, 40, 40)) {
                        disparo++;

                        if (disparo == 2) {

                            imagen.setVisible(false);
                            Ventanaprincipal.disparo1.setVisible(false);
                            // destruida++;
                            /// puntos = puntos + 35;

                            // Juego.jlNaveDestruida.setText(String.valueOf(destruida));
                            //  Juego.jlpuntaje.setText(String.valueOf(puntos));
                            disparo = 0;

                            stop();
                        }

                        Ventanaprincipal.disparo1.setVisible(false);
                        Ventanaprincipal.sedisparo1 = false;

                        // Disparo d = new Disparo();
                        //  d.stop();
                    }
                }*/
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Enemigo.class.getName()).log(Level.SEVERE, null, ex);
                }

                n++;

            }

            if (n > 500) {

                System.out.println("LLEGO A FIN se le tiene que restar vidas");
                llegofin = true;
                if (Ventanaprincipal.muerte1 == false) {
                    Ventanaprincipal.vidas1--;

                    if (Ventanaprincipal.muerte2 == false) {
                        Ventanaprincipal.vidas2--;
                    }
                } else if (Ventanaprincipal.muerte2 == false) {
                    Ventanaprincipal.vidas2--;

                    if (Ventanaprincipal.muerte1 == false) {
                        Ventanaprincipal.vidas1--;
                    }
                }

                Ventanaprincipal.arraynaves.remove(this);
                //   this.imagen.setVisible(false);
                // this.stop();

            }

        }

    }
}
