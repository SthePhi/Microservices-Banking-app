package com.insignia.loanaccount.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loan_account", catalog = "banking_app")
public class LoanAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long loanID;
    private String accountNumber;
    private String loanType;
    private Date dateOfLoan;
    private int duration;
    private double totalAmount;
    private double remainingAmount;
    private String status;
    private String description;
    private double interest;

    public LoanAccount() {
    }

    public LoanAccount(String accountNumber, String loanType, Date dateOfLoan
            , int duration, double totalAmount, double remainingAmount, String status
            , String description, double interest) {
        this.accountNumber = accountNumber;
        this.loanType = loanType;
        this.dateOfLoan = dateOfLoan;
        this.duration = duration;
        this.totalAmount = totalAmount;
        this.remainingAmount = remainingAmount;
        this.status = status;
        this.description = description;
        this.interest = interest;
    }

    public long getLoanID() {
        return loanID;
    }

    public void setLoanID(long loanID) {
        this.loanID = loanID;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Date getDateOfLoan() {
        return dateOfLoan;
    }

    public void setDateOfLoan(Date dateOfLoan) {
        this.dateOfLoan = dateOfLoan;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
