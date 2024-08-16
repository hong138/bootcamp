package customer;

public class User {

    private Order[] orders;
    private String firstName;
    private String lastName;
    private int age;
    private int userId;
    private int phoneNumber;
    private String gender;
    private String address;
    private String email;

    public User(Order[] orders, String firstName, String lastName, 
                int age, int userId, int phoneNumber, 
                String gender, String address, String email) {
      this.orders = orders;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.userId = userId;
      this.phoneNumber = phoneNumber;
      this.gender = gender;
      this.address = address;
      this.email = email;
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

    public void setGender(String gender) {
      this.gender = gender;
    }

    public void setAddress(String address) {
      this.address = address;
    }

    public void setEmail(String email) {
      this.email = email;
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

    public String getGender(){
      return this.gender;
    }

    public String getAddress(){
      return this.address;
    }

    public String getEmail(){
      return this.email;
    }
  
}
