package com.company;

public class Positions {
    private Goods positionGood;
    private int positionAmount;
    private double positionPrice;

    @Override
    public String toString() {
        return
                positionGood.getGoodDescription() +
                "            " + positionAmount +
                "            " + positionPrice +"\n";
    }

    public Positions(Goods positionGood, int positionAmount) {
        this.positionGood = positionGood;
        this.positionAmount = positionAmount;
        this.positionPrice = setPositionPrice(this.positionGood.goodPrice,this.positionAmount);
    }

    public double getPositionPrice() {
        return positionPrice;
    }

    public static double setPositionPrice(double positionPrice, int positionAmount)
    {
        double price = 0;
        for (int i = 0; i < positionAmount;i++)
            price+=positionPrice;
        return price;
    }
}
