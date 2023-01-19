import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Customer {

    private String customerName;
    private int customerId;



    public Customer(String name, int id) {
        this.customerName = name;
        this.customerId = id;
    }

    public Customer() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + customerName + '\'' +
                ", id=" + customerId +
                '}';
    }

}
