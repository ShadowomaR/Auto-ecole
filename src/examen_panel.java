
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHADOW
 */
public class examen_panel extends javax.swing.JPanel {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<candidat> c,c_e;
    private Map<String,Integer> hm = new HashMap<>();
    private Statement st;
    private ResultSet rs;
    private String q,type;
    private int examen_id=0;
    private ArrayList<Integer> exams;
    
    /**
     * Creates new form NewJPanel
     */
    public examen_panel() {
        initComponents();
        load_ingenieurs();
        load_examen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Ajouter = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Suprimer = new javax.swing.JMenuItem();
        obs = new javax.swing.JMenuItem();
        res = new javax.swing.JMenuItem();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        Modifier = new javax.swing.JMenuItem();
        Suprime = new javax.swing.JMenuItem();
        info_pan = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        date_e = new com.toedter.calendar.JDateChooser();
        noms = new javax.swing.JComboBox<>();
        type_p = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabl = new javax.swing.JTable();
        cherch = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabl1 = new javax.swing.JTable();
        label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        nom = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        typ = new javax.swing.JLabel();

        Ajouter.setText("Ajouter");
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AjouterMousePressed(evt);
            }
        });
        jPopupMenu1.add(Ajouter);

        Suprimer.setText("Suprimer");
        Suprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SuprimerMousePressed(evt);
            }
        });
        Suprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuprimerActionPerformed(evt);
            }
        });
        jPopupMenu2.add(Suprimer);

        obs.setText("Observation");
        obs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                obsMousePressed(evt);
            }
        });
        jPopupMenu2.add(obs);

        res.setText("Resultat");
        jPopupMenu2.add(res);

        Modifier.setText("Modifier");
        Modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ModifierMousePressed(evt);
            }
        });
        jPopupMenu3.add(Modifier);

        Suprime.setText("Suprimer");
        Suprime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SuprimeMousePressed(evt);
            }
        });
        jPopupMenu3.add(Suprime);

        setBackground(ConBD.color);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        info_pan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153))), "Nouveu examen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        info_pan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_btn.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        add_btn.setText("Ajouter");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        info_pan.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, 30));

        date_e.setDate(new Date());
        date_e.setDateFormatString("dd-MM-yyyy");
        date_e.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        info_pan.add(date_e, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 170, 30));

        noms.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        noms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        noms.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nomsItemStateChanged(evt);
            }
        });
        noms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomsActionPerformed(evt);
            }
        });
        info_pan.add(noms, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 250, 30));

        type_p.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        type_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C1", "C2", "C3" }));
        info_pan.add(type_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, 30));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("TYPE PERMI :");
        jLabel6.setToolTipText("");
        info_pan.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("INGENIEUR :");
        jLabel10.setToolTipText("");
        info_pan.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 30));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        info_pan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 30, 30));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("DATE EXAMEN :");
        jLabel9.setToolTipText("");
        info_pan.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 90, 30));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-icon.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        info_pan.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, 30));

        add(info_pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 420, 270));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 760, 30, 10));

        tabl.setAutoCreateRowSorter(true);
        tabl.setBackground(new java.awt.Color(204, 204, 204));
        tabl.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tabl.setForeground(new java.awt.Color(0, 0, 51));
        tabl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "DATE NAISSENCE", "GENRE", "DATE INCRIPTION", "TELEPHONE", "ETAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabl.setComponentPopupMenu(jPopupMenu1);
        tabl.setRowHeight(20);
        tabl.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabl.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane6.setViewportView(tabl);
        if (tabl.getColumnModel().getColumnCount() > 0) {
            tabl.getColumnModel().getColumn(0).setResizable(false);
            tabl.getColumnModel().getColumn(1).setResizable(false);
            tabl.getColumnModel().getColumn(2).setResizable(false);
            tabl.getColumnModel().getColumn(3).setResizable(false);
            tabl.getColumnModel().getColumn(4).setResizable(false);
            tabl.getColumnModel().getColumn(5).setResizable(false);
            tabl.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 1300, 290));

        cherch.setEditable(false);
        cherch.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cherch.setForeground(new java.awt.Color(0, 0, 51));
        cherch.setToolTipText("");
        cherch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cherchKeyReleased(evt);
            }
        });
        add(cherch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 520, 40));

        tabl1.setAutoCreateRowSorter(true);
        tabl1.setBackground(new java.awt.Color(204, 204, 204));
        tabl1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tabl1.setForeground(new java.awt.Color(0, 0, 51));
        tabl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOM", "PRENOM", "DATE NAISSENCE", "GENRE", "DATE INCRIPTION", "TELEPHONE", "ETAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabl1.setComponentPopupMenu(jPopupMenu2);
        tabl1.setRowHeight(20);
        tabl1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tabl1.setSelectionForeground(new java.awt.Color(0, 0, 51));
        jScrollPane7.setViewportView(tabl1);
        if (tabl1.getColumnModel().getColumnCount() > 0) {
            tabl1.getColumnModel().getColumn(0).setResizable(false);
            tabl1.getColumnModel().getColumn(1).setResizable(false);
            tabl1.getColumnModel().getColumn(2).setResizable(false);
            tabl1.getColumnModel().getColumn(3).setResizable(false);
            tabl1.getColumnModel().getColumn(4).setResizable(false);
            tabl1.getColumnModel().getColumn(5).setResizable(false);
            tabl1.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 1300, 410));

        label.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 102));
        label.setText("LIST DES CANDIDATS");
        label.setToolTipText("");
        add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 780, 150, 30));

        table2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingenieur", "Date", "Tupe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setComponentPopupMenu(jPopupMenu3);
        jScrollPane1.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 720, 270));

        nom.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(0, 0, 102));
        add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 170, 30));

        date.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(0, 0, 102));
        add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 170, 30));

        typ.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        typ.setForeground(new java.awt.Color(0, 0, 102));
        add(typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void cherchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cherchKeyReleased
        load_candidat(cherch.getText());
    }//GEN-LAST:event_cherchKeyReleased

    private void nomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomsActionPerformed

    }//GEN-LAST:event_nomsActionPerformed

    private void nomsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nomsItemStateChanged

    }//GEN-LAST:event_nomsItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String t_nom = JOptionPane.showInputDialog(null,"Nom ","");
            String t_prenom = JOptionPane.showInputDialog(null,"Prenom ","");
            if(t_nom.isEmpty() || t_prenom.isEmpty()) JOptionPane.showMessageDialog(info_pan, "Invalid");
            else{
                add_ingenieur(t_nom,t_prenom);
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AjouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMousePressed
        Ajouter(c.get(tabl.getSelectedRow()).getCode(),c.get(tabl.getSelectedRow()).getetat());
    }//GEN-LAST:event_AjouterMousePressed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        add_exam(); 
        load_examen();
    }//GEN-LAST:event_add_btnActionPerformed

    private void SuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuprimerActionPerformed

    private void SuprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuprimerMousePressed
        Suprimer_c(c_e.get(tabl1.getSelectedRow()).getCode());
    }//GEN-LAST:event_SuprimerMousePressed

    private void ModifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifierMousePressed
        modifier(table2.getSelectedRow());
    }//GEN-LAST:event_ModifierMousePressed

    private void SuprimeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SuprimeMousePressed
        Suprimer(table2.getSelectedRow());
    }//GEN-LAST:event_SuprimeMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void obsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obsMousePressed
        try {
            JTextArea a=new JTextArea(2, 2);
            Object[] params = {"Observation",a};
            int rep =JOptionPane.showConfirmDialog(tabl1,params,"Ajouter une observation", JOptionPane.OK_CANCEL_OPTION);
            if(rep==0 && !a.getText().isEmpty()){
                update("obs",a.getText(),c_e.get(tabl1.getSelectedRow()).getCode());
            }
        } catch (HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_obsMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ajouter;
    private javax.swing.JMenuItem Modifier;
    private javax.swing.JMenuItem Suprime;
    private javax.swing.JMenuItem Suprimer;
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField cherch;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser date_e;
    private javax.swing.JPanel info_pan;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel label;
    private javax.swing.JLabel nom;
    private javax.swing.JComboBox<String> noms;
    private javax.swing.JMenuItem obs;
    private javax.swing.JMenuItem res;
    private javax.swing.JTable tabl;
    private javax.swing.JTable tabl1;
    private javax.swing.JTable table2;
    private javax.swing.JLabel typ;
    private javax.swing.JComboBox<String> type_p;
    // End of variables declaration//GEN-END:variables
    private void load_candidat(String string) {
        DefaultTableModel model = (DefaultTableModel)tabl.getModel();
        c=get_candidat(string);
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i = 0; i < c.size(); i++)
        {
            row[0] = c.get(i).getNOM();
            row[1] = c.get(i).getPrenom();
            row[2] = c.get(i).getDate_n();
            row[3] = c.get(i).getgenre();
            row[4] = c.get(i).getDate_i();
            row[5] = c.get(i).getTél();
            row[6] = c.get(i).getetat();
            model.addRow(row);
        }
    }
    private ArrayList<candidat> get_candidat(String d){
        ArrayList<candidat> c1=new ArrayList<>();
        try {            
            st = ConBD.getConnection().createStatement();
            if("".equals(d)) q="select * from candidat where type_p='"+type+"' and code not in(select code from pass where id="+examen_id+") order by etat desc ";
            else q="select * from candidat where type_p='"+type+"' and (nom like '%"+d+"%' or prenom like '%"+d+"%') and code not in(select code from pass where id="+examen_id+") order by etat desc";
            rs = st.executeQuery(q);
            candidat b;
            while(rs.next())
            {
                b=new candidat(rs.getInt("code"),rs.getString("nom"),rs.getString("prenom"),rs.getDate("date_n"),rs.getString("lieu_n"),rs.getString("groupage"),rs.getString("sexe"),rs.getString("tel"), rs.getString("adress"),rs.getDate("date_inscri"),rs.getString("type_p"),rs.getString("etat"),null);
                c1.add(b);
            }        
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
        }   
        return c1;
    }

    private void load_ingenieurs() {
        try {            
            st = ConBD.getConnection().createStatement();
            q="SELECT * FROM `ingenieur` order by nom_ing desc";
            rs = st.executeQuery(q);
            noms.removeAllItems();
            while(rs.next())
            {
                hm.put(rs.getString("nom_ing")+" "+rs.getString("prenom_ing"),rs.getInt("id_i"));
                noms.addItem(rs.getString("nom_ing")+" "+rs.getString("prenom_ing"));
            }  
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
        }   
    }

    private void add_ingenieur(String t_nom, String t_prenom) {
        if(exist_ingenieur(t_nom,t_prenom)!=0) JOptionPane.showMessageDialog(info_pan, "Cette personne exist");
        else{
            try {
                String UpdateQuery = "INSERT INTO `ingenieur`(`nom_ing`, `prenom_ing`) VALUES (?,?)";
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.setString(1,t_nom);
                ps.setString(2,t_prenom);
                ps.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
            load_ingenieurs();
        }
    }

    private int exist_ingenieur(String t_nom, String t_prenom) {
        try {            
            st = ConBD.getConnection().createStatement();
            q="SELECT * FROM `ingenieur` where nom_ing='"+t_nom+"' and prenom_ing='"+t_prenom+"'";
            rs = st.executeQuery(q);
            return rs.getFetchSize();
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
        }   
        return 1;
    }

    private void add_exam() {
        if (exist_examen(hm.getOrDefault(noms.getSelectedItem(),0),dateFormat.format(date_e.getDate()), (String) type_p.getSelectedItem())>0) JOptionPane.showMessageDialog(info_pan, "Examen exist");
        else {
            try {
                String UpdateQuery = "INSERT INTO `examen`(`id_i`, `date_e`, `type_p`) VALUES (?,?,?)";
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.setInt(1,hm.getOrDefault(noms.getSelectedItem(),0));
                ps.setString(2,dateFormat.format(date_e.getDate()));
                ps.setString(3, (String) type_p.getSelectedItem());
                type=(String) type_p.getSelectedItem();
                ps.executeUpdate();
                examen_id=exist_examen(hm.getOrDefault(noms.getSelectedItem(),0),dateFormat.format(date_e.getDate()), (String) type_p.getSelectedItem());
                activate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    private int exist_examen(int id, String date, String type) {
        try {            
            st = ConBD.getConnection().createStatement();
            q="SELECT * FROM `examen` WHERE `id_i`="+id+" and `date_e`='"+date+"' and `type_p`='"+type+"' ";
            rs = st.executeQuery(q);
            int a=0;
            while(rs.next())
            {
                a=rs.getInt("id");
            } 
            return a;
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
            return -1;
        }   
    }

    private void activate() {
        cherch.setEditable(true);
        load_candidat("");
        this.repaint();
    }
    private void load_candidat() {
        DefaultTableModel model = (DefaultTableModel)tabl1.getModel();
        c_e=get_candidat();
        model.setRowCount(0);
        Object[] row = new Object[7];
        for(int i = 0; i < c_e.size(); i++)
        {
            row[0] = c_e.get(i).getNOM();
            row[1] = c_e.get(i).getPrenom();
            row[2] = c_e.get(i).getDate_n();
            row[3] = c_e.get(i).getgenre();
            row[4] = c_e.get(i).getDate_i();
            row[5] = c_e.get(i).getTél();
            row[6] = c_e.get(i).getetat();
            model.addRow(row);
        }
    }
    private ArrayList<candidat> get_candidat(){
        ArrayList<candidat> c1=new ArrayList<>();
        try {            
            st = ConBD.getConnection().createStatement();
            q="select * from candidat where code in(select code from pass where id="+examen_id+") order by etat desc";
            rs = st.executeQuery(q);
            candidat b;
            while(rs.next())
            {
                b=new candidat(rs.getInt("code"),rs.getString("nom"),rs.getString("prenom"),rs.getDate("date_n"),rs.getString("lieu_n"),rs.getString("groupage"),rs.getString("sexe"),rs.getString("tel"), rs.getString("adress"),rs.getDate("date_inscri"),rs.getString("type_p"),rs.getString("etat"),null);
                c1.add(b);
            }        
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
        }   
        return c1;
    }

    private void load_examen() {
        try {            
            st = ConBD.getConnection().createStatement();
            q="select * from examen,ingenieur where examen.id_i=examen.id_i order by date_e desc";
            rs = st.executeQuery(q);
            DefaultTableModel model = (DefaultTableModel)table2.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            exams=new ArrayList<>();
            while(rs.next())
            {
                exams.add(rs.getInt("id"));
                row[0] = rs.getString("nom_ing")+" "+rs.getString("prenom_ing");
                row[1] = rs.getString("date_e");
                row[2] = rs.getString("type_p");
                model.addRow(row);
            }        
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(info_pan,"ERREU :"+ex);
        }   
    }

    private void Suprimer(int in) {
        examen_id=exams.get(in);
        try {
                String UpdateQuery = "DELETE FROM `examen` WHERE `id`="+examen_id;
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.executeUpdate();
                load_candidat();
                load_candidat("");
                load_examen();
                vider();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(table2, e);
            }
    }

    private void modifier(int id) {
        examen_id=exams.get(id);
        nom.setText(table2.getModel().getValueAt(id, 0).toString());
        date.setText(table2.getModel().getValueAt(id, 1).toString());
        typ.setText(table2.getModel().getValueAt(id, 2).toString());
        type=table2.getModel().getValueAt(id, 2).toString();
        activate();
        load_candidat("");
        load_candidat();
    }

    private void Ajouter(int code, String etat) {
        try {
                String UpdateQuery = "INSERT INTO `pass`(`id`, `code`, `type`) VALUES (?,?,?)";
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.setInt(1,examen_id);
                ps.setInt(2,code);
                ps.setString(3,etat);
                ps.executeUpdate();
                load_candidat();
                load_candidat("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(tabl1, e);
            }
    }

    private void Suprimer_c(int code) {
        try {
                String UpdateQuery = "DELETE FROM `pass` WHERE `id`="+examen_id+" and code="+code;
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.executeUpdate();
                load_candidat();
                load_candidat("");
                load_examen();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(table2, e);
            }
    }

    private void vider() {
        examen_id=0;
        nom.setText("");
        date.setText("");
        typ.setText("");
        type="";
    }

    private void update(String column, String string, int code) {
        try {
                String UpdateQuery = "UPDATE `pass` SET "+column+"='"+string+"' WHERE id="+examen_id+" and code="+code;
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.executeUpdate();
                load_candidat();
                load_candidat("");
                load_examen();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(table2, e);
            }
    }
}

