public class DeluxPizza extends Pizza{
    DeluxPizza(Boolean Veg) {
        super(Veg);
        if(Veg){
            price = 450;
        }
            else
            price = 550;

    BasePrice = price;
    }


}
