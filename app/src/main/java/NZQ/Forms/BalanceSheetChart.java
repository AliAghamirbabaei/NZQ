/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import NZQ.Model.Chart.BalanceModel;
import ViewModel.Report.DebtCreditReport;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author aliaghamirbabaei
 */
public class BalanceSheetChart extends javax.swing.JFrame {

    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;
    private static final long serialVersionUID = 1L;

    public BalanceSheetChart(String appTitle, ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        super(appTitle);
        this.paids = paids;
        this.prePaids = prePaids;

        // Create Dataset  
        CategoryDataset dataset = createDataset();

        //Create chart  
        JFreeChart chart = ChartFactory.createBarChart(
                "نمودار ترازنامه", //Chart Title  
                "روز", // Category axis  
                "میزان", // Value axis  
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false
        );

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
    }

    private CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        DebtCreditReport debtCreditReport = new DebtCreditReport(paids, prePaids);
        
        ArrayList<BalanceModel> debtData = debtCreditReport.generatePaidDateRange();

        System.out.println(debtData.size());
        for (BalanceModel balanceModel : debtData) {
            dataset.addValue(balanceModel.getPrice(), balanceModel.getTransactionType().getName(), balanceModel.getDate().getYear() + "-" + balanceModel.getDate().getMonth() + "-" + balanceModel.getDate().getDay());
        }
        
        // Population in 2005  
//        dataset.addValue(90000, "بدهکار", "2022-11-24");
//        dataset.addValue(70000, "بستانکار", "2022-11-24");
//
//        // Population in 2010
//        dataset.addValue(12000, "بدهکار", "2022-11-25");
//        dataset.addValue(10000, "بستانکار", "2022-11-25");
//
//        // Population in 2015
//        dataset.addValue(50000, "بدهکار", "2022-11-27");
//        dataset.addValue(40000, "بستانکار", "2022-11-27");

        return dataset;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        PaidManager paidManager = new PaidManager();
        PrePaidManager prePaidManager = new PrePaidManager();
        SwingUtilities.invokeAndWait(() -> {
            BalanceSheetChart example = new BalanceSheetChart("نمودار ترازنامه", paidManager.paids, prePaidManager.prePaids);
            example.setSize(1024, 720);
            example.setLocationRelativeTo(null);
            example.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            example.setVisible(true);
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
