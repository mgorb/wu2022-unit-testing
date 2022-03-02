package com.nortal.wu.service.issuing;

import java.math.BigDecimal;
import java.util.UUID;

public interface LoanAmountService {

  BigDecimal getMaxAmountForCustomer(UUID id);
}
