package net.tf.chapter06;

/**
 * @author yuan
 * @version 1.00
 * @time 2019/1/19 9:04
 * @desc 不可变类
 */
public class Address {
    private final String postCode;
    private final String detail;

    public Address() {
        this.detail = "";
        this.postCode = "";
    }

    public Address(String postCode, String detail) {
        this.postCode = postCode;
        this.detail = detail;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getDetail() {
        return detail;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == this.getClass()) {
            Address address = (Address) obj;
            return address.postCode.equals(this.getPostCode()) && address.getDetail().equals(this.getDetail());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return detail.hashCode() + postCode.hashCode() + 31;
    }

    public static void main(String[] args) {
        Address address1 = new Address("xx","cc");
        Address address2 = new Address("xx","cc");
        System.out.println(address1.equals(address2));
        System.out.println(address1.hashCode());
        System.out.println(address1.getPostCode());
    }
}