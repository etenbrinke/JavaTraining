package BigJava;

/**
 * Created by etenbrinke on 18/11/15.
 * A simulated cash register that tracks the item count and the total amount due
 */

public class CashRegister {

    private int itemCount, stockNumber; // Each CashRegister object has its own itemCount, totalPrice and stockNumber instance variable
    private double totalPrice, initialPrice;
    private static int lastStockNumber = 1000; // single copy of lastStockNumber static variable in the CashRegister class

    public CashRegister(int itemCount, int stockNumber, double totalPrice, double initialPrice) {
        this.itemCount = itemCount;
        this.stockNumber = stockNumber;
        this.totalPrice = totalPrice;
        this.initialPrice = initialPrice;
    }

    /** Construct a cash register with cleared item count and total
     *
     */
    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
        lastStockNumber++;
        stockNumber = lastStockNumber;
    }

    public CashRegister(double initialPrice) {
        itemCount = 10;
        totalPrice = initialPrice;
        lastStockNumber++;
        stockNumber = lastStockNumber;
    }

    /** Adds an item to this cash register
     * @param price the price of this item
     */
    public void addItem(double price, double totalPrice) {
        itemCount++;
        this.totalPrice = totalPrice + price;
    }

    /**
     * Gets the price of all items in the current sale
     * @return the total amount
     */
    public double getTotal() {
        return totalPrice;
    }

    /**
     * Gets the number of items in the current sale
     * @return the item count
     */
    public int getCount() {
        return itemCount;
    }

    /**
     * show backaccount number
     */
    public int getStockNumber() { return stockNumber; }

    /**
     * Clear the item count and the total
     */
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }

    public void addItem(double v) {
    }
}
