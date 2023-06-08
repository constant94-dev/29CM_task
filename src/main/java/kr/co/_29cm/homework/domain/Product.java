package kr.co._29cm.homework.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Product {
    private String name;
    private int price;
    private int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

}
