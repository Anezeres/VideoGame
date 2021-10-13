package juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Juego extends Canvas implements Runnable{
    
    private static JFrame ventana;
    private static Thread thread;
    
    private static final int ANCHO = 800;
    private static final int ALTO=600;
    private static final String NOMBRE = "Juego";
    
    //Hola
    
    private Juego(){
        setPreferredSize(new Dimension(ANCHO,ALTO));    
        
        ventana = new JFrame(NOMBRE);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        }
    
    
    public static void main(String[] args){
        Juego juego = new Juego();
        juego.iniciar();
    }
    
    private void iniciar(){
        thread = new Thread(this, "Graficos");
        thread.start();
    
    }
    
    private void detener(){
    
    }

    @Override
    public void run() {
        System.out.println("El thread 2 se está ejecutando con exito");
        
    }

    
    
}
