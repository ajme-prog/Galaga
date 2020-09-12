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
public class Disparo {
    int posx;
    int posy;
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

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }
 
    public Disparo(JLabel imagen,int posx,int posy) {
        this.posx=posx;
        this.posy=posy;
        this.imagen = imagen;
    }
    
    
    
}
