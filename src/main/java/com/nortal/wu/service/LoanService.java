package com.nortal.wu.service;

import com.nortal.wu.model.Customer;
import com.nortal.wu.model.Loan;
import com.nortal.wu.model.LoanIssue;
import java.math.BigDecimal;

public interface LoanService {

  boolean isAllowed(Customer cu);

  BigDecimal getMaxAmount(Customer cu);

  LoanIssue issueLoan(Customer cu, Loan loan);
}
