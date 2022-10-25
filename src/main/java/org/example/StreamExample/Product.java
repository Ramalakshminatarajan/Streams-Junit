package org.example.StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private final int id;
    private final String name;
    private final String category;
    private final Double price;

    public Product(){
        this.id = -1;this.name="";this.category="";this.price=0.0;
    }

    public String getName(){
        return this.name;
    }

    public Double getPrice(){
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    private Product(int id, String name, String category, Double Price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = Price;
    }

    public ArrayList<Product> getlistofProducts() {
        return new ArrayList<Product>() {
            {
                add(new Product(1, "omnis quod consequatur", "Games", 184.83));
                add(new Product(2, "vel libero suscipit", "Toys", 12.66));
                add(new Product(3, "non nemo iure", "Grocery", 498.02));
                add(new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80));
                add(new Product(5, "animi cum rem", "Games", 458.20));
                add(new Product(6, "dolorem porro debitis", "Toys", 146.52));
                add(new Product(7, "aspernatur rerum qui", "Books", 656.42));
                add(new Product(8, "deleniti earum et", "Baby", 41.46));
                add(new Product(9, "voluptas ut quidem", "Books", 697.57));
                add(new Product(10, "eos sed debitis", "Baby", 366.90));
                add(new Product(11, "laudantium sit nihil", "Toys", 95.50));
                add(new Product(12, "ut perferendis corporis", "Grocery", 302.19));
                add(new Product(13, "sint voluptatem ut", "Toys", 295.37));
                add(new Product(14, "quos sunt ipsam", "Grocery", 534.64));
                add(new Product(15, "qui illo error", "Baby", 623.58));
            }
        };
    }
    @Override
    public String toString(){
        return ("Product Name: "+this.name+"Category: "+this.category+"Price: "+this.price);
    }

    public List<String> FindBooksWithpricegreaterthan100() {

        return getlistofProducts()
                .stream()
                .filter(product -> product.category == "Books" && product.price > 100)
                .map(product -> product.name)
                .collect(Collectors.toList());
        }

        public List<Integer> findIdsOfProduct(String Category){
        return getlistofProducts().stream().filter( product -> product.category.equalsIgnoreCase(Category)).map( p -> p.id).collect(Collectors.toList());
        }

        public static void main(String args[]){
            Product pdt = new Product();
            pdt.FindBooksWithpricegreaterthan100().forEach(System.out::println);
        }
}
