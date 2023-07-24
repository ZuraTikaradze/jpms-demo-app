package com.computerscince.payment.service.impl;

import com.computerscince.payment.model.Payment;
import com.computerscince.payment.service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public List<Payment> findPayments() {
        return List.of(new Payment("1", "100-USD"));
    }
}
