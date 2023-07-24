package com.computerscince.payment.service;

import com.computerscince.payment.model.Payment;
import com.computerscince.payment.service.impl.PaymentServiceImpl;

import java.util.List;

public interface PaymentService {
    List<Payment> findPayments();

    static PaymentService paymentServiceFactory() {
        return new PaymentServiceImpl();
    }
}
