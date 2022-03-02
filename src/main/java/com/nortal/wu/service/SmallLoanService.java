package com.nortal.wu.service;

import com.nortal.wu.model.Customer;
import com.nortal.wu.model.LoanIssue;
import com.nortal.wu.model.Loan;
import com.nortal.wu.service.expection.InvalidLoanAmountException;
import com.nortal.wu.service.issuing.LoanAmountService;
import com.nortal.wu.service.issuing.LoanIssuingService;
import java.math.BigDecimal;

/**
 * Loan service that is responsible for small loans. Has its own set of a rules for age restriction
 * and maximum amount.
 */
public class SmallLoanService implements LoanService {

  private static final int MIN_AGE = 21;
  private static final int MAX_AGE = 70;

  private final LoanIssuingService issuingService;
  private final LoanAmountService amountService;

  public SmallLoanService(LoanIssuingService issuingService, LoanAmountService amountService) {
    this.issuingService = issuingService;
    this.amountService = amountService;
  }

  @Override
  public boolean isAllowed(Customer cu) {
    return cu.getAge() < MAX_AGE;
  }

  /**
   * Returns the highest amount the customer can have a loan for or zero if customer cannot have a
   * loan
   *
   * @param cu customer
   * @return returns either loans maximum amount or maximum amount that is allowed for customer
   */
  @Override
  public BigDecimal getMaxAmount(Customer cu) {
    return null;
  }

  /**
   * Issue a loan for customer
   *
   * @param cu   customer to whom loan should be issued
   * @param loan loan details
   * @return issued loan details
   * @throws InvalidLoanAmountException is thrown if loan amount is zero or above max limit
   */
  @Override
  public LoanIssue issueLoan(Customer cu, Loan loan) {
    return null;
  }
}
