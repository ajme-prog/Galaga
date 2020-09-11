/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import javax.swing.JLabel;

/**
 *
 * @author Alan
 */
public class Enemigo {
    
    int posx=0;
    int posy=0;
    int vidas=2;
    JLabel imagen;
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

    public Enemigo(int x,int y,int vida,JLabel imagen) {
        this.posx=x;
        this.posy=y;
        this.vidas=vida;
        this.imagen = imagen;
    }
   
    
    
}
