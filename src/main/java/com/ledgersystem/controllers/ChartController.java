package com.ledgersystem.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.LineChart;
import javafx.collections.FXCollections;

public class ChartController {
    @FXML private PieChart transactionPieChart;
    @FXML private LineChart<String, Number> balanceLineChart;

    public void initialize() {
        updatePieChart();
        updateLineChart();
    }

    private void updatePieChart() {
        // Sample data
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Debit", totalDebit),
                new PieChart.Data("Credit", totalCredit)
        );
        transactionPieChart.setData(pieChartData);
    }

    private void updateLineChart() {
        // Implement balance trend chart
    }
}