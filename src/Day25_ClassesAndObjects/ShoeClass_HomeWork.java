package Day25_ClassesAndObjects;

import java.util.ArrayList;

public class ShoeClass_HomeWork {
    /*Write a Class and Name it Shoes that has following attributes
1) Brand
2) Size
3) Type
4) Price
Also has following Methods
1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
2) Print(): Where it prints the the value of attributes.

Create 4 different Object (Class Instance) of Shoes Class. and add it to array-list.
Print all of the Shoe instances that has price over 10,
Apply discount for those 15% off on the ones that has Price of 50 or over */
    String Brand;
    double Size;
    String Type;
    double Price;

    public void setShoeValues(String brd,double sz,String Typ,double pr){
        Brand = brd;
        Size = sz;
        Type = Typ;
        Price = pr;
    }
     public void print(){
        System.out.println("The brand: " +Brand+ "The size: " +Size+ "The type: " +Type+ "The price: " +Price);

    }

    public static void main(String[] args) {
        ShoeClass_HomeWork Shoe1 = new ShoeClass_HomeWork();
        Shoe1.setShoeValues("Louboutin, ",7.5,"\tHigh Heels, ",795.30);

        ShoeClass_HomeWork Shoe2 = new ShoeClass_HomeWork();
        Shoe2.setShoeValues("Adidas, ",11, "\tSneaker, ",65.99);

        ShoeClass_HomeWork Shoe3 = new ShoeClass_HomeWork();
        Shoe3.setShoeValues("stride Rite, ",3.5, "\tSandal",35.99);

        ShoeClass_HomeWork Shoe4 = new ShoeClass_HomeWork();
        Shoe4.setShoeValues("Margaritaville, ",9, "\tFlip flop",9);

        Shoe1.print();
        Shoe2.print();
        Shoe3.print();
        Shoe4.print();

        ArrayList<ShoeClass_HomeWork> shop = new ArrayList<>(); shop.add(Shoe1);shop.add(Shoe2);shop.add(Shoe3);shop.add(Shoe4);

        for (int i = 0; i <shop.size() ; i++) {
            if (shop.get(i).Price > 10.00){
                System.out.println("The shoes over 10.00: "+shop.get(i).Brand);

            }
            if(shop.get(i).Price >= 50.00){
                shop.get(i).Price = shop.get(i).Price*0.85;
                System.out.println("Price after discount: " +shop.get(i).Price+shop.get(i).Brand);
            }
        }

        }







    }


