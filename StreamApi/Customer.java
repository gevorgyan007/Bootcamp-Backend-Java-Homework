package com.company.StreamApi;

public class Customer {
    private long id;
    private String names;
    private int tier;

    public Customer(long id, String names, int tier) {
        this.id = id;
        this.names = names;
        this.tier = tier;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }
}
