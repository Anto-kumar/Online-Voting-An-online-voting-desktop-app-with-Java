/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinevoting;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class change_rec extends javax.swing.JFrame {

    public change_rec() {
        initComponents();
    }


    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        vote = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        update_acc = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        delete_acc = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        insert = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        NID = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        male_r = new javax.swing.JRadioButton();
        female_r = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        yes = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        other_r = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        search1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        show_acc1 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        acc_table = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        count = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        winner = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");

        jPanel1.setBackground(new java.awt.Color(45, 204, 130));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/dash.png")));
        jLabel1.setText("Dashboard");

        jPanel3.setBackground(new java.awt.Color(45, 204, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        update_acc.setBackground(new java.awt.Color(73, 160, 174));
        update_acc.setFont(new java.awt.Font("SansSerif", 0, 18));
        update_acc.setForeground(new java.awt.Color(255, 255, 255));
        update_acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png")));
        update_acc.setText("Update");
        update_acc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_accActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(update_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(45, 204, 130));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        delete_acc.setBackground(new java.awt.Color(73, 160, 174));
        delete_acc.setFont(new java.awt.Font("SansSerif", 0, 18));
        delete_acc.setForeground(new java.awt.Color(255, 255, 255));
        delete_acc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png")));
        delete_acc.setText("Delete");
        delete_acc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_accActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(delete_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(45, 204, 130));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        insert.setBackground(new java.awt.Color(73, 160, 174));
        insert.setFont(new java.awt.Font("SansSerif", 1, 18));
        insert.setForeground(new java.awt.Color(255, 255, 255));
        insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/insert.png")));
        insert.setText("Insert");
        insert.setBorder(null);
        insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(45, 204, 130));
        jPanel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        jButton2.setBackground(new java.awt.Color(73, 160, 174));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 18));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sats.png")));
        jButton2.setText("Stats");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OPERATIONS");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/detail.png")));
        jLabel4.setText("Details");

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("SansSerif", 0, 12));
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        name.setFont(new java.awt.Font("SansSerif", 0, 12));
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        fname.setFont(new java.awt.Font("SansSerif", 0, 12));
        fname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        NID.setFont(new java.awt.Font("SansSerif", 0, 12));
        NID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        NID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIDActionPerformed(evt);
            }
        });

        city.setFont(new java.awt.Font("SansSerif", 0, 12));
        city.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        address.setFont(new java.awt.Font("SansSerif", 0, 12));
        address.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        year.setFont(new java.awt.Font("SansSerif", 0, 12));
        year.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setText(" ID");

        jLabel6.setText("NAME");

        jLabel7.setText("FATHER NAME");

        jLabel18.setText("NID");

        jLabel10.setText("BIRTH YEAR");

        jLabel11.setText("GENDER");

        jLabel12.setText("ADDRESS");

        jLabel13.setText("CITY");

        gender.add(male_r);
        male_r.setText("MALE");
        male_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male_rActionPerformed(evt);
            }
        });

        gender.add(female_r);
        female_r.setText("FEMALE");

        vote.add(no);
        no.setText("NO");

        vote.add(yes);
        yes.setText("YES");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        jLabel14.setText("VOTE");

        gender.add(other_r);
        other_r.setText("OTHER");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14)
                    .addComponent(jLabel5)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel18)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(male_r)
                                .addGap(18, 18, 18)
                                .addComponent(female_r)
                                .addGap(18, 18, 18)
                                .addComponent(other_r))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(yes)
                                .addGap(18, 18, 18)
                                .addComponent(no))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(fname)
                                    .addComponent(NID))))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male_r)
                            .addComponent(female_r)
                            .addComponent(other_r))))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yes)
                    .addComponent(no))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        search1.setFont(new java.awt.Font("SansSerif", 0, 12));
        search1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search2.png")));
        jLabel9.setText("Search");

        show_acc1.setBackground(new java.awt.Color(73, 160, 174));
        show_acc1.setFont(new java.awt.Font("SansSerif", 0, 18));
        show_acc1.setForeground(new java.awt.Color(255, 255, 255));
        show_acc1.setText("Show Record");
        show_acc1.setBorder(null);
        show_acc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_acc1ActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(73, 160, 174));
        clear.setFont(new java.awt.Font("SansSerif", 0, 18));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.setBorder(null);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(show_acc1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(show_acc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel9)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        acc_table.setFont(new java.awt.Font("SansSerif", 0, 12));
        acc_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "FATHER NAME", "NID", "GENDER", "YEAR", "ADDRESS", "CITY", "VOTE"
            }
        ));
        acc_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acc_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(acc_table);

        jLabel17.setFont(new java.awt.Font("SansSerif", 0, 18));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Records");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel17)))
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(73, 160, 174));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/total.png")));
        jLabel2.setText("Total");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        count.setFont(new java.awt.Font("SansSerif", 1, 36));
        count.setForeground(new java.awt.Color(255, 255, 255));
        count.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addComponent(count)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(count))
                .addGap(41, 41, 41))
        );

        jPanel10.setBackground(new java.awt.Color(73, 160, 174));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 36));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/win.png")));
        jLabel15.setText("Winner");

        winner.setFont(new java.awt.Font("SansSerif", 1, 36));
        winner.setForeground(new java.awt.Color(255, 255, 255));
        winner.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel15)
                .addGap(138, 138, 138)
