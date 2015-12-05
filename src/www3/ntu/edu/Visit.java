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

public class Visit {

    private Customer name;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getCustomerName() {
        return name.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = this.serviceExpense + serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = this.productExpense + productExpense;
    }

    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(name.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(name.getMemberType())));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer name=" + name.getName() +
                ", customer member=" + name.isMember() +
                ", customer member type=" + name.getMemberType() +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
