package ge.computerscince.jpmsdemoapp.controller;

import com.computerscince.payment.model.Payment;
import com.computerscince.payment.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping("/payments")
    public List<Payment> payments() {
        PaymentService paymentService = PaymentService.paymentServiceFactory();
        return paymentService.findPayments();
    }
}
