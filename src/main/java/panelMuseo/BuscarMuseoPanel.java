/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panelMuseo;

import MainWindow.MainWindow;
import estructuras.Listas.LDNormal;
import estructuras.Listas.LSNormal;
import estructuras.Listas.NodoD;
import estructuras.Listas.NodoS;
import estructuras.Pila.Pila;
import javax.swing.DefaultListModel;
import museo.Museo;
import museo.Sala;
import personas.Artista;
import personas.Visitante;
import produccion.Produccion;

/**
 *
 * @author jeloskaisabel
 */
public class BuscarMuseoPanel extends javax.swing.JPanel {

    /**
     * Creates new form BuscarMuseoPanel
     */
    private LDNormal museos;
    private MainWindow mainWindow;
    public BuscarMuseoPanel (MainWindow mainWindow) {
        
        
        this.mainWindow = mainWindow;
        museos = mainWindow.getListaMuseos();
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaSalasMuseo = new javax.swing.JList<>();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaVisitantesMuseo = new javax.swing.JList<>();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaProduccionesMuseo = new javax.swing.JList<>();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaArtistasMuseo = new javax.swing.JList<>();
        jLabel35 = new javax.swing.JLabel();
        idMuseo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel36 = new javax.swing.JLabel();
        nombreMuseo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        agregarMuseoBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        tipoMuseo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        circuitoMuseo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        nroProduccionesMuseo = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        nroSalasMuseo = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        nroArtistasMuseo = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        nroAsistentesMuseo = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(218, 228, 232));
        jPanel1.setForeground(new java.awt.Color(0, 0, 104));

        jPanel2.setBackground(new java.awt.Color(0, 0, 104));

