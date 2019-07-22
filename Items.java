package question1;

import java.util.Scanner;

public class Items extends Validate {

    public static void main(String[] args) {
        Scanner chukua;
        String[] items, price;
        String user;
        double prices,discount,amount=0;
        discount=0;
        items=new String[5];
        price=new String[5];
        chukua=new Scanner(System.in);

        for(int x=0;x<5;x++){
            System.out.println("enter the item");
            items[x]=chukua.next();

            System.out.println("enter the price");
            prices=chukua.nextDouble();
            price[x]=String.valueOf(prices);

            if (prices>4000&& prices<5001){
                    discount=500;
                    prices=prices-discount;
            }else if (prices>3000&& prices<4001) {
                discount = 400;
                prices = prices - discount;
            }else  if (prices>2000&& prices<3001) {
                discount = 300;
                prices = prices - discount;
            }else  if (prices>1000&& prices<2001) {
                discount = 200;
                prices = prices - discount;
            }else  if (prices>0&& prices<1001) {
                discount = 100;
                prices = prices - discount;
            }else {
                System.out.println("their is no such a price");
            }

            amount=amount+prices;


        }
        for (int x=0;x<5;x++){
            System.out.println(items[x]+""+price[x]);
        }


    }
}


