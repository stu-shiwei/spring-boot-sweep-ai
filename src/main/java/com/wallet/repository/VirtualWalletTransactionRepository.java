package com.wallet.repository;

import com.wallet.common.VirtualWalletStatus;
import com.wallet.repository.entity.VirtualWalletTransactionEntity;

public class VirtualWalletTransactionRepository {

    public Long saveTransaction(VirtualWalletTransactionEntity transactionEntity) {
        return null;
    }

    public void updateStatus(Long transactionId, VirtualWalletStatus closed) {
    }
    
}
