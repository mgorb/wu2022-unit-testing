package com.nortal.wu.model;

public class LoanIssue {

  private final Customer customer;
  private final Loan loan;

  public LoanIssue(Customer customer, Loan loan) {
    this.customer = customer;
    this.loan = loan;
  }

  public Customer getCustomer() {
    return customer;
  }

  public Loan getLoan() {
    return loan;
  }
}
