package BankAccount;

public interface Debitable<T> {
  boolean debit(T value);
}
