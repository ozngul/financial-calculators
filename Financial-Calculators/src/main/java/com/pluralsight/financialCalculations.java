package com.pluralsight;

import java.util.Scanner;

public class financialCalculations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Welcome to Financial Calculators ");
        System.out.println(" Please choose an option of Financial Calculators ");
        System.out.println(" 1- Morgage ");
        System.out.println(" 2- Future Value ");
        System.out.println(" 3- Present Value ");
        int choose = input.nextInt();


if (choose==1) {

    System.out.println("Enter the loan amount :");
    double loanAmountPrinciple = input.nextDouble();

    System.out.println("Enter the annual interest rate (e.g. 2.5) :");
    double annualInterestRate = input.nextDouble();

    System.out.println("Enter the loan terms in years :");
    int loanTerms = input.nextInt();

    //Calculators
    //
    // M=P×(i*(1+i)^n / ((1+i)^n)-1)
    double montlyInteresRate = annualInterestRate / 100 / 12;
    int numberOfPayments = loanTerms * 12;
    double monthlyPayment = loanAmountPrinciple * (montlyInteresRate * Math.pow(1 + montlyInteresRate, numberOfPayments) / (Math.pow(1 + montlyInteresRate, numberOfPayments) - 1));
    System.out.printf("Your monthly payment: $%.2f%n", monthlyPayment);
    double totalInterest = (monthlyPayment * numberOfPayments) - loanAmountPrinciple;
    System.out.printf("Total interest paid: $%.2f%n", totalInterest);
}

else if (choose==2) {
    // FV = P × (1 + (r / 365))^(365 × t )
    System.out.println("Enter the deposit amount :");
    double principal = input.nextDouble();

    System.out.println("Enter the annual interest rate (e.g. 2.5) : ");
    double annualInterestRate = input.nextDouble();

    System.out.println("Enter the number of years :");
    int years = input.nextInt();

    double r = annualInterestRate / 100;
    int t = years;
    double futureValue = principal * Math.pow(1 + (r / 365), 365 * t);
    double interestEarned = futureValue - principal;
    System.out.printf("Future Value: $%.2f%n", futureValue);
    System.out.printf("Total Interest Earned: $%.2f%n", interestEarned);
}

else if (choose==3) {
    System.out.print("Enter the monthly payout: ");
    double monthlyPayout = input.nextDouble();

    System.out.print("Enter the expected annual interest rate (e.g. 2.5): ");
    double annualInterestRate = input.nextDouble();

    System.out.print("Enter the number of years the annuity will pay out: ");
    int years = input.nextInt();

    double monthlyInterestRate = annualInterestRate / 100 / 12;
    int totalPayments = years * 12;

    double presentValue = monthlyPayout *
            (1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate;

    System.out.printf("Present value needed today: $%.2f%n", presentValue);

}
    else {
    System.out.println( " You selected invalid option");
    }
    }
}
