package org.cadenhead.ecommerce;

/**
 * Created by viruser on 2018/8/30.
 */
public class GiftShop {
    public static void main(String[] args){
        Storefront store = new Storefront();
        store.addItem("C01","MUG","9.99","150",false);
        store.addItem("C02","LG MUG","12.99","82" ,true);
        store.addItem("C03","MOUSEPAD","10.49","800",false);
        store.addItem("D01","T SHIRT","16.99","90",true);
        store.sort();

        for(int i = 0; i < store.getSize(); i++){
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem ID: " + show.getId() +
                            "\nName: " + show.getName() +
                            "\nRetail Price: $" + show.getRetailprice() +
                            "\nPrice: $" + show.getPrice() +
                            "\nRate: " + show.getRate() +
                            "\nQuantity: " + show.getQuantity());
        }
    }
}
