package www3.ntu.edu;

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

public class Customer {

    private String name;
    private boolean member;
    private String memberType;

    public Customer() {
        this.member = false;
    }

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
