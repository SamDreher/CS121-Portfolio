package projectThree;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customerArrayList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerArrayList.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customerArrayList.remove(customer);
    }

    public Customer getCustomer(String pin) {
        Customer foundCustomer = null;
        for (Customer customer : customerArrayList) {
            if (customer.getPin().equals(pin)) {
                foundCustomer = customer;
                break;
            }
        }
        return foundCustomer;
    }

    public String getAllCustomers() {
        String allCustomers = "";
        for (Customer customer: customerArrayList) {
            allCustomers += customer.toString() + "\n";
        }
        return allCustomers;
    }
}
