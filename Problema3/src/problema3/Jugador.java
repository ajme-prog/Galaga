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
public class Jugador {
    int posx;
    int posy;
    JLabel imagen;
    int vidas;
    int puntos;

    public Jugador(JLabel imagen) {
        this.posx = 0;
        this.posy = 0;
        this.imagen = imagen;
        this.vidas=3;
        this.puntos=0;
    }
    
    
}
