/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamapeditor;

import graficos.SimpleRoom;
import javax.swing.DefaultComboBoxModel;
import xml.projectAssets.rooms.Room;

/**
 *
 * @author eltan
 */
public class RoomWindow extends javax.swing.JFrame {

    /**
     * Creates new form NewRoom
     */
    Interfaz mainWindow;
    Integer number = xml.Project.assets.rooms.size();
    Boolean newRoom = true;
    public RoomWindow(Interfaz caller) {
        initComponents();
        mainWindow = caller;
        name.setText("room" + (number));
    }
    
    public RoomWindow(Interfaz caller, Integer num) {
        newRoom = false;
        initComponents();
        mainWindow = caller;
        number = num;
        
        Room room = xml.Project.assets.rooms.get(number);
        
        name.setText(room.name);
        width.setText(String.valueOf(room.width));
        height.setText(String.valueOf(room.height));
        speed.setText(String.valueOf(room.speed));
        persistent.setSelected(room.persistent);
        code.setText(room.code);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        width = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        speed = new javax.swing.JTextField();
        persistent = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Name:");

        name.setText("room0");

        jLabel2.setText("Width:");

        width.setText("1280");

        jLabel3.setText("Height:");

        height.setText("720");

        jLabel4.setText("Speed:");

        speed.setText("30");

        persistent.setText("Persistent");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(104, 104, 104)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(persistent)
                        .addGap(0, 135, Short.MAX_VALUE))
                    .addComponent(name)
                    .addComponent(width)
                    .addComponent(speed)
                    .addComponent(height))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(speed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(persistent)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Settings", jPanel1);

        code.setColumns(20);
        code.setRows(5);
        jScrollPane1.setViewportView(code);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Code", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Backgrounds", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Views", jPanel4);

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        accept.setText("Accept");
        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(accept))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseClicked
        // TODO add your handling code here:
        xml.projectAssets.rooms.Room room;
        if (newRoom){
            room = new xml.projectAssets.rooms.Room();
            xml.Project.assets.rooms.add(room);
        }
        else{
            room = xml.Project.assets.rooms.get(number);
        }
        
        room.hasChanges = true;
        room.name = name.getText();
        room.width = Integer.valueOf(width.getText());
        room.height = Integer.valueOf(height.getText());
        room.speed = Integer.valueOf(speed.getText());
        room.persistent = persistent.isSelected();
        room.code = code.getText();
        
        mainWindow.currentSimpleRoom = new SimpleRoom(xml.Project.assets.rooms.get(number));
        
        String[] i = new String[xml.Project.assets.rooms.size()];
        for(xml.projectAssets.rooms.Room r : xml.Project.assets.rooms){
            i[xml.Project.assets.rooms.indexOf(r)] = r.name;
        }
        
        mainWindow.mapList.setListData(i);
        mainWindow.mapList.setEnabled(true);
        mainWindow.mapList.setSelectedIndex(number);
        mainWindow.mapList.ensureIndexIsVisible(number);
        
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        
        dcbm = new DefaultComboBoxModel();
        String[] d = mainWindow.currentSimpleRoom.getDephts();
        if (d.length > 0){
            for(String s : mainWindow.currentSimpleRoom.getDephts()){
                dcbm.addElement(s);
            }
        }
        else{
            dcbm.addElement("1000000");
            mainWindow.currentSimpleRoom.changeLayer(1000000);
        }
        
        mainWindow.layersComboBox.setModel(dcbm);
        
        mainWindow.tw.setText(String.valueOf(mainWindow.currentBackground.getTW()));
        mainWindow.th.setText(String.valueOf(mainWindow.currentBackground.getTH()));
        
        mainWindow.mapPanel.setComponentZOrder(mainWindow.backgroundLayer, 4);
        mainWindow.mapPanel.setComponentZOrder(mainWindow.bottomLayers, 3);
        mainWindow.mapPanel.setComponentZOrder(mainWindow.currentLayer, 2);
        mainWindow.mapPanel.setComponentZOrder(mainWindow.selection, 1);
        
        mainWindow.currentSimpleRoom.drawBackground(mainWindow.backgroundLayer);
        mainWindow.currentSimpleRoom.update(mainWindow.bottomLayers, mainWindow.currentLayer, mainWindow.topLayers);
        dispose();
    }//GEN-LAST:event_acceptMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accept;
    private javax.swing.JButton cancel;
    private javax.swing.JTextArea code;
    private javax.swing.JTextField height;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox persistent;
    private javax.swing.JTextField speed;
    private javax.swing.JTextField width;
    // End of variables declaration//GEN-END:variables
}
