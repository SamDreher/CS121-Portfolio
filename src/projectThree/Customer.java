package projectThree;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accountArrayList = new ArrayList<>();

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
    }

    public void addAccount(Account account) {
        accountArrayList.add(account);
    }

    public void removeAccount(Account account) {
        accountArrayList.remove(account);
    }

    public Account getAccount(int accountNumber) {
        Account foundAccount = null;
        for(Account account : accountArrayList) {
            if(account.getAccountNumber() == accountNumber) {
                foundAccount = account;
                break;
            }
        }
        return foundAccount;
    }

    public String getAllAccounts() {
        String allAccounts = "";
        for (Account account : accountArrayList) {
            allAccounts += account.toString() + "\n";
        }
        return allAccounts;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s\n" + "Last Name: %s\n" + "PIN: %s\n", firstName, lastName, pin);
    }

    public String getPin() {
        return pin;
    }
}
