/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Alan
 */
public class Ventanaprincipal extends javax.swing.JFrame implements Runnable {

    //-------------VARIABLE PRUEBA
    public static int movimientoNave = -1;
    public static int movimientoNave2 = -1;

    //---------------VARIABLES PARA LAS BALAS
    public static int movimientobala1 = -1;
    public static int movimientobala2 = -1;

    java.util.List<String> Dir;
    private int disp;
    private JLabel lDireccion, lCouunt;
    JLabel jltiempo, jlt, tiempo;
    public static JLabel jlfondo;
    //IMAGENES PARA JUGADOR 1 Y 22
    public static JLabel navej1, navej2;
    //rectangulos para ver las colisiones entre naves
    public static Rectangle rect1, rect2;
    public static boolean muerte1, muerte2 = false;
    //variables para contar vidas
    public static int vidas1 = 3;
    public static int vidas2 = 3;
    //variables para contar puntos
    public static int puntos1, puntos2 = 0;

    //-----VOLVI ESTAS ESTATICAS REVISAR SI DA CLAVO DEJARLAS NORMAL
    public static int x1, x2, y1, y2 = 0;

    Jugador j1, j2;
    Thread hilo;
    public static int contadortiempo = 0;
    public static boolean sedisparo1, sedisparo2 = false;
    //LABELS PARA CADA DISPARO DE CADA JUGADOR
    public static JLabel disparo1, disparo2;
    public static int movimiento1 = 0;

    //array para meter todas las naves generadas
    public static ArrayList<Enemigo> arraynaves = new ArrayList<Enemigo>();

    //variable para ver cada cuanto genero naves
    public int pivote = 8;

    //  public static int mov1=0
    /**
     * Creates new form Ventanaprincipal
     */
    //----------PRUEBA MOVIMIENTO NAVE
    MovimientoNave mov = new MovimientoNave();
    MovimientoNave2 mov2 = new MovimientoNave2();

    //-------movimiento bala
    Movimientobala1 movb=new Movimientobala1();
    Movimientobala2 movb2=new Movimientobala2();
    public Ventanaprincipal() {
        initComponents();

        //[969, 519] ES ANCHO,ALTO
        this.setSize(800, 508);
        setResizable(false);
        jlfondo = new JLabel();
        ImageIcon p = new ImageIcon(getClass().getResource("../imagenes/fondo.jpg"));
        Icon icon = new ImageIcon(p.getImage().getScaledInstance(800, 450, Image.SCALE_DEFAULT));
        jlfondo.setIcon(icon);
        jlfondo.setBounds(0, 0, 800, 508);
        add(jlfondo);
        this.jPanel1.setBackground(Color.BLACK);

        //envio 0 a los 2 punteos de j1 y j2
        jLabel4.setText("0");
        jLabel7.setText("0");

        System.out.println("ESTOY EN VENTANA");

        //INICIO EL RELOJ
        // Reloj crono = new Reloj(jLabel2);
        // new Thread(crono).start();
        //agrego las naves de jugador 1 y jugador2
        navej1 = new JLabel();
        rect1 = new Rectangle();

        ImageIcon im = new ImageIcon(getClass().getResource("/Imagenes/nave1.png"));
        Icon icono2 = new ImageIcon(im.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        //x,y,ancho,alto
        navej1.setBounds(150, 400, 90, 70);
        rect1.setBounds(150, 400, 90, 70);
        navej1.setIcon(icono2);
        j1 = new Jugador(navej1);
        j1.setPosx(150);
        j1.setPosy(400);
        jlfondo.add(navej1);

        //------JUGADOR 2
        navej2 = new JLabel();
        rect2 = new Rectangle();
        ImageIcon im2 = new ImageIcon(getClass().getResource("/Imagenes/nave2.png"));
        Icon icono3 = new ImageIcon(im2.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT));
        //x,y,ancho,alto
        navej2.setBounds(510, 400, 90, 70);
        rect2.setBounds(510, 400, 90, 70);
        navej2.setIcon(icono3);
        j2 = new Jugador(navej2);
        j2.setPosx(100);
        j2.setPosy(400);
        jlfondo.add(navej2);
        //j2.start();
        addKeyListener(new ManejoDeTeclas_201709362());
//          new Thread(j2).start();
        //AGREGO EL EVENTO MOVER PARA LA NAVE
        /*   addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                movernaves(e);

            }

        });
         */
        hilo = new Thread(this);
        hilo.start();
        mov.start();
        mov2.start();
        
        movb.start();
        movb2.start();
    }

