package com.insignia.interest.model;

import javax.persistence.*;

@Entity
@Table(name = "interest", catalog = "banking_app")
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long interestID;
    private Double savingsInterest;
    private Double loanInterest;
    private Double recurringDepositInterest;
    private Double fixedDepositInterest;
    private Double currentInterest;

    public Interest() {
    }

    public Interest(Double savingsInterest, Double loanInterest, Double recuringDepositInterest
            , Double fixedDepositInterest, Double currentInterest) {
        this.savingsInterest = savingsInterest;
        this.loanInterest = loanInterest;
        this.recurringDepositInterest = recuringDepositInterest;
        this.fixedDepositInterest = fixedDepositInterest;
        this.currentInterest = currentInterest;
    }

    public Long getInterestID() {
        return interestID;
    }

    public void setInterestID(Long interestID) {
        this.interestID = interestID;
    }

    public Double getSavingsInterest() {
        return savingsInterest;
    }

    public void setSavingsInterest(Double savingsInterest) {
        this.savingsInterest = savingsInterest;
    }

    public Double getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(Double loanInterest) {
        this.loanInterest = loanInterest;
    }

    public Double getRecurringDepositInterest() {
        return recurringDepositInterest;
    }

    public void setRecurringDepositInterest(Double recurringDepositInterest) {
        this.recurringDepositInterest = recurringDepositInterest;
    }

    public Double getFixedDepositInterest() {
        return fixedDepositInterest;
    }

    public void setFixedDepositInterest(Double fixedDepositInterest) {
        this.fixedDepositInterest = fixedDepositInterest;
    }

    public Double getCurrentInterest() {
        return currentInterest;
    }

    public void setCurrentInterest(Double currentInterest) {
        this.currentInterest = currentInterest;
    }
}
