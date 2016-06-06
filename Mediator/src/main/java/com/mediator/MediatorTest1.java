package com.mediator;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class MediatorTest1 {

    public static void main(String[] args) {

        Mediator mediator = new President();

        Market market = new Market(mediator);
        Development development = new Development(mediator);
        Finacial finacial = new Finacial(mediator);

        market.selfAction();
        market.outAction();
    }
}
