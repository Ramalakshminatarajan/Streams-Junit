package org.example.StreamExample;

import java.util.ArrayList;

public class Customer {

    private int id;
    private String name;
    private Integer tier;

    public Customer(){
        this.id=-1;this.name="";this.tier=-1;
    }

    private Customer(int id, String name,Integer tier){
        this.id = id;this.name=name;this.tier=tier;
    }

    public Integer getTier(){
        return tier;
    }
    public int getCustomerId(){
        return id;
    }

    @Override
    public String toString(){
        return ("Customer Name: "+this.name+"Id: "+this.id+"Tier: "+this.tier);
    }

    public ArrayList<Customer> CustomerList(){

        return new ArrayList<Customer>() {
            {
                add(new Customer(1, "Stefan Walker", 1));
                add(new Customer(2, "Daija Von", 1));
                add(new Customer(3, "Ariane Rodriguez", 1));
                add(new Customer( 4, "Marques Nikolaus", 2));
                add(new Customer(5, "Rachelle Greenfelder", 0));
                add(new Customer(6, "Larissa White", 2));
                add(new Customer(7, "Fae Heidenreich", 1));
                add(new Customer(8, "Dino Will", 2));
                add(new Customer(9, "Eloy Stroman", 1));
                add(new Customer(10, "Brisa O'Connell", 1));
            }
        };
    }

}
