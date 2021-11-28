package com.company;

public class Invoice  implements Payable{
    private  String itam;
    private String desc;
    private int qut;
    private double price;

    public Invoice(String itam, String desc, int qut, double price) {
        this.itam = itam;
        this.desc = desc;
        this.qut = qut;
        this.price = price;
    }

    public String getItam() {
        return itam;
    }

    public void setItam(String itam) {
        this.itam = itam;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQut() {
        return qut;
    }

    public void setQut(int qut) {
        this.qut = qut;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getpaymentAmount(){
        return 0;
    }
}
