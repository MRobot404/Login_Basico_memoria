package com.mycompany.login_basico_memoria;
// @author Fsociety
 
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        log = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Usuario : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 30, 60, 15);
        getContentPane().add(Usuario);
        Usuario.setBounds(100, 30, 150, 20);

        jLabel2.setText("Password: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(14, 80, 60, 15);
        getContentPane().add(Password);
        Password.setBounds(90, 80, 180, 20);

        log.setText("Login");
        getContentPane().add(log);
        log.setBounds(240, 150, 60, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton log;
    // End of variables declaration//GEN-END:variables
}
