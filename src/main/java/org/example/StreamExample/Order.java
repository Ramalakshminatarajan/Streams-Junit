package org.example.StreamExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {


    public ArrayList<Product_Order_Relation> orderlistwithproducts = new Product_Order_Relation().getProductsWithOrders();
    private int id;
    private LocalDate orderDate;
    protected LocalDate deliveryDate;
    private String status;
    private int customer_id;

    List<Integer> products;

    public Order(){
        this.id=-1;this.deliveryDate = null;this.orderDate=null;this.status="";this.customer_id=-1;

    }

    public int getCustomerId(){
        return this.customer_id;
    }

    public LocalDate getOrderDate(){
        return this.orderDate;
    }

    public LocalDate getDeliveryDate(){
        return this.deliveryDate;
    }

    private List<Integer> getproducts(){

        return orderlistwithproducts.stream().filter(obj -> obj.orderId == this.id).map(obj -> obj.productId).collect(Collectors.toList());
    }

    Order(int id,LocalDate orderDate,LocalDate deliveryDate, String status,int customer_id){
        this.id=id;this.deliveryDate = deliveryDate;this.orderDate=orderDate;this.status=status;this.customer_id=customer_id;
        this.products = getproducts();
    }

    @Override
    public String toString(){
        return ("Order ID: "+this.id+"OrderDate: "+this.orderDate+"DeliveryDate: "+this.deliveryDate+"Status: "+this.status+"Customer: "+this.customer_id);
    }

    public ArrayList<Order> getAllCustomerOrders(){
        return new ArrayList<Order>(){
            {
                add(new Order (1, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "NEW", 5));
               add(new Order (2, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "NEW", 3));
               add(new Order (3, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED", 5));
               add(new Order (4, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING", 3));
               add(new Order (5, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "NEW", 1));
               add(new Order (6, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED", 9));
               add(new Order (7, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING", 8));
               add(new Order (8, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "NEW", 4));
               add(new Order (9, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "NEW", 10));
               add(new Order (10, LocalDate.parse("2021-03-10"), LocalDate.parse("2021-03-19"), "NEW", 8));
               add(new Order (11, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED", 1));
               add(new Order (12, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING", 5));
               add(new Order (13, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "NEW", 5));
               add(new Order (14, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING", 4));
               add(new Order (15, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED", 5));
               add(new Order (16, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "NEW", 1));
               add(new Order (17, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED", 6));
               add(new Order (18, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING", 9));
               add(new Order (19, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED", 9));
               add(new Order (20, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "NEW", 5));
               add(new Order (21, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED", 9));
               add(new Order (22, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "NEW", 5));
               add(new Order (23, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING", 4));
               add(new Order (24, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED", 1));
               add(new Order (25, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "NEW", 1));
               add(new Order (26, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "NEW", 10));
               add(new Order (27, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "NEW", 1));
               add(new Order (28, LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED", 2));
               add(new Order (29, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING", 1));
               add(new Order (30, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED", 1));
               add(new Order (31, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "NEW", 3));
               add(new Order (32, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED", 2));
               add(new Order (33, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING", 1));
               add(new Order (34, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "NEW", 6));
               add(new Order (35, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "NEW", 1));
               add(new Order (36, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED", 2));
               add(new Order (37, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "NEW", 8));
               add(new Order (38, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "NEW", 8));
               add(new Order (39, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "NEW", 9));
               add(new Order (40, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING", 3));
               add(new Order (41, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "NEW", 5));
               add(new Order (42, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED", 9));
               add(new Order (43, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "NEW", 3));
               add(new Order (44, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED", 4));
               add(new Order (45, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED", 1));
               add(new Order (46, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "NEW", 10));
               add(new Order (47, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING", 2));
               add(new Order (48, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "NEW", 2));
               add(new Order (49, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "NEW", 7));
               add(new Order (50, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "NEW", 9));
            }
        };
    }

}
