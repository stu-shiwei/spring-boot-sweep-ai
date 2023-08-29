package com.example.helloworld.service.domain;

import java.math.BigDecimal;

import com.example.helloworld.common.InsufficientBalanceException;
import com.example.helloworld.common.InvalidAmountException;

public class VirtualWalletBo {
    private long id;
    private long createTime = System.currentTimeMillis();;
    private BigDecimal balance = BigDecimal.ZERO;
    //是否允许透支
    private boolean isAllowedOverdraft = true;
    //透支额度
    private BigDecimal overdraftAmount = BigDecimal.ZERO;
    

    public VirtualWalletBo(long preAllocatedId) {
        this.id = preAllocatedId;
    }

    public VirtualWalletBo() {
    }

    public BigDecimal balance() {
        return this.balance;
    }

    
    
    //出账
    public void debit(BigDecimal amount) throws InsufficientBalanceException {
        //判断余额是否足够
        if (this.balance.compareTo(amount) < 0) {
            throw new InsufficientBalanceException();
        }
        this.balance.subtract(amount);
    }

    //入账
    public void credit(BigDecimal amount) throws InvalidAmountException {
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException();
        }
        this.balance.add(amount);
    }

}
