package com.dynamicbiz.POS.ProductService.dto;

public class ProductResponse {

    private String id;
    private String name;
    private String description;
    private double price;


    public ProductResponse(String id,String name,String description,double price){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
    }

    public ProductResponse() {

    }

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name) {

        this.name=name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
