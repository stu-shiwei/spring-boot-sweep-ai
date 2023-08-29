package com.example.helloworld.repository;

import com.example.helloworld.common.VirtualWalletStatus;
import com.example.helloworld.repository.entity.VirtualWalletTransactionEntity;

public class VirtualWalletTransactionRepository {

    public Long saveTransaction(VirtualWalletTransactionEntity transactionEntity) {
        return null;
    }

    public void updateStatus(Long transactionId, VirtualWalletStatus closed) {
    }
    
}
