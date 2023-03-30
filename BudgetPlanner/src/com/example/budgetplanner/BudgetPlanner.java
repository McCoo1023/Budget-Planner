package com.example.budgetplanner;

import java.util.Scanner;

public class BudgetPlanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Budget Planner!");

        System.out.print("Enter your monthly income: ");
        double income = scanner.nextDouble();

        System.out.print("Enter your monthly rent/mortgage: ");
        double rent = scanner.nextDouble();

        System.out.print("Enter your monthly groceries expenses: ");
        double groceries = scanner.nextDouble();

        System.out.print("Enter your monthly utilities expenses: ");
        double utilities = scanner.nextDouble();

        System.out.print("Enter your monthly transportation expenses: ");
        double transportation = scanner.nextDouble();

        System.out.print("Enter your monthly miscellaneous expenses: ");
        double miscellaneous = scanner.nextDouble();

        double totalExpenses = rent + groceries + utilities + transportation + miscellaneous;
        double remainingBudget = income - totalExpenses;

        System.out.println("\nHere's your monthly budget summary:");
        System.out.printf("Income: $%.2f\n", income);
        System.out.printf("Rent/Mortgage: $%.2f (%.2f%%)\n", rent, (rent / income) * 100);
        System.out.printf("Groceries: $%.2f (%.2f%%)\n", groceries, (groceries / income) * 100);
        System.out.printf("Utilities: $%.2f (%.2f%%)\n", utilities, (utilities / income) * 100);
        System.out.printf("Transportation: $%.2f (%.2f%%)\n", transportation, (transportation / income) * 100);
        System.out.printf("Miscellaneous: $%.2f (%.2f%%)\n", miscellaneous, (miscellaneous / income) * 100);
        System.out.printf("Total Expenses: $%.2f (%.2f%%)\n", totalExpenses, (totalExpenses / income) * 100);
        System.out.printf("Remaining Budget: $%.2f (%.2f%%)\n", remainingBudget, (remainingBudget / income) * 100);

        scanner.close();
    }
    }
