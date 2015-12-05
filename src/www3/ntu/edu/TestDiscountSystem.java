package www3.ntu.edu;

import java.util.Date;

/**
 * Created by etenbrinke on 30/11/15.
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
 *
 * You are asked to write a discount system for a beauty saloon, which provides services and sells beauty products.
 * It offers 3 types of memberships: Premium, Gold and Silver.
 * Premium, gold and silver members receive a discount of 20%, 15%, and 10%, respectively, for all services provided.
 * Customers without membership receive no discount.
 * All members receives a flat 10% discount on products purchased (this might change in future).
 * Your system shall consist of three classes: Customer, Discount and Visit, as shown in the class diagram.
 * It shall compute the total bill if a customer purchases $x of products and $y of services, for a visit.
 * Also write a test program to exercise all the classes.
 */

public class TestDiscountSystem {

    public static void main (String[] args) {

        Customer c1 = new Customer("Piet Clerx", true, "Premium");
        Customer c2 = new Customer("Trees Klaas", true, "Silver");
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        Visit v1 = new Visit(c1, new Date());
        System.out.println(v1.toString());

        v1.setProductExpense(4.5);
        v1.setServiceExpense(8.5);
        v1.setProductExpense(1.5);
        System.out.println(v1.toString());
        System.out.println("Total expense made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());

    }
}
