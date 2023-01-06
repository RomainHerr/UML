package main2;

public interface ATM {
    void login(Client client);
    void deposit(Account account, int amount);
    void withdraw(Account account, int amount);
}
