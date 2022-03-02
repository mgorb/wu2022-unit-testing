package com.nortal.wu.model;

import java.math.BigDecimal;

public class Loan {

  private final BigDecimal amount;

  public Loan(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getAmount() {
    return amount;
  }

}
