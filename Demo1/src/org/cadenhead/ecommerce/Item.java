package org.cadenhead.ecommerce;

public class Item implements Comparable{
    private String id;
    private String name;
    private double price;
    private int quantity;
    private double retailprice;
    private double rate;
    private boolean nodiscount;

    Item(String idIn, String nameIn, String pricelIn, String qIn, boolean noDiscountIn){
        id = idIn;
        name = nameIn;
        price = Double.parseDouble(pricelIn);
        quantity = Integer.parseInt(qIn);
        retailprice = price * rate(quantity,noDiscountIn);
        retailprice = Math.floor(retailprice * 100 +.5)/100;
    }

    private double rate(int quantity, boolean nodiscount){
        if(nodiscount == false){
            if (quantity > 400)
                rate = .5D;
            else if(quantity > 200)
                rate = .6D;
            else
                rate =.7D;
        }
        else
            rate = 1D;

        return rate;
    }

    public int compareTo(Object obj){
        Item temp = (Item) obj;
        if (this.retailprice < temp.retailprice){
            return 1;
        }else if (this.retailprice > temp.retailprice){
            return -1;
        }
        return 0;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getRetailprice(){
        return retailprice;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public double getRate(){
        return rate;
    }
}
