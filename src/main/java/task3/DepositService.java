package task3;


import java.math.BigDecimal;

public interface DepositService {
    String deposit(Long amount, Long userId) throws InsufficientFundsException;
}
