package BankAccount;

public interface Creditable<T> {
  void credit(T value);
}
