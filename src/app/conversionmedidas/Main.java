package app.conversionmedidas;

import com.formdev.flatlaf.FlatLightLaf;

// Clase principal que inicia el programa.
public class Main {

    public static void main(String[] args) {
        
        try {
            // Configuramos el tema visual para que la ventana se vea moderna.
            FlatLightLaf.setup();
            
        } catch(Exception e) {
            
            System.out.println("No se pudo cargar el tema visual");
        }

        // Este bloque se encarga de abrir la ventana de forma segura.
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                // Creamos la ventana y la mostramos en pantalla.
                new InterfazModerna().setVisible(true); 
            }
        
        });
    }
}