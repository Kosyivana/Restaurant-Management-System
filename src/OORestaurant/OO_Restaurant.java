/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package OORestaurant;

/**
 *
 * @author BInaryHills
 */
public class OO_Restaurant extends javax.swing.JFrame {

    /**
     * Creates new form OO_Restaurant
     */
    public OO_Restaurant() {
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
        jTotalButton = new javax.swing.JButton();
        jReceiptButton = new javax.swing.JButton();
        jResetButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlblTotal5 = new javax.swing.JLabel();
        jlblTotal11 = new javax.swing.JLabel();
        jlblTotal9 = new javax.swing.JLabel();
        jlblTotal8 = new javax.swing.JLabel();
        jTotal7 = new javax.swing.JTextField();
        jlblTotal10 = new javax.swing.JLabel();
        jTotal8 = new javax.swing.JTextField();
        jlblTotal12 = new javax.swing.JLabel();
        jTotal6 = new javax.swing.JTextField();
        jTotal9 = new javax.swing.JTextField();
        jTotal10 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTaxField1 = new javax.swing.JTextField();
        jlblTax1 = new javax.swing.JLabel();
        jlblTotal13 = new javax.swing.JLabel();
        jTotal11 = new javax.swing.JTextField();
        jSubTotal1 = new javax.swing.JTextField();
        jlblSubTotal1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jlblTotal1 = new javax.swing.JLabel();
        jTotal1 = new javax.swing.JTextField();
        jlblTotal2 = new javax.swing.JLabel();
        jTotal2 = new javax.swing.JTextField();
        jlblTotal3 = new javax.swing.JLabel();
        jTotal3 = new javax.swing.JTextField();
        jlblTotal4 = new javax.swing.JLabel();
        jlblTotal6 = new javax.swing.JLabel();
        jTotal4 = new javax.swing.JTextField();
        jlblTotal7 = new javax.swing.JLabel();
        jTotal5 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTaxField = new javax.swing.JTextField();
        jSubTotal = new javax.swing.JTextField();
        jTotal = new javax.swing.JTextField();
        jlblTax = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        jTotalButton.setBackground(new java.awt.Color(204, 204, 204));
        jTotalButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotalButton.setText("Total");
        jTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotalButtonActionPerformed(evt);
            }
        });

        jReceiptButton.setBackground(new java.awt.Color(204, 204, 204));
        jReceiptButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jReceiptButton.setText("Receipt");
        jReceiptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReceiptButtonActionPerformed(evt);
            }
        });

        jResetButton.setBackground(new java.awt.Color(204, 204, 204));
        jResetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jResetButton.setText("Reset");

        jExitButton.setBackground(new java.awt.Color(204, 204, 204));
        jExitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jExitButton.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jTotalButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jReceiptButton)
                .addGap(82, 82, 82)
                .addComponent(jResetButton)
                .addGap(81, 81, 81)
                .addComponent(jExitButton)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalButton)
                    .addComponent(jExitButton)
                    .addComponent(jResetButton)
                    .addComponent(jReceiptButton))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 690, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        jlblTotal5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblTotal5.setText("Meals");

        jlblTotal11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal11.setText("Chicken Burger Meal");

        jlblTotal9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal9.setText("Chicken Burger");

        jlblTotal8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal8.setText("Filet-O-Fish");

        jTotal7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal7.setText("0");

        jlblTotal10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal10.setText("Chicken Legend");

        jTotal8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal8.setText("0");

        jlblTotal12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal12.setText("Bacon and Cheese Burger");

        jTotal6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal6.setText("0");
        jTotal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotal6ActionPerformed(evt);
            }
        });

        jTotal9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal9.setText("0");

        jTotal10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal10.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jlblTotal5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotal8)
                    .addComponent(jlblTotal9)
                    .addComponent(jlblTotal10)
                    .addComponent(jlblTotal11)
                    .addComponent(jlblTotal12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotal10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlblTotal5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal8)
                    .addComponent(jTotal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal9)
                    .addComponent(jTotal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal10)
                    .addComponent(jTotal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal11)
                    .addComponent(jTotal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal12)
                    .addComponent(jTotal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 340, 300));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Resturant Management System");

        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kamie.K\\OneDrive\\Desktop\\cooking logo.jpeg.jpg")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(11, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        jTaxField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlblTax1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTax1.setText("Cost of Meal");

        jlblTotal13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal13.setText("Total Cost Made");

        jTotal11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSubTotal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlblSubTotal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblSubTotal1.setText("Cost of Drinks");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTax1)
                    .addComponent(jlblTotal13)
                    .addComponent(jlblSubTotal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSubTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTaxField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaxField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTax1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSubTotal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotal11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal13))
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 340, 140));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        jlblTotal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal1.setText("Vanilla Milk Shake");

        jTotal1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal1.setText("0");

        jlblTotal2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal2.setText("Chocolate Milk Shake");

        jTotal2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal2.setText("0");

        jlblTotal3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal3.setText("Milk Shake");

        jTotal3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal3.setText("0");

        jlblTotal4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblTotal4.setText("Drinks");

        jlblTotal6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal6.setText("Classic Vanilla");

        jTotal4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal4.setText("0");
        jTotal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotal4ActionPerformed(evt);
            }
        });

        jlblTotal7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal7.setText("Vanilla Cone");

        jTotal5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTotal5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTotal5.setText("0");
        jTotal5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTotal5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotal3)
                    .addComponent(jlblTotal7)
                    .addComponent(jlblTotal6)
                    .addComponent(jlblTotal1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlblTotal2)))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal4)
                    .addComponent(jTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblTotal3)
                            .addComponent(jTotal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jlblTotal4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal7)
                    .addComponent(jTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal6)
                    .addComponent(jTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal1)
                    .addComponent(jTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal2)
                    .addComponent(jTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 340, 300));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        jTaxField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jlblTax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTax.setText("Tax");

        jlblSubTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblSubTotal.setText("SubTotal");

        jlblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblTotal.setText("Total");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTax)
                    .addComponent(jlblTotal)
                    .addComponent(jlblSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblSubTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 340, 140));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 360, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalButtonActionPerformed

    private void jReceiptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReceiptButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jReceiptButtonActionPerformed

    private void jTotal5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotal5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotal5ActionPerformed

    private void jTotal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotal6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotal6ActionPerformed

    private void jTotal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTotal4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotal4ActionPerformed

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
            java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OO_Restaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OO_Restaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jReceiptButton;
    private javax.swing.JButton jResetButton;
    private javax.swing.JTextField jSubTotal;
    private javax.swing.JTextField jSubTotal1;
    private javax.swing.JTextField jTaxField;
    private javax.swing.JTextField jTaxField1;
    private javax.swing.JTextField jTotal;
    private javax.swing.JTextField jTotal1;
    private javax.swing.JTextField jTotal10;
    private javax.swing.JTextField jTotal11;
    private javax.swing.JTextField jTotal2;
    private javax.swing.JTextField jTotal3;
    private javax.swing.JTextField jTotal4;
    private javax.swing.JTextField jTotal5;
    private javax.swing.JTextField jTotal6;
    private javax.swing.JTextField jTotal7;
    private javax.swing.JTextField jTotal8;
    private javax.swing.JTextField jTotal9;
    private javax.swing.JButton jTotalButton;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblSubTotal1;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTax1;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblTotal1;
    private javax.swing.JLabel jlblTotal10;
    private javax.swing.JLabel jlblTotal11;
    private javax.swing.JLabel jlblTotal12;
    private javax.swing.JLabel jlblTotal13;
    private javax.swing.JLabel jlblTotal2;
    private javax.swing.JLabel jlblTotal3;
    private javax.swing.JLabel jlblTotal4;
    private javax.swing.JLabel jlblTotal5;
    private javax.swing.JLabel jlblTotal6;
    private javax.swing.JLabel jlblTotal7;
    private javax.swing.JLabel jlblTotal8;
    private javax.swing.JLabel jlblTotal9;
    // End of variables declaration//GEN-END:variables
}
