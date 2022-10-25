package org.example.StreamExample;

import java.util.ArrayList;

public class Product_Order_Relation {

    protected int orderId;
    protected int productId;

    public Product_Order_Relation() {
        this.orderId = -1; this.productId = -1;
    }

    private Product_Order_Relation(int oid, int pid) {
        this.orderId = oid;
        this.productId = pid;
    }

    @Override
    public String toString(){
        return ("Product ID"+this.productId+"\tOrder ID: "+this.orderId);
    }

    public ArrayList<Product_Order_Relation> getProductsWithOrders() {
        return new ArrayList<Product_Order_Relation>() {
            {
                add(new Product_Order_Relation(1, 19));
                add(new Product_Order_Relation(1, 21));
                add(new Product_Order_Relation(1, 5));
                add(new Product_Order_Relation(2, 17));
                add(new Product_Order_Relation(2, 11));
                add(new Product_Order_Relation(2, 14));
                add(new Product_Order_Relation(2, 13));
                add(new Product_Order_Relation(3, 5));
                add(new Product_Order_Relation(3, 3));
                add(new Product_Order_Relation(3, 19));
                add(new Product_Order_Relation(3, 13));
                add(new Product_Order_Relation(3, 15));
                add(new Product_Order_Relation(4, 22));
                add(new Product_Order_Relation(4, 26));
                add(new Product_Order_Relation(4, 12));
                add(new Product_Order_Relation(5, 5));
                add(new Product_Order_Relation(6, 5));
                add(new Product_Order_Relation(6, 12));
                add(new Product_Order_Relation(7, 8));
                add(new Product_Order_Relation(7, 25));
                add(new Product_Order_Relation(7, 21));
                add(new Product_Order_Relation(7, 1));
                add(new Product_Order_Relation(7, 13));
                add(new Product_Order_Relation(7, 10));
                add(new Product_Order_Relation(8, 12));
                add(new Product_Order_Relation(8, 8));
                add(new Product_Order_Relation(9, 8));
                add(new Product_Order_Relation(10, 14));
                add(new Product_Order_Relation(10, 8));
                add(new Product_Order_Relation(11, 12));
                add(new Product_Order_Relation(11, 6));
                add(new Product_Order_Relation(11, 21));
                add(new Product_Order_Relation(11, 22));
                add(new Product_Order_Relation(11, 27));
                add(new Product_Order_Relation(11, 11));
                add(new Product_Order_Relation(12, 19));
                add(new Product_Order_Relation(12, 13));
                add(new Product_Order_Relation(12, 11));
                add(new Product_Order_Relation(12, 6));
                add(new Product_Order_Relation(13, 11));
                add(new Product_Order_Relation(13, 24));
                add(new Product_Order_Relation(13, 26));
                add(new Product_Order_Relation(13, 23));
                add(new Product_Order_Relation(14, 18));
                add(new Product_Order_Relation(15, 16));
                add(new Product_Order_Relation(15, 13));
                add(new Product_Order_Relation(15, 7));
                add(new Product_Order_Relation(16, 23));
                add(new Product_Order_Relation(16, 29));
                add(new Product_Order_Relation(16, 18));
                add(new Product_Order_Relation(16, 16));
                add(new Product_Order_Relation(16, 22));
                add(new Product_Order_Relation(16, 26));
                add(new Product_Order_Relation(17, 18));
                add(new Product_Order_Relation(17, 4));
                add(new Product_Order_Relation(18, 13));
                add(new Product_Order_Relation(18, 3));
                add(new Product_Order_Relation(18, 27));
                add(new Product_Order_Relation(18, 2));
                add(new Product_Order_Relation(19, 26));
                add(new Product_Order_Relation(19, 22));
                add(new Product_Order_Relation(19, 18));
                add(new Product_Order_Relation(19, 14));
                add(new Product_Order_Relation(19, 15));
                add(new Product_Order_Relation(19, 13));
                add(new Product_Order_Relation(20, 22));
                add(new Product_Order_Relation(21, 21));
                add(new Product_Order_Relation(21, 26));
                add(new Product_Order_Relation(22, 7));
                add(new Product_Order_Relation(22, 6));
                add(new Product_Order_Relation(23, 27));
                add(new Product_Order_Relation(23, 7));
                add(new Product_Order_Relation(23, 11));
                add(new Product_Order_Relation(23, 5));
                add(new Product_Order_Relation(24, 24));
                add(new Product_Order_Relation(24, 2));
                add(new Product_Order_Relation(24, 6));
                add(new Product_Order_Relation(24, 28));
                add(new Product_Order_Relation(24, 4));
                add(new Product_Order_Relation(25, 28));
                add(new Product_Order_Relation(25, 17));
                add(new Product_Order_Relation(25, 2));
                add(new Product_Order_Relation(25, 29));
                add(new Product_Order_Relation(25, 19));
                add(new Product_Order_Relation(26, 4));
                add(new Product_Order_Relation(27, 6));
                add(new Product_Order_Relation(27, 15));
                add(new Product_Order_Relation(27, 24));
                add(new Product_Order_Relation(28, 22));
                add(new Product_Order_Relation(28, 9));
                add(new Product_Order_Relation(29, 22));
                add(new Product_Order_Relation(30, 29));
                add(new Product_Order_Relation(30, 6));
                add(new Product_Order_Relation(30, 8));
                add(new Product_Order_Relation(31, 16));
                add(new Product_Order_Relation(31, 12));
                add(new Product_Order_Relation(31, 28));
                add(new Product_Order_Relation(32, 8));
                add(new Product_Order_Relation(32, 5));
                add(new Product_Order_Relation(33, 12));
                add(new Product_Order_Relation(33, 26));
                add(new Product_Order_Relation(33, 21));
                add(new Product_Order_Relation(33, 23));
                add(new Product_Order_Relation(33, 29));
                add(new Product_Order_Relation(33, 13));
                add(new Product_Order_Relation(34, 1));
                add(new Product_Order_Relation(34, 6));
                add(new Product_Order_Relation(34, 22));
                add(new Product_Order_Relation(34, 19));
                add(new Product_Order_Relation(34, 13));
                add(new Product_Order_Relation(34, 27));
                add(new Product_Order_Relation(35, 5));
                add(new Product_Order_Relation(35, 11));
                add(new Product_Order_Relation(35, 26));
                add(new Product_Order_Relation(35, 9));
                add(new Product_Order_Relation(36, 28));
                add(new Product_Order_Relation(36, 7));
                add(new Product_Order_Relation(37, 15));
                add(new Product_Order_Relation(37, 11));
                add(new Product_Order_Relation(38, 18));
                add(new Product_Order_Relation(38, 11));
                add(new Product_Order_Relation(38, 14));
                add(new Product_Order_Relation(38, 20));
                add(new Product_Order_Relation(38, 7));
                add(new Product_Order_Relation(39, 1));
                add(new Product_Order_Relation(39, 21));
                add(new Product_Order_Relation(40, 12));
                add(new Product_Order_Relation(40, 10));
                add(new Product_Order_Relation(40, 11));
                add(new Product_Order_Relation(40, 29));
                add(new Product_Order_Relation(40, 1));
                add(new Product_Order_Relation(41, 13));
                add(new Product_Order_Relation(41, 19));
                add(new Product_Order_Relation(41, 5));
                add(new Product_Order_Relation(41, 29));
                add(new Product_Order_Relation(41, 14));
                add(new Product_Order_Relation(41, 4));
                add(new Product_Order_Relation(42, 2));
                add(new Product_Order_Relation(43, 6));
                add(new Product_Order_Relation(44, 20));
                add(new Product_Order_Relation(44, 18));
                add(new Product_Order_Relation(44, 8));
                add(new Product_Order_Relation(44, 24));
                add(new Product_Order_Relation(44, 26));
                add(new Product_Order_Relation(44, 13));
                add(new Product_Order_Relation(45, 23));
                add(new Product_Order_Relation(45, 1));
                add(new Product_Order_Relation(45, 25));
                add(new Product_Order_Relation(45, 15));
                add(new Product_Order_Relation(46, 16));
                add(new Product_Order_Relation(46, 24));
                add(new Product_Order_Relation(46, 19));
                add(new Product_Order_Relation(46, 13));
                add(new Product_Order_Relation(46, 11));
                add(new Product_Order_Relation(47, 23));
                add(new Product_Order_Relation(47, 28));
                add(new Product_Order_Relation(47, 20));
                add(new Product_Order_Relation(47, 21));
                add(new Product_Order_Relation(48, 15));
                add(new Product_Order_Relation(48, 3));
                add(new Product_Order_Relation(48, 26));
                add(new Product_Order_Relation(48, 7));
                add(new Product_Order_Relation(48, 19));
                add(new Product_Order_Relation(48, 10));
                add(new Product_Order_Relation(49, 5));
                add(new Product_Order_Relation(49, 13));
                add(new Product_Order_Relation(49, 29));
                add(new Product_Order_Relation(49, 3));
                add(new Product_Order_Relation(49, 12));
                add(new Product_Order_Relation(49, 17));
                add(new Product_Order_Relation(50, 15));
                add(new Product_Order_Relation(50, 16));
            }
        };
    }
}
