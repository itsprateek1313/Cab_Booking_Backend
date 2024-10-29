package com.project.uber.UberApp.strategies;


import com.project.uber.UberApp.entities.enums.PaymentMethod;
import com.project.uber.UberApp.strategies.impl.CashPaymentStrategy;
import com.project.uber.UberApp.strategies.impl.WalletpaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletpaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
