
package app.conversionmedidas;

import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class InterfazModerna extends javax.swing.JFrame {

    private String categoriaActual = "PESO";
    
    public InterfazModerna() {
        
        initComponents();

        this.setSize(685, 610); 
        this.setLocationRelativeTo(null); 
        this.setTitle("Sistema de Conversiones");


        cargarListasPeso(); 
        activarBoton(Peso);
        
        this.getRootPane().setDefaultButton(Convertir);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JSpinner();
        Lista_A = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Lista_B = new javax.swing.JComboBox();
        Convertir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Resultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Peso = new javax.swing.JButton();
        Volumen = new javax.swing.JButton();
        Temperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 242, 245));
        setPreferredSize(new java.awt.Dimension(550, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("De");

        Cantidad.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Cantidad.setModel(new javax.swing.SpinnerNumberModel());

        Lista_A.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 99, 255));
        jLabel2.setText("A");

        Lista_B.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Convertir.setBackground(new java.awt.Color(108, 99, 255));
        Convertir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Convertir.setForeground(new java.awt.Color(255, 255, 255));
        Convertir.setText("CONVERTIR AHORA");
        Convertir.setFocusPainted(false);
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 248, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 99, 255), 2));

        Resultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Resultado.setForeground(new java.awt.Color(108, 99, 255));
        Resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Resultado.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(40, 44, 52));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(30, 30, 30), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Guía Rápida de Uso");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(220, 220, 220));
        jLabel5.setText("<html> <p style=\"width: 380px;\"> 1. Seleccione la <b>categoría de</b> arriba (Botones superiores).<br><br> 2. Escribe el <b>número</b> a convertir.<br><br> 3. Elige unidades y pulsa <b>CONVERTIR AHORA</b>. </p> </html>");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Cantidad)
                                .addComponent(Lista_A, 0, 249, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lista_B, 0, 328, Short.MAX_VALUE)
                            .addComponent(jLabel2)))
                    .addComponent(Convertir, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lista_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Convertir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 630, 480));

        Peso.setBackground(new java.awt.Color(255, 255, 255));
        Peso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Peso.setText("Masa/Peso");
        Peso.setFocusPainted(false);
        Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoActionPerformed(evt);
            }
        });
        getContentPane().add(Peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 40));

        Volumen.setBackground(new java.awt.Color(255, 255, 255));
        Volumen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Volumen.setText("Volumen");
        Volumen.setFocusPainted(false);
        Volumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumenActionPerformed(evt);
            }
        });
        getContentPane().add(Volumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 120, 40));

        Temperatura.setBackground(new java.awt.Color(255, 255, 255));
        Temperatura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Temperatura.setText("Temperatura");
        Temperatura.setFocusPainted(false);
        Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemperaturaActionPerformed(evt);
            }
        });
        getContentPane().add(Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumenActionPerformed
        cargarListasVolumen();
        activarBoton(Volumen);
    }//GEN-LAST:event_VolumenActionPerformed

    private void TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemperaturaActionPerformed
        cargarListasTemperatura();
        activarBoton(Temperatura);
    }//GEN-LAST:event_TemperaturaActionPerformed

    private void PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoActionPerformed
        cargarListasPeso();
        activarBoton(Peso);
    }//GEN-LAST:event_PesoActionPerformed

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed
        calcularConversion();
    }//GEN-LAST:event_ConvertirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Cantidad;
    private javax.swing.JButton Convertir;
    private javax.swing.JComboBox Lista_A;
    private javax.swing.JComboBox Lista_B;
    private javax.swing.JButton Peso;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton Temperatura;
    private javax.swing.JButton Volumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables


    // Inicializa el modelo del ComboBox con las unidades de Masa.
    private void cargarListasPeso() {
        
        String[] unidades = {"Kilogramo (kg)", "Libra (lb)", "Gramo (g)", "Onza (oz)"};
        Lista_A.setModel(new DefaultComboBoxModel<>(unidades));
        Lista_B.setModel(new DefaultComboBoxModel<>(unidades));
        categoriaActual = "PESO"; // Actualiza la variable de estado.
    
    }

    // Inicializa el modelo con unidades de Volumen (Estándar Internacional y EE.UU).
    private void cargarListasVolumen() {

        String[] unidades = {
            "Litro (L)", "Mililitro (ml)", 
            "Taza Legal 240ml (taza leg.)", "Taza Tradic. 236ml (taza trad.)", "Taza Métrica 250ml (taza mét.)",
            "Cucharada EE.UU 14.8ml (tbsp)", "Cucharada Métrica 15ml (tbsp mét.)", "Cucharita Métrica 5ml (tsp)"
        };
        Lista_A.setModel(new DefaultComboBoxModel<>(unidades));
        Lista_B.setModel(new DefaultComboBoxModel<>(unidades));
        categoriaActual = "VOLUMEN";
    }
    
    // Inicializa el modelo con unidades de Temperatura.
    private void cargarListasTemperatura() {
        
        String[] unidades = {"Celsius (°C)", "Fahrenheit (°F)"};
        Lista_A.setModel(new DefaultComboBoxModel<>(unidades));
        Lista_B.setModel(new DefaultComboBoxModel<>(unidades));
        categoriaActual = "TEMPERATURA";
    
    }
    
    // Método utilitario: Extrae la abreviatura entre paréntesis para mostrarla en el resultado.
    private String extraerSimbolo(String textoCompleto) {
        
        if (textoCompleto.contains("(") && textoCompleto.contains(")")) {
            return textoCompleto.substring(textoCompleto.indexOf("(") + 1, textoCompleto.indexOf(")"));
        
        }
        return "";
    }

    // Método visual: Gestiona el cambio de color de los botones para indicar la selección activa.
    private void activarBoton(javax.swing.JButton botonPresionado) {
        
        Color MORADO_PRO = new Color(108, 99, 255); 
        Color BLANCO = Color.WHITE;
        Color NEGRO = Color.BLACK;

        // Resetea todos los botones a estado inactivo (Blanco)
        Peso.setBackground(BLANCO);
        Peso.setForeground(NEGRO);
        Volumen.setBackground(BLANCO);
        Volumen.setForeground(NEGRO);
        Temperatura.setBackground(BLANCO);
        Temperatura.setForeground(NEGRO);

        // Aplica estilo activo al botón seleccionado (Morado)
        botonPresionado.setBackground(MORADO_PRO);
        botonPresionado.setForeground(Color.WHITE);
    
    }

    // Lógica Principal: Orquesta la captura de datos, instanciación de clases y visualización.
    private void calcularConversion() {
        
        try {
            
            // Validación de entrada: Casteo seguro a double usando Number para aceptar enteros.
            double valor = ((Number) Cantidad.getValue()).doubleValue();
            
            // Obtención de índices seleccionados en las listas.
            int indiceDe = Lista_A.getSelectedIndex();
            int indiceA = Lista_B.getSelectedIndex();
            String unidadFinal = extraerSimbolo(Lista_B.getSelectedItem().toString());
            double valorFinal = 0.0;

            // Aplicación de Polimorfismo: Se instancia la clase específica según la categoría.
            if ("PESO".equals(categoriaActual)) {
                
                ConversorPeso balanza = new ConversorPeso(valor);
                valorFinal = balanza.convertir(indiceDe, indiceA);
            
            } else if ("VOLUMEN".equals(categoriaActual)) {
                ConversorVolumen jarra = new ConversorVolumen(valor);
                valorFinal = jarra.convertir(indiceDe, indiceA);
            
            } else if ("TEMPERATURA".equals(categoriaActual)) {
                ConversorTemperatura horno = new ConversorTemperatura(valor);
                valorFinal = horno.convertir(indiceDe, indiceA);
            }

            // Formateo de Salida: Patrón de precisión dinámica (hasta 6 decimales) sin ceros redundantes.
            java.text.DecimalFormat df = new java.text.DecimalFormat("0.######");
            String numeroLimpio = df.format(valorFinal);

            Resultado.setText(numeroLimpio + " " + unidadFinal);

        } catch (Exception e) {
            //Manejo de Excepciones para robustez del sistema.
            Resultado.setText("Error");
            System.out.println("Error: en el calculo: " + e);
        
        }
    }
}