        listaSalasMuseo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaSalasMuseo);

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Producciones");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Salas");

        listaVisitantesMuseo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaVisitantesMuseo);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Artistas");

        listaProduccionesMuseo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listaProduccionesMuseo);

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Asistentes");

        listaArtistasMuseo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listaArtistasMuseo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 104));
        jLabel35.setText("ID");

        idMuseo.setBackground(new java.awt.Color(218, 228, 232));
        idMuseo.setBorder(null);
        idMuseo.setCaretColor(new java.awt.Color(0, 0, 104));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 104));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 104));
        jLabel36.setText("Nombre");

        nombreMuseo.setBackground(new java.awt.Color(218, 228, 232));
        nombreMuseo.setBorder(null);
        nombreMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        nombreMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreMuseoActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 104));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 104));
        jLabel37.setText("Tipo");

        agregarMuseoBtn.setBackground(new java.awt.Color(0, 0, 104));
        agregarMuseoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarMuseoBtn.setForeground(new java.awt.Color(255, 255, 255));
        agregarMuseoBtn.setText("Buscar");
        agregarMuseoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarMuseoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarMuseoBtnMouseClicked(evt);
            }
        });
        agregarMuseoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMuseoBtnActionPerformed(evt);
            }
        });

        salirBtn.setBackground(new java.awt.Color(255, 0, 51));
        salirBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salirBtn.setForeground(new java.awt.Color(255, 255, 255));
        salirBtn.setText("Salir");
        salirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 104));
        jLabel39.setText("Circuito");

        tipoMuseo.setBackground(new java.awt.Color(218, 228, 232));
        tipoMuseo.setBorder(null);
        tipoMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        tipoMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoMuseoActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(0, 0, 104));

        circuitoMuseo.setBackground(new java.awt.Color(218, 228, 232));
        circuitoMuseo.setBorder(null);
        circuitoMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        circuitoMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuitoMuseoActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(0, 0, 104));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 104));
        jLabel40.setText("Nro. Salas");

        nroProduccionesMuseo.setBackground(new java.awt.Color(218, 228, 232));
        nroProduccionesMuseo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 104)));
        nroProduccionesMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        nroProduccionesMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroProduccionesMuseoActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 104));
        jLabel41.setText("Nro. Producciones");

        nroSalasMuseo.setBackground(new java.awt.Color(218, 228, 232));
        nroSalasMuseo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 104)));
        nroSalasMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        nroSalasMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroSalasMuseoActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 104));
        jLabel42.setText("Nro. Artistas");

        nroArtistasMuseo.setBackground(new java.awt.Color(218, 228, 232));
        nroArtistasMuseo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 104)));
        nroArtistasMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        nroArtistasMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroArtistasMuseoActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 104));
        jLabel43.setText("Nro. Asistentes");

        nroAsistentesMuseo.setBackground(new java.awt.Color(218, 228, 232));
        nroAsistentesMuseo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 104)));
        nroAsistentesMuseo.setCaretColor(new java.awt.Color(0, 0, 104));
        nroAsistentesMuseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroAsistentesMuseoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37)
                            .addComponent(jLabel39)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(idMuseo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(64, 64, 64)
                                .addComponent(agregarMuseoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3)
                            .addComponent(nombreMuseo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(tipoMuseo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(circuitoMuseo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nroArtistasMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nroSalasMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nroProduccionesMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nroAsistentesMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarMuseoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(circuitoMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(nroProduccionesMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(nroSalasMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(nroArtistasMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(nroAsistentesMuseo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMuseoActionPerformed

    private void agregarMuseoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMuseoBtnActionPerformed
        // TODO add your handling code here:
        /*int p = JOptionPane.showConfirmDialog(null, "¿Está seguro de agregar el museo?", "Add Record", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            try {

                // Obtener datos de los campos de texto
                String nombre, direccion, tipo, circuito, id;
                nombre = nombreMuseo.getText();
                direccion = direccionMuseo.getText();
                tipo = tipoMuseo.getSelectedItem().toString();
                circuito = circuitoMuseo.getSelectedItem().toString();
                id = idMuseo.getText();
                // Validacion de campos no vacios
                if (nombre.equals("") || direccion.equals("") || tipo.equals("") || circuito.equals("")) {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos",
                        "Error al registrar el museo", JOptionPane.ERROR_MESSAGE);

                } else {
                    Museo mx = new Museo(nombre, tipo, direccion, circuito, id);
                    LSNormal listaSalas = new LSNormal();
                    mx.setListaSalas(listaSalas);
                    listaMuseos.adiFin(mx);
                    panel2.datosATabla();
                    JOptionPane.showMessageDialog(null, "Museo registrado exitosamente");
                    //reset();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

        }*/
    }//GEN-LAST:event_agregarMuseoBtnActionPerformed
    private void buscarMuseo(String id){
        boolean sw = false;
        NodoD r = museos.getP();
        while(r!=null&&!sw){
            Museo mx = (Museo)r.getDato();
             System.out.println("acepta");
            if(mx.getId().equals(id)){
                System.out.println("Museo encontado");
                sw = true;
                String nombre = mx.getNombre();
                String circuito = mx.getCircuito();
                String tipo = mx.getTipo();
                LSNormal w = mx.getListaSalas();
                int nsalas = w.nElem();
                NodoS q = w.getCabecera();
                DefaultListModel modSala = new DefaultListModel();
                listaSalasMuseo.setModel(modSala);
                while(q!=null){
                    System.out.println("capa1");
                    Sala sx = (Sala)q.getDato();
                    LDNormal lp = sx.getListaProducciones();
                    int nProducciones = lp.nElem();
                    NodoD s = lp.getP();
                    DefaultListModel modProd = new DefaultListModel();
                    listaProduccionesMuseo.setModel(modProd);
                    while(s!=null){
                        System.out.println("capa2");
                        Produccion px = (Produccion) s.getDato();
                        LSNormal la = px.getListaArtistas();
                        int nArt = la.nElem();
                        DefaultListModel modArt = new DefaultListModel();
                        listaArtistasMuseo.setModel(modArt);
                        NodoS t = la.getCabecera();
                        while(t!=null){
                            System.out.println("capa3");
                            Artista ax = (Artista) t.getDato();
                            modArt.addElement(ax.getNombre());
                            t = t.getSig();
                        }
                        Pila aux = new Pila(px.getNroEntradas());
                        Pila pvisit = px.getPilaVisitantes();
                        DefaultListModel modVis = new DefaultListModel();
                        listaVisitantesMuseo.setModel(modVis);
                        int nVis = pvisit.nElem();
                        while(!pvisit.esVacia()){
                            System.out.println("capault");
                            Visitante vx = (Visitante)pvisit.eliminar();
                            aux.adicionar(vx);
                        }
                        modProd.addElement(px.getNombre());
                        s = s.getSig();
                    }
                    modSala.addElement(sx.getNombre());
                    q = q.getSig();
                }
                nombreMuseo.setText(nombre);
                circuitoMuseo.setText(circuito);
                tipoMuseo.setText(tipo);
                nroSalasMuseo.setText(String.format("%d",nsalas));
                //nroProduccionesMuseo.setText(String.format("%d",nProducciones));
                
            }
            else
                r = r.getSig();
        }
        
    }
    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:

        /*p1_addMuseumPanel.setVisible(false);
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        p4.setVisible(false);
        p5.setVisible(false);
        reset();*/
    }//GEN-LAST:event_salirBtnActionPerformed

    private void tipoMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoMuseoActionPerformed

    private void circuitoMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuitoMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_circuitoMuseoActionPerformed

    private void nroProduccionesMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroProduccionesMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroProduccionesMuseoActionPerformed

    private void nroSalasMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroSalasMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroSalasMuseoActionPerformed

    private void nroArtistasMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroArtistasMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroArtistasMuseoActionPerformed

    private void nroAsistentesMuseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroAsistentesMuseoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroAsistentesMuseoActionPerformed

    private void agregarMuseoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarMuseoBtnMouseClicked
        // TODO add your handling code here:
        buscarMuseo(idMuseo.getText());
    }//GEN-LAST:event_agregarMuseoBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarMuseoBtn;
    private javax.swing.JTextField circuitoMuseo;
    private javax.swing.JTextField idMuseo;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JList<String> listaArtistasMuseo;
    private javax.swing.JList<String> listaProduccionesMuseo;
    private javax.swing.JList<String> listaSalasMuseo;
    private javax.swing.JList<String> listaVisitantesMuseo;
    private javax.swing.JTextField nombreMuseo;
    private javax.swing.JTextField nroArtistasMuseo;
    private javax.swing.JTextField nroAsistentesMuseo;
    private javax.swing.JTextField nroProduccionesMuseo;
    private javax.swing.JTextField nroSalasMuseo;
    private javax.swing.JButton salirBtn;
    private javax.swing.JTextField tipoMuseo;
    // End of variables declaration//GEN-END:variables
}