//                .addComponent(winner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                  // .addComponent(winner)
                )
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(45, 204, 130));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));

        jButton3.setBackground(new java.awt.Color(73, 160, 174));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 18));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout2.png")));
        jButton3.setText("Logout");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void male_rActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void NIDActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void acc_tableMouseClicked(java.awt.event.MouseEvent evt) {
        sqlcon db=new sqlcon();
        DefaultTableModel tb1=(DefaultTableModel)acc_table.getModel();
        int selectedRowIndex=acc_table.getSelectedRow();

        String gender=tb1.getValueAt(selectedRowIndex, 4).toString();
        if(gender.equals("MALE")){
            male_r.setSelected(true);
        }else if(gender.equals("FEMALE")){
            female_r.setSelected(true);
        }
        else{
            other_r.setSelected(true);
        }

        String vote=tb1.getValueAt(selectedRowIndex, 8).toString();
        if(vote.equals("YES")){
            yes.setSelected(true);
        }else{
            no.setSelected(true);
        }

        id.setText(tb1.getValueAt(selectedRowIndex, 0).toString());
        name.setText(tb1.getValueAt(selectedRowIndex, 1).toString());
        fname.setText(tb1.getValueAt(selectedRowIndex, 2).toString());
        NID.setText(tb1.getValueAt(selectedRowIndex, 3).toString());
        //        acc_age.setText(tb1.getValueAt(selectedRowIndex, 4).toString());
        //acc_gender.setText(tb1.getValueAt(selectedRowIndex, 5).toString());
        year.setText(tb1.getValueAt(selectedRowIndex, 5).toString());
        address.setText(tb1.getValueAt(selectedRowIndex, 6).toString());
        city.setText(tb1.getValueAt(selectedRowIndex, 7).toString());
        //        acc_contact.setText(tb1.getValueAt(selectedRowIndex, 9).toString());
        //        acc_username.setText(tb1.getValueAt(selectedRowIndex, 10).toString());
        //        acc_pwd.setText(tb1.getValueAt(selectedRowIndex, 11).toString());
    }

    private void show_acc1ActionPerformed(java.awt.event.ActionEvent evt) {
        sqlcon db=new sqlcon();

        ResultSet rs=db.fetch_people();
        DefaultTableModel tb1=(DefaultTableModel)acc_table.getModel();
        tb1.setRowCount(0);
        try{
            while(rs.next()){
                String []data={rs.getString("Id"),rs.getString("Name"),rs.getString("F_Name"),rs.getString("NID"),rs.getString("Gender"),rs.getString("Birth_Year"),rs.getString("Address"),rs.getString("City"),rs.getString("Vote")};
                tb1.addRow(data);

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {

        sqlcon db=new sqlcon();

        ResultSet rs=db.search1(search1.getText());
        DefaultTableModel tb1=(DefaultTableModel)acc_table.getModel();
        tb1.setRowCount(0);
        try{
            while(rs.next()){
                String []data={rs.getString("Id"),rs.getString("Name"),rs.getString("F_Name"),rs.getString("NID"),rs.getString("Gender"),rs.getString("Birth_Year"),rs.getString("Address"),rs.getString("City"),rs.getString("Vote")};
                tb1.addRow(data);

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void delete_accActionPerformed(java.awt.event.ActionEvent evt) {
        sqlcon db=new sqlcon();
        db.delete_people(Integer.parseInt(id.getText()));
        try{

            ResultSet rs=db.fetch_people();
            DefaultTableModel tb1=(DefaultTableModel)acc_table.getModel();
            JOptionPane.showMessageDialog(this,"DATA DELETE","DELETE SUCCESSFULLY",1);

            tb1.setRowCount(0);
            while(rs.next()){
                String []data={rs.getString("Id"),rs.getString("Name"),rs.getString("F_Name"),rs.getString("NID"),rs.getString("Gender"),rs.getString("Birth_Year"),rs.getString("Address"),rs.getString("City"),rs.getString("Vote")};
                tb1.addRow(data);}

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"DATA DELETE","NOT DELETE",0);
            System.out.println(e);
        }
    }

    private void update_accActionPerformed(java.awt.event.ActionEvent evt) {

        sqlcon db=new sqlcon();
        male_r.setActionCommand("MALE");
        female_r.setActionCommand("FEMALE");
        other_r.setActionCommand("OTHER");
        String gender1 ="";
        if ((gender.getSelection())!=null){

            gender1=gender.getSelection().getActionCommand();
        }

        yes.setActionCommand("YES");
        no.setActionCommand("NO");
        String vote1 ="";
        if ((vote.getSelection())!=null){

            vote1=vote.getSelection().getActionCommand();
        }

        try{
            if(name.getText().equals("") || fname.getText().equals("") || NID.getText().equals("") || year.getText().equals("") || address.getText().equals("") || city.getText().equals("")){
                JOptionPane.showMessageDialog(this,"EMPTY FIELD","EMPTY FIELD INSERT",0);
            }
            else{
                db.update_people(Integer.parseInt(id.getText()),name.getText(), fname.getText(), Integer.parseInt(NID.getText()), gender1, Integer.parseInt(year.getText()), address.getText(), city.getText(), vote1);
            }

            JOptionPane.showMessageDialog(this,"DATA UPDATE","UPDATE SUCCESSFULLY",1);

            ResultSet rs=db.fetch_people();
            DefaultTableModel tb1=(DefaultTableModel)acc_table.getModel();
            tb1.setRowCount(0);
            while(rs.next()){
                String []data={rs.getString("Id"),rs.getString("Name"),rs.getString("F_Name"),rs.getString("NID"),rs.getString("Gender"),rs.getString("Birth_Year"),rs.getString("Address"),rs.getString("City"),rs.getString("Vote")};
                tb1.addRow(data);}

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"DATA UPDATE","NOT UPDATE",0);
            System.out.println(e);
        }
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        Stats ts =new Stats();
        ts.setVisible(true);
    }

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {
        sqlcon db= new sqlcon();
        male_r.setActionCommand("MALE");
        female_r.setActionCommand("FEMALE");
        other_r.setActionCommand("OTHER");
        String gender1 ="";
        if ((gender.getSelection())!=null){

            gender1=gender.getSelection().getActionCommand();
        }

        yes.setActionCommand("YES");
        no.setActionCommand("NO");
        String allow1 ="";
        if ((gender.getSelection())!=null){

            allow1=vote.getSelection().getActionCommand();
        }

        if(name.getText().equals("") || fname.getText().equals("") || NID.getText().equals("") || year.getText().equals("") || address.getText().equals("") || city.getText().equals("")){
        JOptionPane.showMessageDialog(this,"EMPTY FIELD","EMPTY FIELD INSERT",0);
    
    }
        else{
        db.add_people(name.getText(), fname.getText(), Integer.parseInt(NID.getText()), gender1, Integer.parseInt(year.getText()), address.getText(), city.getText(), allow1);
        JOptionPane.showMessageDialog(this,"DATA INSERT","INSERT SUCCESSFULLY",1);
        }

    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        id.setText("");
        name.setText("");
        fname.setText("");
        NID.setText("");
        year.setText("");
        address.setText("");
        city.setText("");
       
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
       
    }

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        mainlogin ml =new mainlogin();
        ml.setVisible(true);
    }

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {
        sqlcon db=new sqlcon();
            ResultSet rs=db.count();
            try {
            rs.next();
            count.setText(rs.getString("count(*)"));
            
        } catch (SQLException ex) {
            Logger.getLogger(votepanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {
        sqlcon db=new sqlcon();
            ResultSet rs=db.winner();
            try {
            rs.next();
            winner.setText(rs.getString("MAX(Party_vote)"));
            
        } catch (SQLException ex) {
            Logger.getLogger(votepanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change_rec().setVisible(true);
            }
        });
    }

    private javax.swing.JTable acc_table;
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JButton clear;
    private javax.swing.JTextField NID;
    private javax.swing.JLabel count;
    private javax.swing.JButton delete_acc;
    private javax.swing.JRadioButton female_r;
    private javax.swing.JTextField fname;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male_r;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton no;
    private javax.swing.JRadioButton other_r;
    private javax.swing.JTextField search1;
    private javax.swing.JButton show_acc1;
    private javax.swing.JButton update_acc;
    private javax.swing.ButtonGroup vote;
    private javax.swing.JLabel winner;
    private javax.swing.JTextField year;
    private javax.swing.JRadioButton yes;

    private void elseif(boolean equals) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
