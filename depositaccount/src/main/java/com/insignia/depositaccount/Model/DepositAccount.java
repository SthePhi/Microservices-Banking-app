package com.insignia.depositaccount.Model;

import java.util.Date;

public class DepositAccount
{
    /*Declaring Variables*/
    private Long accountNumber;
    private String closureType;
    private Long interestID;
    private Long initialAmount;
    private Long customerID;
    private String depositAccountType;
    private Long interestedAmount;
    private Long depositAccountNumber;
    private Long currentBalance;
    private double duration;
    private double interestRate;
    private Date openDate;
    private Date closeDate;
    private Integer days;

    /*Start of getters and Setters*/
    public Long getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getClosureType()
    {
        return closureType;
    }

    public void setClosureType(String closureType)
    {
        this.closureType = closureType;
    }

    public Long getInterestID()
    {
        return interestID;
    }

    public void setInterestID(Long interestID)
    {
        this.interestID = interestID;
    }

    public Long getInitialAmount()
    {
        return initialAmount;
    }

    public void setInitialAmount(Long initialAmount)
    {
        this.initialAmount = initialAmount;
    }

    public Long getCustomerID()
    {
        return customerID;
    }

    public void setCustomerID(Long customerID)
    {
        this.customerID = customerID;
    }

    public String getDepositAccountType()
    {
        return depositAccountType;
    }

    public void setDepositAccountType(String depositAccountType)
    {
        this.depositAccountType = depositAccountType;
    }

    public Long getInterestedAmount()
    {
        return interestedAmount;
    }

    public void setInterestedAmount(Long interestedAmount)
    {
        this.interestedAmount = interestedAmount;
    }

    public Long getDepositAccountNumber()
    {
        return depositAccountNumber;
    }

    public void setDepositAccountNumber(Long depositAccountNumber)
    {
        this.depositAccountNumber = depositAccountNumber;
    }

    public Long getCurrentBalance()
    {
        return currentBalance;
    }

    public void setCurrentBalance(Long currentBalance)
    {
        this.currentBalance = currentBalance;
    }

    public double getDuration()
    {
        return duration;
    }

    public void setDuration(double duration)
    {
        this.duration = duration;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }

    public Date getOpenDate()
    {
        return openDate;
    }

    public void setOpenDate(Date openDate)
    {
        this.openDate = openDate;
    }

    public Date getCloseDate()
    {
        return closeDate;
    }

    public void setCloseDate(Date closeDate)
    {
        this.closeDate = closeDate;
    }

    public Integer getDays()
    {
        return days;
    }

    public void setDays(Integer days)
    {
        this.days = days;
    }
    /*End of Getters and Setters*/

    /*Start of Contructors*/
    public DepositAccount(Long accountNumber, String closureType, Long interestID, Long initialAmount, String depositAccountType, Long interestedAmount, Long depositAccountNumber, Long currentBalance, double duration, double interestRate, Date openDate, Date closeDate, Integer days)
    {
        this.accountNumber = accountNumber;
        this.closureType = closureType;
        this.interestID = interestID;
        this.initialAmount = initialAmount;
        this.depositAccountType = depositAccountType;
        this.interestedAmount = interestedAmount;
        this.depositAccountNumber = depositAccountNumber;
        this.currentBalance = currentBalance;
        this.duration = duration;
        this.interestRate = interestRate;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.days = days;
    }

    public DepositAccount()
    {

    }
    /*End of Constructors*/
}
