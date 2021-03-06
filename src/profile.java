
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class profile extends javax.swing.JFrame {
    private candidat c=null;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * Creates new form profile
     * @param c
     */
    public profile(candidat c) {
        initComponents();
        this.c=c;
        load();
        load_ver();
        load_exam();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        sp = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        date_n = new javax.swing.JLabel();
        lieu = new javax.swing.JLabel();
        genr = new javax.swing.JLabel();
        group = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        date_i = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        etat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(ConBD.color);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Montan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
            Table1.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 90, 290, 390));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingenieur", "Date", "Type", "Resultat", "Observation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(3).setResizable(false);
            table2.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 690, 460));

        sp.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel1.add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 150, 30));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 102));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 80, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imageMousePressed(evt);
            }
        });
        jPanel2.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, 100));

        nom.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(51, 0, 102));
        nom.setText("nom");
        nom.setToolTipText("");
        jPanel2.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 200, 30));

        prenom.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(51, 0, 102));
        prenom.setText("prenom");
        prenom.setToolTipText("");
        jPanel2.add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 30));

        date_n.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        date_n.setForeground(new java.awt.Color(51, 0, 102));
        date_n.setText("date naissance");
        date_n.setToolTipText("");
        jPanel2.add(date_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 30));

        lieu.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lieu.setForeground(new java.awt.Color(51, 0, 102));
        lieu.setText("lieu");
        lieu.setToolTipText("");
        jPanel2.add(lieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 30));

        genr.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        genr.setForeground(new java.awt.Color(51, 0, 102));
        genr.setText("genr");
        genr.setToolTipText("");
        jPanel2.add(genr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 200, 30));

        group.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        group.setForeground(new java.awt.Color(51, 0, 102));
        group.setText("group");
        group.setToolTipText("");
        jPanel2.add(group, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 200, 30));

        adress.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        adress.setForeground(new java.awt.Color(51, 0, 102));
        adress.setText("adress");
        adress.setToolTipText("");
        jPanel2.add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 30));

        tel.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        tel.setForeground(new java.awt.Color(51, 0, 102));
        tel.setText("tel");
        tel.setToolTipText("");
        jPanel2.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 30));

        date_i.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        date_i.setForeground(new java.awt.Color(51, 0, 102));
        date_i.setText("date ins");
        date_i.setToolTipText("");
        jPanel2.add(date_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, 30));

        type.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        type.setForeground(new java.awt.Color(51, 0, 102));
        type.setText("type p");
        type.setToolTipText("");
        jPanel2.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 30));

        etat.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        etat.setForeground(new java.awt.Color(51, 0, 102));
        etat.setText("etat");
        etat.setToolTipText("");
        jPanel2.add(etat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 270, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1320, 510));

        setSize(new java.awt.Dimension(1316, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMousePressed
        
    }//GEN-LAST:event_imageMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //this.setExtendedState(ICONIFIED);
        int s=(Integer) sp.getValue();
        if(s>0){
            add_versment(s);
        }
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JLabel adress;
    private javax.swing.JLabel date_i;
    private javax.swing.JLabel date_n;
    private javax.swing.JLabel etat;
    private javax.swing.JLabel genr;
    private javax.swing.JLabel group;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lieu;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JSpinner sp;
    private javax.swing.JTable table2;
    private javax.swing.JLabel tel;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

    private void load() {
       nom.setText(c.getNOM());
       prenom.setText(c.getPrenom());
       date_n.setText(""+c.getDate_n());
       lieu.setText(c.getLieu());
       genr.setText(c.getgenre());
       group.setText(c.getGroupage());
       tel.setText(c.getTél());
       type.setText(c.gettype());
       adress.setText(c.getadress());
       date_i.setText(""+c.getDate_i());
       etat.setText(c.getetat());
       ImageIcon newIcon = c.getphoto();
        Image img = newIcon.getImage();
        Image newimg = img.getScaledInstance(100, 100, Image.SCALE_AREA_AVERAGING);
        ImageIcon curent_image = new ImageIcon(newimg);
        image.setIcon(curent_image);
        
    }

    private void load_ver() {
        DefaultTableModel model = (DefaultTableModel)Table1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        try {            
            Statement st = ConBD.getConnection().createStatement();
            String q="select * from versement where code="+c.getCode()+" order by date desc";
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                row[0] = rs.getDate("date");
                row[1] = rs.getDouble("somme");
                model.addRow(row);
            }     
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(null,"ERREU load vers :"+ex);
        }
    }

    private void add_versment(int s) {
        try {
                String UpdateQuery = "INSERT INTO `versement`( `code`, `date`, `somme`) VALUES (?,?,?)";
                PreparedStatement ps = ConBD.getConnection().prepareStatement(UpdateQuery);
                ps.setInt(1,c.getCode());
                ps.setString(2,dateFormat.format(new Date()));
                ps.setInt(3,s);
                ps.executeUpdate();
                load_ver();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(jPanel1, e);
            }    
    }

    private void load_exam() {
        DefaultTableModel model = (DefaultTableModel)table2.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        try {            
            Statement st = ConBD.getConnection().createStatement();
            String q="select nom_ing,prenom_ing,date_e,p.type,obs,statu from pass p,examen e,ingenieur i where code="+c.getCode()+" and e.id=p.id and i.id_i=e.id_i order by date_e desc";
            ResultSet rs = st.executeQuery(q);
            while(rs.next())
            {
                row[0] = rs.getString("nom_ing")+" "+rs.getString("prenom_ing");
                row[1] = rs.getDate("date_e");
                row[2] = rs.getString("type");
                row[3] = rs.getString("statu");
                row[4] = rs.getString("obs");
                model.addRow(row);
            }     
        } catch (SQLException  ex) {
            JOptionPane.showMessageDialog(null,"ERREU load ex:"+ex);
        }
    }

}