    private void initPropiedadesVentanta() {
        // setSize(ANCHO_VENTANA, ALTO_VENTANA);
        // setResizable(false);
        addKeyListener(new ManejoDeTeclas_201709362());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIEMPO:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PUNTOS: ");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JUGADOR 1");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PUNTOS:");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("JUGADOR 2");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VIDAS:");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VIDAS:");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addContainerGap(192, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(150, 150, 150))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public class ManejoDeTeclas_201709362 implements KeyListener {

        //movimiento nave----0 arriba-1 abajo
        @Override
        public void keyPressed(KeyEvent ke) {
            ejecutarAccionTeclado(0, ke.getKeyCode());
        }

        @Override
        public void keyTyped(KeyEvent ke) {
        }

        @Override
        public void keyReleased(KeyEvent ke) {
            ejecutarAccionTeclado(1, ke.getKeyCode());
        }
    }

    private void ejecutarAccionTeclado(int estado, int tecla) {
        this.x1 = navej1.getX();
        this.y1 = navej1.getY();
        this.x2 = navej2.getX();
        this.y2 = navej2.getY();
        switch (tecla) {

            case KeyEvent.VK_A:

                if (estado == 0) {
                    // System.out.println("MOV NAVE A");
                    movimientoNave = 0;
                } else {
                    movimientoNave = 2;
                }
                break;
            case KeyEvent.VK_D:

                if (estado == 0) {
                    movimientoNave = 1;
                } else {
                    movimientoNave = 2;
                }
                break;

            case KeyEvent.VK_J:

                if (estado == 0) {
                    movimientoNave2 = 3;
                } else {
                    movimientoNave2 = 2;
                }
                break;

            case KeyEvent.VK_L:

                if (estado == 0) {
                    movimientoNave2 = 4;
                } else {
                    movimientoNave2 = 2;
                }
                break;

            case KeyEvent.VK_S:

                if (estado == 0) {
                    if (muerte1 == false) {
                        movimientobala1 = 1;
                        // disparo(navej1.getX() + 30, 1);
                    }
                } else {
                    movimientobala1 = 2;
                }
                break;

            case KeyEvent.VK_K:
                if (estado == 0) {
                    if (muerte2 == false) {
                        // disparo(navej2.getX() + 30, 2);
                        movimientobala2 = 1;
                    }
                } else {
                    movimientobala2 = 2;
                }
                break;
            // case KeyEvent.VK_SPACE:
            //    disparo(navej.getY() + 20);
            //   break;
        }
    }

    //-------------METODO BUENO------------
    private void movernaves(java.awt.event.KeyEvent evt) {
        this.x1 = navej1.getX();
        y1 = navej1.getY();
        this.x2 = navej2.getX();
        this.y2 = navej2.getY();
        switch (evt.getExtendedKeyCode()) {

            case KeyEvent.VK_A:
                System.out.println("USANDO A");
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
            case KeyEvent.VK_D:
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

            case KeyEvent.VK_J:
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

            case KeyEvent.VK_L:
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

            case KeyEvent.VK_S:
                System.out.println("USANDO S");
                if (muerte1 == false) {

                    disparo(navej1.getX() + 30, 1);
                }
                break;

            case KeyEvent.VK_K:
                if (muerte2 == false) {
                    disparo(navej2.getX() + 30, 2);
                }
                break;
            // case KeyEvent.VK_SPACE:
            //    disparo(navej.getY() + 20);
            //   break;
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
        jlfondo.add(disparo1);
        sedisparo1 = true;
        Disparo d2 = new Disparo(posicionX, disparo1);
        d2.numeronave = numeronave;
        d2.start();

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    void agregarenemigo() {

    }

    @Override
    public void run() {

        //  Timer timer = new Timer (5,(ae) -> {
        while (true) {
            //   initPropiedadesVentanta();
            jLabel4.setText(String.valueOf(puntos1));
            jLabel7.setText(String.valueOf(puntos2));
            jLabel10.setText(String.valueOf(vidas1));
            jLabel12.setText(String.valueOf(vidas2));

            if (this.vidas1 == 0) {
                navej1.setVisible(false);
                this.rect1.setBounds(0, 0, -100, -100);
                muerte1 = true;
            }
            if (this.vidas2 == 0) {
                navej2.setVisible(false);
                this.rect2.setBounds(0, 0, -100, -100);
                muerte2 = true;

            }
//SI LAS DOS NAVES ESTAN MUERTAS DETENGO EL JUEGO 
            if (this.muerte1 == true && this.muerte2 == true) {
                return;

            }
            if (pivote == 0) {
                pivote = 2;//cuando llega a 0 se queda generando naves cada 2 segundos
            }
            jLabel2.setText(String.valueOf(contadortiempo));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Ventanaprincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            contadortiempo++;
            if (contadortiempo == 0 || contadortiempo == 1 || contadortiempo == 2) {
                JLabel naveEnemiga = new JLabel();
                ImageIcon ne = new ImageIcon(getClass().getResource("/Imagenes/enemigo.gif"));
                Icon icono4 = new ImageIcon(ne.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
                naveEnemiga.setIcon(icono4);
                naveEnemiga.setBounds(-200, 100, 50, 50);
                jlfondo.add(naveEnemiga);

                Enemigo en = new Enemigo(naveEnemiga);
                arraynaves.add(en);
                en.start();
            }
            System.out.println("PIVOTE ES " + pivote);
            // System.out.println("CONTADOR TIEMPO ES "+jLabel2.getText());
            if (contadortiempo % pivote == 0) {
                JLabel naveEnemiga = new JLabel();
                ImageIcon ne = new ImageIcon(getClass().getResource("/Imagenes/enemigo.gif"));
                Icon icono4 = new ImageIcon(ne.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
                naveEnemiga.setIcon(icono4);
                naveEnemiga.setBounds(-200, 100, 50, 50);
                jlfondo.add(naveEnemiga);

                Enemigo en = new Enemigo(naveEnemiga);
                arraynaves.add(en);
                en.start();

            }

            if (contadortiempo % 25 == 0) {
                if (pivote != 0) {
                    pivote = pivote - 2;
                }
            }

        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //  });
    }

}
