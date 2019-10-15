package com.stackroute;

import org.springframework.stereotype.Component;

@Component
public class UserMobile
{
    private int IMEI=0;
    private String company=" ";
    private int price=0;

    public UserMobile() {
        System.out.println("bana naya object");
    }

    @Override
    public String toString() {
        return "UserMoobile{" +
                "IMEI=" + IMEI +
                ", company='" + company + '\'' +
                ", price=" + price +
                '}';
    }

    public int getIMEI() {
        return IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
