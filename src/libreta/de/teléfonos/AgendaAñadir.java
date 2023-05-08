/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreta.de.teléfonos;

import java.awt.event.KeyEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Jse_0
 */
public class AgendaAñadir extends javax.swing.JFrame {
    DefaultListModel datos = new DefaultListModel();
    public ListModel respaldo; 
    
    public void setRespaldo(ListModel res)
    {
        respaldo = res;
    }
    public ListModel getRespaldo()
    {
        return respaldo;
    }
    /**
     * Creates new form AgendaAñadir
     */
    
    public AgendaAñadir() {
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

        Contacto = new javax.swing.JDialog();
        texto_nombre = new javax.swing.JLabel();
        texto_telefono = new javax.swing.JLabel();
        texto_tipo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        lista_contactos = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        añadir = new javax.swing.JButton();
        texto_filtrado = new javax.swing.JLabel();
        filtrado = new javax.swing.JTextField();

        Contacto.setTitle("Nuevo Contacto");

        texto_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_nombre.setText("Nombre:");

        texto_telefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_telefono.setText("Teléfono:");

        texto_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_tipo.setText("Tipo:");

        tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TRABAJO", "HOGAR", "MOVIL" }));

        aceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContactoLayout = new javax.swing.GroupLayout(Contacto.getContentPane());
        Contacto.getContentPane().setLayout(ContactoLayout);
        ContactoLayout.setHorizontalGroup(
            ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContactoLayout.createSequentialGroup()
                        .addComponent(texto_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContactoLayout.createSequentialGroup()
                        .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(texto_telefono)
                            .addComponent(texto_tipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipo, 0, 150, Short.MAX_VALUE)
                            .addComponent(telefono))))
                .addContainerGap())
            .addGroup(ContactoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(aceptar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContactoLayout.setVerticalGroup(
            ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_nombre)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_telefono)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_tipo)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda telefónica");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto.setText("Lista de Contactos");

        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_contactos.setViewportView(lista);

        añadir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        texto_filtrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_filtrado.setText("Filtrado por:");

        filtrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                filtradoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lista_contactos, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(texto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(texto_filtrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtrado)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista_contactos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto_filtrado)
                    .addComponent(filtrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        nombre.setText("");
        telefono.setText("");
        tipo.setSelectedIndex(0);
        
        Contacto.setLocationRelativeTo(null);
        Contacto.setSize(270,220);
        Contacto.setVisible(true);
    }//GEN-LAST:event_añadirActionPerformed


    
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        String nombretxt = nombre.getText();
        String numero = telefono.getText();
        String tip = tipo.getSelectedItem().toString();
       
        datos.addElement(nombretxt + " - " + numero + " - " + tip);
        lista.setModel(datos);
        setRespaldo(datos);
        
        Contacto.dispose();
        JOptionPane.showMessageDialog(null, "Contacto añadido", "Info", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_aceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Contacto.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void filtradoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtradoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)    {
            if(filtrado.getText().equals("")){
                lista.setModel(getRespaldo());
            }
            else {
                lista.setModel(getRespaldo());
                DefaultListModel nuevomodelo1 = new DefaultListModel();
                for(int i=0; i < lista.getModel().getSize(); i++) {
                    if(lista.getModel().getElementAt(i).contains(filtrado.getText())) {
                        nuevomodelo1.addElement(lista.getModel().getElementAt(i));                        
                    }
                }
                lista.setModel(nuevomodelo1);
            }
        }

    }//GEN-LAST:event_filtradoKeyPressed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        lista.setModel(getRespaldo());
        filtrado.setText("");
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AgendaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaAñadir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaAñadir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog Contacto;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton añadir;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField filtrado;
    public javax.swing.JList<String> lista;
    private javax.swing.JScrollPane lista_contactos;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel texto_filtrado;
    private javax.swing.JLabel texto_nombre;
    private javax.swing.JLabel texto_telefono;
    private javax.swing.JLabel texto_tipo;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
