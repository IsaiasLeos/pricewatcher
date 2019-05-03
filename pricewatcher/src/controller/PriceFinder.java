package controller;

import network.WebServerSocket;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/**
 * This class handles the logic and memory storage of the item.
 *
 * @author Isaias Leos
 */
public class PriceFinder extends WebServerSocket {

    /**
     * 
     */
    public PriceFinder() {
    }

    /**
     *
     *
     * @param url
     * @return
     */
    public double getPrice(String url) {
        return priceScrape(url);
    }

    /**
     * Generate a simulated price of an item between $300.00-$400.00.
     *
     * @param medValue
     * @return random double between 300 - 400
     */
    @Deprecated
    public double getPrice(Double medValue) {
        Random rand = new Random();
        double minValue = medValue - (medValue / 10);
        double maxValue = medValue + (medValue / 10);
        return (new BigDecimal(minValue + (maxValue - minValue) * rand.nextDouble()).setScale(2, RoundingMode.CEILING).doubleValue());
    }
}
