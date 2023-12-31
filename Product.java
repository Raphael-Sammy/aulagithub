package com_expressao;

import java.util.Objects;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public static String staticUpperCaseName(Product p){
        return p.getName().toUpperCase();
    }
    public String nonStaticUpperCaseName(){
        return this.name.toUpperCase();
    }
    public static void staticPriceUpdate(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }
    public void nonStaticPriceUpdate(){
        setPrice(getPrice() * 1.1);
    }
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }
    public boolean nonstaticProductPredicate(){
        return price >= 100;
    }
    @Override
    public String toString() {
        return "--Product--" +
                "\nname: " + name +
                "\nprice: " + String.format("%.2f ", price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price.equals(product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}