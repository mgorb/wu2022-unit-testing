package com.nortal.wu.service.expection;

import java.math.BigDecimal;

public class InvalidLoanAmountException extends RuntimeException {

  public InvalidLoanAmountException(BigDecimal amount) {
    super("invalid loan amount: " + amount);
  }
}
