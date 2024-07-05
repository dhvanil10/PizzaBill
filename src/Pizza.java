public class Pizza {
    Boolean Veg;
    int price;
    int BasePrice;
    int ExtraCheese;
    int ExtraTopping;
    int bag=0;

    Pizza(Boolean  Veg ){
        this.Veg = Veg;
        if(this.Veg){
            price = 300;
        }
        else
            price = 400;
        BasePrice = price;
        ExtraCheese = 0;
        ExtraTopping = 0;
    }

    void addExtraCheese() {
        ExtraCheese = 100;
        System.out.println("Extra Cheese Added");
        price += 100;

    }
    void addExtraTopping(){
        ExtraTopping = 150;
        System.out.println("Extra Topping Added");
        price+=150;
    }

    void Bag(){
        price+=20;
        bag = 20;
    }

    void GetBill(){
        System.out.println("Base Pizza Price: "+BasePrice);
        System.out.println("Extra Cheese: "+ExtraCheese);
        System.out.println("Extra Topping:"+ExtraTopping);
        System.out.println("Bags: "+bag);
        System.out.println("Total Amount:"+price);
    }



}

