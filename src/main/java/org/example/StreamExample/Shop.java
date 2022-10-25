package org.example.StreamExample;

import org.junit.Test;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Shop {

    public ArrayList<Order> orderlist = new Order().getAllCustomerOrders();
    public ArrayList<Product> productList = new Product().getlistofProducts();
    public ArrayList<Customer> customerList = new Customer().CustomerList();
    public ArrayList<Product_Order_Relation> orderlistwithproducts = new Product_Order_Relation().getProductsWithOrders();

    @Test
    public  void prepareInvoiceforToyswith10percentdiscount(){
        Map<String,Double> newprice =new HashMap<String,Double>();
        productList.stream().filter(p-> p.getCategory().equalsIgnoreCase("Toys")).forEach(
                product -> {
                    newprice.put(product.getName(),product.getPrice() - product.getPrice() *0.09);
                }
        );
        System.out.println( newprice );
    }

    @Test
    public void orderlistwithbabyproductstest(){

        List<Integer> BabyProducts = new Product().findIdsOfProduct("Baby");

        List<Product_Order_Relation> Result = orderlistwithproducts.stream().filter(order -> BabyProducts . contains(order.productId )).collect(Collectors.toList());

        Result.forEach(System.out::println);
    }

    @Test
    public void listOfTier2Customer(){
        List<Integer> Tier2customerIds = customerList.stream().takeWhile(p-> p.getTier().equals(2)).map(p-> p.getCustomerId()).collect(Collectors.toList());
        List<Order> OrderofTier2Customer = orderlist.stream().dropWhile( order ->  !Tier2customerIds.contains(order.getCustomerId())
        && order.getOrderDate().isAfter(LocalDate.parse("2021-02-01")) && order.getOrderDate().isBefore(LocalDate.parse("2021-04-01")) ).collect(Collectors.toList());

        OrderofTier2Customer.forEach(System.out::println);
    }

    @Test
    public void cheapestBooks(){

        Optional<Product> book = productList.stream().dropWhile( p -> p.getCategory().equalsIgnoreCase("books"))
                .min(Comparator.comparing(Product::getPrice ));

        System.out.println(book.get());
    }
    @Test
    public void mostrecentorder(){

        List<Order> mostrecentorders = orderlist.stream().sorted(Comparator.comparing(Order::getDeliveryDate).reversed()).limit(3).collect(Collectors.toList());

        System.out.println(mostrecentorders);
    }

    @Test
    public void orderonMarch() {

        List<Order> Result = orderlist.stream().filter(o -> o.getOrderDate().equals(LocalDate.parse("2021-03-15"))).peek(o -> System.out.println(o)).collect(Collectors.toList());
        Result.stream().peek(obj -> System.out.println(obj.products)).collect(Collectors.toList());
    }





}
