package BigJava;

/**
 * Created by etenbrinke on 18/11/15.
 */
public class CashRegisterTester {

    public static void main(String[] args) {
        CashRegister register1 = new CashRegister();
        CashRegister register2 = new CashRegister(100);
        register1.addItem(2.10);
        register2.addItem(2.10);
        register1.addItem(3.30);
        register1.addItem(1.20);
        System.out.println("register1, total items: " + register1.getCount());
        System.out.printf("register1, total price: %.2f\n", register1.getTotal());
        System.out.println("register2, total items: " + register2.getCount());
        System.out.printf("register2, total price: %.2f\n", register2.getTotal());
        System.out.println("register1, stock number: " + register1.getStockNumber());
        System.out.println("register2, stock number: " + register2.getStockNumber());
    }

}
