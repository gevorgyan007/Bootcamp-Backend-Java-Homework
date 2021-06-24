package com.company.StreamApi;

public  class Product {
    private long id;
    private String names;
    private String category;
    private double price;

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", names='" + names + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(long id, String names, String category, double price) {
        this.id = id;
        this.names = names;
        this.category = category;
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
