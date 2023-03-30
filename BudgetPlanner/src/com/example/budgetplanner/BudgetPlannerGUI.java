package com.example.budgetplanner;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BudgetPlannerGUI extends JFrame implements ActionListener {
	
	private JTextField incomeField;
	private JTextField[] expenseFields;
	private JLabel[] expenseLabels;
	private JLabel totalExpensesLabel;
	private JButton calculateButton;
	
    public BudgetPlannerGUI() {
    	setTitle("Budget Planner");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));

        // Income input
        add(new JLabel("Monthly Income:"));
        incomeField = new JTextField();
        add(incomeField);

        // Expense inputs
        String[] categories = {"Rent", "Food", "Utilities", "Transportation/Gas", "Credit Card Payments", "Savings"};
        expenseFields = new JTextField[categories.length];
        expenseLabels = new JLabel[categories.length];

        for (int i = 0; i < categories.length; i++) {
            expenseLabels[i] = new JLabel(categories[i]);
            add(expenseLabels[i]);
            expenseFields[i] = new JTextField();
            add(expenseFields[i]);
        }

        // Calculate button
        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        add(calculateButton);

        // Total Expenses label
        totalExpensesLabel = new JLabel();
        add(totalExpensesLabel);

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            double income = Double.parseDouble(incomeField.getText());
            double totalExpenses = 0;

            for (JTextField expenseField : expenseFields) {
                double expense = Double.parseDouble(expenseField.getText());
                totalExpenses += expense;
            }

            double percentage = (totalExpenses / income) * 100;
            totalExpensesLabel.setText("Total expenses: " + totalExpenses + " (" + String.format("%.2f", percentage) + "% of income)");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BudgetPlannerGUI();
            }
        });
    }
}
