
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KEVIN GARCIA
 */
public class Cliente extends JLabel implements Runnable {

    boolean estado;
    

    public static int posX, posY;
    public JLabel bala;
    
    public Cliente(JFrame form){
        super();
        estado=true;
        setBounds(200,-10, 130, 150);
        setIcon(new ImageIcon(getClass().getResource("CLIENTE_2.png")));
        form.add(this);
    }
    
    @Override
    public void run() {
        try {
            while (estado) {
                Thread.sleep(20);
                this.posY += 5;
                setLocation(this.posX,this.posY);
            }
        } catch (Exception e) {
        }
    }
    
}
