package com.wallet.service.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VirtualWalletBoTest {
    
    @Test
    public void testGetBalance() {
        VirtualWalletBo wallet = new VirtualWalletBo();
        
    }

    @Test
    public void testGetAvailableBalance() {
        VirtualWalletBo wallet = new VirtualWalletBo();
        wallet.setBalance(new BigDecimal("100.00"));
        wallet.setOverdraftAmount(new BigDecimal("50.00"));
        BigDecimal availableBalance = wallet.getAvailableBalance();
        assertEquals(new BigDecimal("150.00"), availableBalance);
    }
    
}
