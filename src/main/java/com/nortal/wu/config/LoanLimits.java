package com.nortal.wu.config;

import java.math.BigDecimal;

public class LoanLimits {

  public static final BigDecimal SMALL_LOAN_LIMIT = BigDecimal.valueOf(20_000L);

  // Config class
  private LoanLimits() {
  }
}
