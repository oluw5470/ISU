
package Guidesign;
import BreezySwing.*;
import javafx.stage.FileChooser;



public class AnimationsAndDesign extends javax.swing.JFrame {

    
    public AnimationsAndDesign() {
        initComponents();
        FileChooser bob = new FileChooser();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        muNew = new javax.swing.JMenu();
        mnuSave = new javax.swing.JMenu();
        mnuLoad = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2142, 1119));
        setMinimumSize(new java.awt.Dimension(2142, 1119));

        jLabel1.setIcon(new javax.swing.ImageIcon("ISSDCVS01\\students\\oluw5470\\Documents\\My Pictures\\SeyiIsu.png")); // NOI18N
        jLabel1.setText("jLabel1");

        muNew.setText("New");
        muNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muNewMouseClicked(evt);
            }
        });
        jMenuBar1.add(muNew);

        mnuSave.setText("Save");
        mnuSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSaveMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuSave);

        mnuLoad.setText("Load");
        mnuLoad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuLoadMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuLoad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuLoadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuLoadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuLoadMouseClicked

    private void mnuSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSaveMouseClicked
        Save s= new Save(Day,Health,Moral,Smarts);
        double d;
        d = Math.random()+ 1;
    }//GEN-LAST:event_mnuSaveMouseClicked

    private void muNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muNewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_muNewMouseClicked

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(AnimationsAndDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimationsAndDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimationsAndDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimationsAndDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnimationsAndDesign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuLoad;
    private javax.swing.JMenu mnuSave;
    private javax.swing.JMenu muNew;
    // End of variables declaration//GEN-END:variables
}
//        /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\      /\
//       /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \    /  \
//      / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \  / I  \
//     /______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\/______\
