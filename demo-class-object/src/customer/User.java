package customer;

public class User {

    private Order[] orders;
    private String firstName;
    private String lastName;
    private int age;
    private int userId;
    private int phoneNumber;

    public User(){

    }

    public User(String firstName, String lastName, 
                int age, int userId, int phoneNumber) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.userId = userId;
      this.phoneNumber = phoneNumber;
      }

    // setter
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public void setUserId(int userId) {
      this.userId = userId;
    }

    public void setPhoneNumber(int phoneNumber) {
      this.phoneNumber = phoneNumber;
    }

    // getter
    public Order[] getOrders(){
      return this.orders;
    }

    public String getFullName(){
      return this.firstName + " " + this.lastName;
    }

    public int getAge(){
      return this.age;
    }

    public int getUserId(){
      return this.userId;
    }

    public int getPhoneNumber(){
      return this.phoneNumber;
    }  

    static class getFullName {

        public getFullName() {
        }
    }
}
