package creational;

public class Builder {
    /*
    Builder pattern will come to rescue whenu have custom options to creatre ex a subway order.
    we cant create al the 2^n options of creating subway & cannot be  a setter as they have t be made first
    * */
}
class Burger
{
    public Burger(BurgerBuilder burgerBuilder) {
        // copy alll values;
    }

    int size;

    boolean cheese = false;
    boolean pepperoni = false;
    boolean lettuce = false;
    boolean tomato = false;


}
class BurgerBuilder
{
    int size;

    boolean cheese = false;
    boolean pepperoni = false;
    boolean lettuce = false;
    boolean tomato = false;

    BurgerBuilder(int $size)
    {
        size=$size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public Burger build()
    {
        return new Burger(this);
    }
}