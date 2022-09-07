/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import static com.sun.scenario.effect.impl.prism.PrEffectHelper.render;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author user
 */
public class Graf extends javax.swing.JFrame {
Form form = new Form();
Regular regular = new Regular();
    /**
     * Creates new form Graf
     */
    public Graf() {
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

        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(102, 102, 102));
        panel.setLayout(new javax.swing.BoxLayout(panel, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setText("Build");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Критерій регулярності для prognoz1");

        t1.setColumns(20);
        t1.setRows(5);
        jScrollPane1.setViewportView(t1);

        jLabel2.setText("Критерій регулярності для prognoz2");

        jLabel3.setText("Оптимальна модель");

        jButton2.setText("Назад");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(307, 307, 307)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(19, 19, 19)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

@SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            float sd = 0;
            XYSeriesCollection dataset = new XYSeriesCollection( );  
            float x1 = 0;
           float x2 = 0 ;
           float x3 = 0;
           float x4 = 0;
           float x5 = 0;
           float x6 = 0;
           float x7 = 0;
           float x8 =0;
           float x9 =0;
            String url = "jdbc:mysql://localhost:3306/db_diplom";
        String username = "Andrey";
        String password = "1111";
        Connection con = DriverManager.getConnection(url,username,password);
        
        
        
        
        Statement stmt = con.createStatement();
                
        
         
      
       String Query = "SELECT y FROM data WHERE id_data IN (SELECT id_data FROM info WHERE year >= '1999' and year <= '2011')";
       
        
        ResultSet rs = stmt.executeQuery(Query);
         XYSeries real = new XYSeries( "real" );  
          XYSeries prog = new XYSeries( "prognoz1" ); 
           XYSeries progx = new XYSeries( "prognoz2" );
          
        int i = 1999;
        while(rs.next()){
            
            real.add( i ,rs.getFloat(1));   
            sd = rs.getFloat(1);
            i++;
        }
        
        float[] prog1 = form.prognoz1;
        float[] prog2 = form.prognoz2;
     /*  Statement stmt1 = con.createStatement();
                
        
         
      
       String Query1 = "SELECT year FROM testview WHERE id_data IN (SELECT id_data FROM info WHERE year >= '1999' and year <= '2011')";
       
        
        ResultSet rs1 = stmt1.executeQuery(Query1);*/
        
     for (int d=1999, j = 0;d<2012;d++,j++){
            prog.add( d ,prog1[j]);
        }
     
        
    for (int d=1999, j = 0;d<2012;d++,j++){
            progx.add( d ,prog2[j]);
        }        
        float r1 = form.regul1;
      float r2 = form.regul2;
        String label1 = Float.toString(r1);
        String label2 = Float.toString(r2);
        System.out.println(r1 + "    " + r2);
        l1.setText(label1);
        l2.setText(label2);
        if(r1<r2){
            t1.setText("y = " + form.koef1[0] + " + " + form.koef1[1] + "*x1 "+ " + " + form.koef1[2] + "*x2 "+ " + " +form.koef1[3] + "*x3"+ " + " +form.koef1[4] + "*x4"+ " + " +form.koef1[5] + "*x5 "+ " + " +form.koef1[6] + "*x6 "+ " + " +form.koef1[7] + "*x7 "+ " + " +form.koef1[8] + "*x8 "+ " + " +form.koef1[9] + "*x9 "+ " + " +form.koef1[10] + "*x1*x1 "+ " + " + form.koef1[11] + "*x2*x2 "+ " + " + form.koef1[12] + "*x3*x3 "+ " + " + form.koef1[13] + "*x4*x4 "+ " + " + form.koef1[14] + "*x5*x5 "+ " + " + form.koef1[15] + "*x6*x6 "+ " + " + form.koef1[16] + "*x7*x7 "+ " + " + form.koef1[17] + "*x8*x8 "+ " + " + form.koef1[18] + "*x9*x9 ");
        }
        else if(r1>r2){
            t1.setText("y = " + form.koef2[0] + " + " + form.koef2[1] + "*x1 "+ " + " + form.koef2[2] + "*x2 "+ " + " +form.koef2[3] + "*x3"+ " + " +form.koef2[4] + "*x4"+ " + " +form.koef2[5] + "*x5 "+ " + " +form.koef2[6] + "*x6 "+ " + " +form.koef2[7] + "*x7 "+ " + " +form.koef2[8] + "*x8 "+ " + " +form.koef2[9] + "*x9 "+ " + " +form.koef2[10] + "*x1*x2 "+ " + " + form.koef2[11] + "*x2*x3 "+ " + " + form.koef2[12] + "*x3*x4 "+ " + " + form.koef2[13] + "*x4*x5 "+ " + " + form.koef2[14] + "*x5*x6 "+ " + " + form.koef2[15] + "*x6*x7 "+ " + " + form.koef2[16] + "*x7*x8 "+ " + " + form.koef2[17] + "*x8*x9 "+ " + " + form.koef2[18] + "*x9*x1 ");
        }
        else{
            t1.setText("Моделі однакові");
        }
        //System.out.println(prognoz);
        dataset.addSeries( real ); 
        dataset.addSeries( prog ); 
        dataset.addSeries( progx ); 
        
        JFreeChart chart = ChartFactory.createXYLineChart("Result","", "", dataset, PlotOrientation.VERTICAL, true, true, false);
        XYPlot catplot = chart.getXYPlot();
        ChartPanel chartpanel = new ChartPanel(chart);
          XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );
      renderer.setSeriesPaint( 0 , Color.GREEN );
      renderer.setSeriesPaint( 1 , Color.RED);
      renderer.setSeriesPaint( 2 , Color.BLUE);
       renderer.setSeriesStroke( 0 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 1 , new BasicStroke( 3.0f ) );
      renderer.setSeriesStroke( 2 , new BasicStroke( 3.0f ) );
    
     
      catplot.setRenderer(renderer); 
    
        
       
        panel.removeAll();
        panel.add(chartpanel, BorderLayout.CENTER);
        panel.validate();
      
       // System.out.println(r);
       // System.out.println(label);
        }
        
            catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.toString());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Form form = new Form();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextArea t1;
    // End of variables declaration//GEN-END:variables
}