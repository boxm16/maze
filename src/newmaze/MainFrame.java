/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newmaze;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Michail Sitmalidis
 */
public class MainFrame extends javax.swing.JFrame {

    Place place;
    Place place1;

    private Timer timer;
    private Timer arrayTimer;
    ArrayList<Place> arrayList;

    public MainFrame() {
        initComponents();

        timer = new Timer(50, new TimerAction());
        place = new Place();
        place1 = new Place();

        jTable1.setGridColor(Color.blue);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);

        jTable1.setDefaultRenderer(Object.class, myRenderer);

        arrayTimer = new Timer(50, new ArrayTimerAction());
        arrayList = new ArrayList();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20"
            }
        ));
        jTable1.setRowHeight(43);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("CLEAR PATH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("STOP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("STUPID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("CONTINUE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Recursion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField1.setText("X");

        jTextField2.setText("Y");

        jButton6.setText("NOOB");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("SMART");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("FORGET");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        place.setX(0);
        place.setY(0);
        //jTable1.setValueAt("0", 0, 0);
        timer.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = jTable1.getRowCount();
        int y = jTable1.getColumnCount();

        for (int n = 0; n < x; n++) {
            for (int m = 0; m < y; m++) {
                Object object = jTable1.getValueAt(n, m);
                if (object != null) {
                    String mark = object.toString();
                    if (mark.equals("0") || mark.equals("+")) {
                        jTable1.setValueAt("", n, m);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        timer.stop();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        timer.start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // int x = Integer.parseInt(jTextField1.getText());
        // int y = Integer.parseInt(jTextField2.getText());
        findPath(0, 0);   // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        arrayList = new ArrayList();

        place1.setX(0);
        place1.setY(0);
        arrayTimer.start();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        for (Place place : arrayList) {
            jTable1.setValueAt("0", place.getX(), place.getY());

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        arrayList.clear();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    class ArrayTimerAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            move(place1);

        }

        private void move(Place place1) {
            if (canGoSouth(place1)) {
                moveSouth(place1);
            } else {
                if (canGoNorth(place1)) {
                    moveNorth(place1);
                } else {
                    if (canGoWest(place1)) {
                        moveWest(place1);
                    } else {
                        if (canGoEast(place1)) {
                            moveEast(place1);
                        } else {
                            moveBack(place1);
                        }
                    }

                }
            }
        }

        private void moveBack(Place place1) {

            jTable1.setValueAt("+", place1.getX(), place1.getY());
            if (arrayList.size() > 1) {
                arrayList.remove(arrayList.size() - 1);
                Place p = arrayList.get(arrayList.size() - 1);

                place1.setX(p.getX());
                place1.setY(p.getY());
                System.out.println("moving back to" + place1.getX() + ":" + place1.getY());
            } else {
                arrayTimer.stop();
                System.out.println("ARRAY LIST IS EMPTY-I`m Back where i was");
            }
        }

        private boolean canGoSouth(Place place1) {
            int x = place1.getX();
            int y = place1.getY();
            if (x + 1 > jTable1.getModel().getRowCount() - 1) {
                // System.out.println("X=:"+x);
                return false;
            } else {

                return canGo(x + 1, y);
            }

        }

        private boolean canGoWest(Place place1) {

            int y = place1.getY();
            if (y + 1 > jTable1.getModel().getColumnCount() - 1) {
                // System.out.println("Y=:"+y);
                return false;
            } else {

                return canGo(place1.getX(), y + 1);
            }

        }

        private boolean canGoNorth(Place place1) {
            int x = place1.getX();

            if (x - 1 < 0) {
                return false;
            } else {

                return canGo(x - 1, place1.getY());
            }

        }

        private boolean canGoEast(Place place1) {

            int y = place1.getY();
            if (y - 1 < 0) {
                return false;
            } else {

                return canGo(place1.getX(), y - 1);
            }

        }

        private void moveSouth(Place place1) {
            int x = place1.getX();
            int y = place1.getY();

            place1.setX(x + 1);

            Place p = new Place();
            p.setX(place1.getX());
            p.setY(place1.getY());
            jTable1.setValueAt("0", place1.getX(), place1.getY());
            arrayList.add(p);
            System.out.println("moving south to:" + place1.getX() + ":" + place1.getY());
        }

        private void moveWest(Place place1) {
            int x = place1.getX();
            int y = place1.getY();

            place1.setY(y + 1);

            Place p = new Place();
            p.setX(place1.getX());
            p.setY(place1.getY());

            jTable1.setValueAt("0", place1.getX(), place1.getY());

            arrayList.add(p);
            System.out.println("moving west to:" + place1.getX() + ":" + place1.getY());
        }

        private void moveNorth(Place place1) {
            int x = place1.getX();
            int y = place1.getY();

            place1.setX(x - 1);

            Place p = new Place();
            p.setX(place1.getX());
            p.setY(place1.getY());

            jTable1.setValueAt("0", place1.getX(), place1.getY());
            arrayList.add(p);
            System.out.println("moving north to:" + place1.getX() + ":" + place1.getY());
        }

        private void moveEast(Place place1) {
            int x = place1.getX();
            int y = place1.getY();

            place1.setY(y - 1);

            Place p = new Place();
            p.setX(place1.getX());
            p.setY(place1.getY());

            jTable1.setValueAt("0", place1.getX(), place1.getY());
            arrayList.add(p);
            System.out.println("moving east to:" + place1.getX() + ":" + place1.getY());
        }

        private boolean canGo(int x, int y) {

            Object mark = jTable1.getModel().getValueAt(x, y);
            if (mark == null) {
                System.out.println(x + ":" + y + "CAN GO");
                return true;
            } else {
                String markS = mark.toString();
                if (markS.equals("")) {
                    System.out.println(x + ":" + y + "CAN GO");
                    return true;
                } else if (markS.equals("G")) {
                    System.out.println("ARRIVED");
                    arrayTimer.stop();
                    return true;
                } else {
                    System.out.println(x + ":" + y + "CAN NOT GO");
                    return false;
                }

            }
        }

    }

    class TimerAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            move(place);
        }

        private void move(Place place) {
            if (canGoSouth(place)) {
                moveSouth(place);
            } else {
                if (canGoNorth(place)) {
                    moveNorth(place);
                } else {
                    if (canGoWest(place)) {
                        moveWest(place);
                    } else {
                        if (canGoEast(place)) {
                            moveEast(place);
                        } else {
                            if (canGoBackNorth(place)) {
                                moveBackNorth(place);
                            } else {
                                if (canGoBackSouth(place)) {
                                    moveBackSouth(place);
                                } else {
                                    if (canGoBackWest(place)) {
                                        moveBackWest(place);
                                    } else {
                                        if (canGoBackEast(place)) {
                                            moveBackEast(place);
                                        } else {
                                            System.out.println("STUCK");
                                            timer.stop();
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

        private boolean canGoSouth(Place place) {
            int x = place.getX();
            int y = place.getY();
            if (x + 1 > jTable1.getModel().getRowCount() - 1) {
                // System.out.println("X=:"+x);
                return false;
            } else {

                return canGo(x + 1, y);
            }

        }

        private boolean canGoWest(Place place) {

            int y = place.getY();
            if (y + 1 > jTable1.getModel().getColumnCount() - 1) {
                // System.out.println("Y=:"+y);
                return false;
            } else {

                return canGo(place.getX(), y + 1);
            }

        }

        private boolean canGoNorth(Place place) {
            int x = place.getX();

            if (x - 1 < 0) {
                return false;
            } else {

                return canGo(x - 1, place.getY());
            }

        }

        private boolean canGoEast(Place place) {

            int y = place.getY();
            if (y - 1 < 0) {
                return false;
            } else {

                return canGo(place.getX(), y - 1);
            }

        }

        private void moveSouth(Place place) {
            int x = place.getX();
            int y = place.getY();

            place.setX(x + 1);
            jTable1.setValueAt("0", place.getX(), place.getY());

            System.out.println("moving south to:" + place.getX() + ":" + place.getY());
        }

        private void moveWest(Place place) {
            int x = place.getX();
            int y = place.getY();

            place.setY(y + 1);
            jTable1.setValueAt("0", place.getX(), place.getY());
            //  System.out.println(jTable1.getModel().getValueAt(x, y).toString());
            System.out.println("moving west to:" + place.getX() + ":" + place.getY());
        }

        private void moveNorth(Place place) {
            int x = place.getX();
            int y = place.getY();

            place.setX(x - 1);
            jTable1.setValueAt("0", place.getX(), place.getY());

            System.out.println("moving north to:" + place.getX() + ":" + place.getY());
        }

        private void moveEast(Place place) {
            int x = place.getX();
            int y = place.getY();

            place.setY(y - 1);
            jTable1.setValueAt("0", place.getX(), place.getY());
            //  System.out.println(jTable1.getModel().getValueAt(x, y).toString());
            System.out.println("moving east to:" + place.getX() + ":" + place.getY());
        }

        private boolean canGo(int x, int y) {

            Object mark = jTable1.getModel().getValueAt(x, y);
            if (mark == null) {
                System.out.println(x + ":" + y + "CAN GO");
                return true;
            } else {
                String markS = mark.toString();
                if (markS.equals("")) {
                    System.out.println(x + ":" + y + "CAN GO");
                    return true;
                } else if (markS.equals("G")) {
                    System.out.println("ARRIVED");
                    timer.stop();
                    return true;
                } else {
                    System.out.println(x + ":" + y + "CAN NOT GO");
                    return false;
                }

            }
        }

        private boolean canGoBackNorth(Place place) {
            int x = place.getX();

            if (x - 1 < 0) {
                return false;
            } else {

                return canGoBack(x - 1, place.getY());
            }

        }

        private boolean canGoBackEast(Place place) {
            int y = place.getY();
            if (y - 1 < 0) {
                return false;
            } else {

                return canGoBack(place.getX(), y - 1);
            }
        }

        private boolean canGoBackSouth(Place place) {
            int x = place.getX();

            if (x + 1 > jTable1.getRowCount() - 1) {
                return false;
            } else {

                return canGoBack(x + 1, place.getY());
            }
        }

        private boolean canGoBackWest(Place place) {
            int y = place.getY();
            if (y + 1 > jTable1.getModel().getColumnCount() - 1) {
                // System.out.println("Y=:"+y);
                return false;
            } else {

                return canGoBack(place.getX(), y + 1);
            }
        }

        private boolean canGoBack(int x, int y) {
            Object mark = jTable1.getModel().getValueAt(x, y);
            if (mark == null) {
                System.out.println(x + ":" + y + "THIS SHOUDLNT HAPPEN");
                return true;
            } else {
                String markS = mark.toString();
                if (markS.equals("0")) {
                    System.out.println(x + ":" + y + "CAN GO BACK");
                    return true;

                } else {
                    System.out.println(x + ":" + y + "NOT BACK STEP");
                    return false;
                }

            }

        }

        private void moveBackNorth(Place place) {
            int x = place.getX();
            int y = place.getY();

            jTable1.setValueAt("+", place.getX(), place.getY());
            place.setX(x - 1);
            System.out.println("moving BACK north to:" + place.getX() + ":" + place.getY());
        }

        private void moveBackEast(Place place) {
            int x = place.getX();
            int y = place.getY();

            jTable1.setValueAt("+", place.getX(), place.getY());
            place.setY(y - 1);
            System.out.println("moving BACK east to:" + place.getX() + ":" + place.getY());
        }

        private void moveBackSouth(Place place) {
            int x = place.getX();
            int y = place.getY();

            jTable1.setValueAt("+", place.getX(), place.getY());
            place.setX(x + 1);
            System.out.println("moving BACK south to:" + place.getX() + ":" + place.getY());
        }

        private void moveBackWest(Place place) {
            int x = place.getX();
            int y = place.getY();

            jTable1.setValueAt("+", place.getX(), place.getY());
            place.setY(y + 1);
            System.out.println("moving BACK west to:" + place.getX() + ":" + place.getY());
        }

    }

    //------------------------------------------------------------------/-------------/-
    //-----------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------
    private boolean findPath(int x, int y) {

        if (outside(x, y)) {
            System.out.println(x + ":" + y + "-is OUTSIDE");
            return false;
        }
        if (isGoal(x, y)) {
            System.out.println(x + ":" + y + "-is GOAL");
            return true;
        }
        if (notOpen(x, y)) {
            System.out.println(x + ":" + y + "-is NOT OPEN");
            return false;
        }
        markAsSolutionPath(x, y);

        if (findPath(x - 1, y)) {
            return true;
        }
        if (findPath(x, y - 1)) {
            return true;
        }
        if (findPath(x + 1, y)) {
            return true;
        }
        if (findPath(x, y + 1)) {
            return true;
        }
        unMarkAsSolutionPath(x, y);
        return false;

    }

    private void unMarkAsSolutionPath(int x, int y) {
        jTable1.setValueAt("+", x, y);
    }

    private void markAsSolutionPath(int x, int y) {

        jTable1.setValueAt("0", x, y);
    }

    private boolean notOpen(int x, int y) {
        Object object = jTable1.getValueAt(x, y);
        if (object != null) {
            String spot_mark = object.toString();
            return (!spot_mark.equals(""));
        } else {
            return false;
        }
    }

    private boolean isGoal(int x, int y) {

        Object object = jTable1.getValueAt(x, y);
        if (object != null) {
            String spot_mark = object.toString();
            return spot_mark.equals("G");
        } else {
            return false;
        }
    }

    private boolean outside(int x, int y) {

        return (x < 0 || x > jTable1.getRowCount() - 1 || y < 0 || y > jTable1.getColumnCount() - 1);
    }

    DefaultTableCellRenderer myRenderer = new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value, boolean isSelected, boolean hasFocus, int row, int col) {

            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

            String status = (String) table.getModel().getValueAt(row, col);
            if ("x".equals(status)) {
                setBackground(Color.BLACK);
                setForeground(Color.BLACK);
            } else if ("0".equals(status)) {
                setBackground(Color.GREEN);
                setForeground(Color.GREEN);

            } else if ("Y".equals(status)) {
                setBackground(Color.BLUE);
                setForeground(Color.BLUE);
            } else if ("F".equals(status)) {
                setBackground(Color.YELLOW);
                setForeground(Color.YELLOW);

            } else if ("+".equals(status)) {
                setBackground(Color.RED);
                setForeground(Color.RED);
            } else {
                setBackground(table.getBackground());
                setForeground(table.getForeground());
            }
            return this;
        }
    };
}
