/**
 * File: DecisiomMakingSimulation.java
 * Author: Junnan Shimizu
 * Date: 10/30/2021
 */

import java.util.ArrayList;

public class RandomCustomer extends Customer{

    /*
    Constructor. This should call the super class's constructor with the
    given number of items and 1 as the initial value for the time steps.
    This is meant to simulate the amount of time the RandomCustomer spends choosing a line.
    The RandomCustomer spends one time-step choosing a line, so it needs to start its counter at 1.
     */
    public RandomCustomer( int num_items ){
        super(num_items, 1);
    }

    // Returns an integer randomly chosen from the range 0 (inclusive) to the length of the list (exclusive).
    public int chooseLine(ArrayList<CheckoutAgent> checkouts) {
        return (int)(Math.random() * checkouts.size());
    }
}
