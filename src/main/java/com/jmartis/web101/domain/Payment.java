package com.jmartis.web101.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Jovanny on 2/18/2015.
 */
@Entity
@Table
public class Payment {
    @Id
    @GeneratedValue
    private Long id;
    private Date date;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "orderingAccount")
    private Account orderingAccount;
    @ManyToOne
    @JoinColumn(name = "beneficiaryAccount")
    private Account beneficiaryAccount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Account getOrderingAccount() {
        return orderingAccount;
    }

    public void setOrderingAccount(Account orderingAccount) {
        this.orderingAccount = orderingAccount;
    }

    public Account getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(Account beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }
}
