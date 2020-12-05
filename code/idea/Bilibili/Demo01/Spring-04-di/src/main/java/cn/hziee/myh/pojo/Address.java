package cn.hziee.myh.pojo;

public class Address {

    private String Address;

    @Override
    public String toString() {
        return "Address{" +
                "Address='" + Address + '\'' +
                '}';
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
