package com.insignia.depositaccount.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "transaction", catalog = "banking_app_db")
public class DepositAccountModel
{
    /*Declaring Variables*/
    private Long accountNumber;
    private String closureType;
    private Long interestID;
    private Double initialAmount;
    private Long customerID;
    private String depositAccountType;
    private Double interestedAmount;
    @Id
    @GeneratedValue
    private Long depositAccountNumber;
    private Double currentBalance;
    private Double duration;
    private Double interestRate;
    private Date openDate;
    private Date closeDate;
    private Double days;

    /*Start of Constructors*/
    public DepositAccountModel() {
    }

    public DepositAccountModel(Long accountNumber, String closureType, Long interestID, Double initialAmount, Long customerID, String depositAccountType, Double interestedAmount, Double currentBalance, Double duration, Double interestRate, Date openDate, Date closeDate, Double days) {
        this.accountNumber = accountNumber;
        this.closureType = closureType;
        this.interestID = interestID;
        this.initialAmount = initialAmount;
        this.customerID = customerID;
        this.depositAccountType = depositAccountType;
        this.interestedAmount = interestedAmount;
        this.currentBalance = currentBalance;
        this.duration = duration;
        this.interestRate = interestRate;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.days = days;
    }
    /*End of Constructors*/

    /*Start of getters and Setters*/

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getClosureType() {
        return closureType;
    }

    public void setClosureType(String closureType) {
        this.closureType = closureType;
    }

    public Long getInterestID() {
        return interestID;
    }

    public void setInterestID(Long interestID) {
        this.interestID = interestID;
    }

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getDepositAccountType() {
        return depositAccountType;
    }

    public void setDepositAccountType(String depositAccountType) {
        this.depositAccountType = depositAccountType;
    }

    public Double getInterestedAmount() {
        return interestedAmount;
    }

    public void setInterestedAmount(Double interestedAmount) {
        this.interestedAmount = interestedAmount;
    }

    public Long getDepositAccountNumber() {
        return depositAccountNumber;
    }

    public void setDepositAccountNumber(Long depositAccountNumber) {
        this.depositAccountNumber = depositAccountNumber;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }
    /*End of Getters and Setters*/
}
