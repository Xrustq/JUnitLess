package task3;

import org.junit.Assert;
import org.junit.Before;

import static org.mockito.AdditionalMatchers.*;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;


public class PaymentControllerTest extends Assert {

    @InjectMocks
    private PaymentController paymentController;
    @Mock
    private AccountService accountService = mock(AccountService.class);
    @Mock
    private DepositService depositService = mock(DepositService.class);

    @Before
    public void init() throws InsufficientFundsException {
        MockitoAnnotations.initMocks(this);

        when(accountService.isUserAuthenticated(100L)).thenReturn(true);
        when(depositService.deposit(lt(100L), anyLong())).thenReturn("Success");
        when(depositService.deposit(gt(101L), anyLong())).thenThrow(new InsufficientFundsException());
    }

    @Test
    public void successfulDeposit() throws InsufficientFundsException {
        assertEquals("Success", depositService.deposit(50L, 100L));
    }

    @Test
    public void depositForUnauthenticatedUser() {
        assertFalse(accountService.isUserAuthenticated(101L));
    }

    @Test(expected = InsufficientFundsException.class)
    public void depositOfLargeAmount() throws InsufficientFundsException {
        paymentController.deposit(150L, 100L);
    }

    @Test(expected = SecurityException.class)
    public void depositWrongUserId() throws InsufficientFundsException {
        paymentController.deposit(50L, 1001L);
    }
}