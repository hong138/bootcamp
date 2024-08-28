import java.time.LocalDate;
import java.util.Objects;

public class Company {
  private String companyName;
  private Staff2 staff;

  public Company(String companyName, Staff2 staff){
    this.companyName = companyName;
    this.staff = staff;
  }

  public String getCompanyName(){
    return this.companyName;
  }

  public Staff2 getStaff(){
    return this.staff;
  }

  @Override
  // if object is array, Arrays.toString()
  public String toString(){
    return "Company name is " + this.companyName + ", Staff name is " + this.staff;
  }

  @Override
  // Step 1 (address)
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    // Step 2 (return false if the object is not "from" Company.class)
    if (!(obj instanceof Company)) 
      return false;
    // Step3 ()
    Company company = (Company) obj;
    return Objects.equals(this.companyName, company.getCompanyName()) && Objects.equals(this.staff, company.getStaff());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.companyName, this.staff);
  }

  public static void main(String[] args) {

    Staff2 staff = new Staff2("Pikuchu", LocalDate.of(2024, 1, 2));
    Staff2 staff2 = new Staff2("BallBall", LocalDate.of(2024, 1, 1));
    
    Company company = new Company("HKG", staff);
    Company company2 = new Company("KKY", staff2);

    System.out.println(company.equals(company));
    System.out.println(company.equals(company2));
    System.out.println(company.hashCode());
    System.out.println(company2.hashCode());
  }
}
