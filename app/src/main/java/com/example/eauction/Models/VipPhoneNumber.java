package com.example.eauction.Models;

public class VipPhoneNumber extends Telemetry
{
    private String phoneNumber;
    private String company;

    //region Constructors
    public VipPhoneNumber()
    {
        super();
        phoneNumber = "";
        company = "";
    }

    public VipPhoneNumber(String phoneNumber, String company)
    {
        super();
        this.phoneNumber = phoneNumber;
        this.company = company;
    }

    //endregion
    //region Setters
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public void setCompany(String company)
    {
        this.company = company;
    }
    //endregion
    //region Getters
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public String getCompany()
    {
        return company;
    }
    //endregion
}