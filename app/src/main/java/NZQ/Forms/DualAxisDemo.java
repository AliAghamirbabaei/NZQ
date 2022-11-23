/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NZQ.Forms;

import java.awt.Color;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author muhamadtalebi
 */
public class DualAxisDemo extends ApplicationFrame {

    /**
     * Creates a new demo instance.
     *
     * @param title the frame title.
     */
    public DualAxisDemo(final String title) {

        super(title);

        final CategoryDataset dataset1 = createDataset1();

        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
                "نمودار بدهکار/بستانکار", // chart title
                "تاریخ", // domain axis label
                "مقدار(تومان)", // range axis label
                dataset1, // data
                PlotOrientation.VERTICAL,
                true, // include legend
                true, // tooltips?
                false // URL generator?  Not required...
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...
        chart.setBackgroundPaint(Color.white);
//        chart.getLegend().setAnchor(Legend.SOUTH);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0xEE, 0xEE, 0xFF));
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);

        final CategoryDataset dataset2 = createDataset2();
        plot.setDataset(1, dataset2);
        plot.mapDatasetToRangeAxis(1, 1);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.DOWN_45);

        final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        plot.setRenderer(1, renderer2);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
        // OPTIONAL CUSTOMISATION COMPLETED.

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    private CategoryDataset createDataset1() {

        final String bedehkaarBar = "بدهکار";
        final String bestankaarBar = "بستانکار";

        final String date1 = "date 1";
        final String date2 = "date 2";
        final String date3 = "date 3";
        final String date4 = "date 4";
        final String date5 = "date 5";
        final String date6 = "date 6";
        final String date7 = "date 7";
        final String date8 = "date 8";

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, bedehkaarBar, date1);
        dataset.addValue(4.0, bedehkaarBar, date2);
        dataset.addValue(3.0, bedehkaarBar, date3);
        dataset.addValue(5.0, bedehkaarBar, date4);
        dataset.addValue(5.0, bedehkaarBar, date5);
        dataset.addValue(7.0, bedehkaarBar, date6);
        dataset.addValue(7.0, bedehkaarBar, date7);
        dataset.addValue(8.0, bedehkaarBar, date8);

        dataset.addValue(5.0, bestankaarBar, date1);
        dataset.addValue(7.0, bestankaarBar, date2);
        dataset.addValue(6.0, bestankaarBar, date3);
        dataset.addValue(8.0, bestankaarBar, date4);
        dataset.addValue(4.0, bestankaarBar, date5);
        dataset.addValue(4.0, bestankaarBar, date6);
        dataset.addValue(2.0, bestankaarBar, date7);
        dataset.addValue(1.0, bestankaarBar, date8);

        return dataset;

    }

    private CategoryDataset createDataset2() {

        final String series1 = "Fourth";

        final String category1 = "Category 1";
        final String category2 = "Category 2";
        final String category3 = "Category 3";
        final String category4 = "Category 4";
        final String category5 = "Category 5";
        final String category6 = "Category 6";
        final String category7 = "Category 7";
        final String category8 = "Category 8";

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(15.0, series1, category1);
        dataset.addValue(24.0, series1, category2);
        dataset.addValue(31.0, series1, category3);
        dataset.addValue(25.0, series1, category4);
        dataset.addValue(56.0, series1, category5);
        dataset.addValue(37.0, series1, category6);
        dataset.addValue(77.0, series1, category7);
        dataset.addValue(18.0, series1, category8);

        return dataset;

    }

    public static void main(final String[] args) {

        final DualAxisDemo demo = new DualAxisDemo("نمودار ترازنامه");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
