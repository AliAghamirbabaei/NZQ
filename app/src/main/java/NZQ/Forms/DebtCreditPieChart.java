/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import ViewModel.Report.DebtCreditReport;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.util.ArrayList;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author aliaghamirbabaei
 */
public class DebtCreditPieChart extends javax.swing.JFrame {

    private static ArrayList<Paid> paids;
    private static ArrayList<PrePaid> prePaids;

    public DebtCreditPieChart(String title, ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        super(title);
        this.paids = paids;
        this.prePaids = prePaids;
        setContentPane(createDemoPanel());
    }

    private static PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        DebtCreditReport debtCreditReport = new DebtCreditReport(paids, prePaids);

        dataset.setValue("بدهکار", debtCreditReport.getSumOfDebts());
        dataset.setValue("بستانکار", debtCreditReport.getSumOfCredits());

        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart("مجموع بدهکار و بستانکار", dataset, true, true, true);
        return chart;
    }

    public static JPanel createDemoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        PaidManager paidManager = new PaidManager();
        PrePaidManager prePaidManager = new PrePaidManager();
        DebtCreditPieChart demo = new DebtCreditPieChart("نمودار بدهکار و بستانکار", paidManager.paids, prePaidManager.prePaids);
        demo.setSize(560, 367);
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
