package com.example.cycelview;

public class Store {
    private int avatar;
    private String name;
    private String address;
    private String sale;
    private int endow;

    public Store(int avatar, String name, String address, String sale, int endow) {
        this.avatar = avatar;
        this.name = name;
        this.address = address;
        this.sale = sale;
        this.endow = endow;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSale() {
        return sale;
    }

    public int getEndow() {
        return endow;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public void setEndow(int endow) {
        this.endow = endow;
    }
}
