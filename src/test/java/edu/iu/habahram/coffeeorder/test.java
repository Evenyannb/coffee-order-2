package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.*;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void test1(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
        Beverage beverage1 = new Decaf();
        System.out.println(beverage1.cost());
        System.out.println(beverage1.getDescription());
        Beverage beverage2 = new Espresso();
        System.out.println(beverage2.cost());
        System.out.println(beverage2.getDescription());
        Beverage beverage3 = new DarkRoast();
        System.out.println(beverage3.cost());
        System.out.println(beverage3.getDescription());
    }
    @Test
    public void test2(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test3(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test4(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test5(){
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test6(){
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test7(){
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test8(){
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }@Test
    public void test9(){
        Beverage beverage = new Decaf();
        System.out.println(beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }@Test
    public void test10(){
        Beverage beverage = new Decaf();
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test11(){
        Beverage beverage = new Decaf();
        System.out.println(beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test12(){
        Beverage beverage = new Decaf();
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test13(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test14(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test15(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test16(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
    @Test
    public void test17(){
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }


}
