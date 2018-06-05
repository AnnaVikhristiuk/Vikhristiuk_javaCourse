package pg.mft.addressbook.model;

public class ContactData {
  private int id;
  private final String firstName;
 // private final String middleName;
  private final String lastName;
/*  private final String nickName;
  private final String title;
  private final String company;
  private final String address;
  private final String homePhone;
  private final String mobilePhone;
  private final String workPhone;
  private final String faxPhone;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String homePage;
  private final String birthDay;
  private final String birthMonth;
  private final String birthYear;
  private final String group;
  private final String address2;
  private final String phone2;
  private final String notes;*/

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ContactData that = (ContactData) o;

    if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
    return lastName != null ? lastName.equals(that.lastName) : that.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
  }

  public ContactData(int id, String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String faxPhone, String email1, String email2, String email3, String homePage, String birthDay, String birthMonth, String birthYear, String group, String address2, String phone2, String notes) {
    this.id = id;
    this.firstName = firstName;
   // this.middleName = middleName;
    this.lastName = lastName;
/*    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
    this.faxPhone = faxPhone;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homePage = homePage;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthYear = birthYear;
    this.group = group;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;*/
  }

  public ContactData(String firstName, String middleName, String lastName, String nickName, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String faxPhone, String email1, String email2, String email3, String homePage, String birthDay, String birthMonth, String birthYear, String group, String address2, String phone2, String notes) {
    this.id = Integer.MAX_VALUE;
    this.firstName = firstName;
  //  this.middleName = middleName;
    this.lastName = lastName;
/*    this.nickName = nickName;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.workPhone = workPhone;
    this.faxPhone = faxPhone;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homePage = homePage;
    this.birthDay = birthDay;
    this.birthMonth = birthMonth;
    this.birthYear = birthYear;
    this.group = group;
    this.address2 = address2;
    this.phone2 = phone2;
    this.notes = notes;*/
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

 /* public String getMiddleName() {
    return middleName;
  }*/

  public String getLastName() {
    return lastName;
  }

 /* public String getNickName() {
    return nickName;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public String getFaxPhone() {
    return faxPhone;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomePage() {
    return homePage;
  }

  public String getBirthDay() {
    return birthDay;
  }

  public String getBirthMonth() {
    return birthMonth;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public String getGroup() { return group; }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }

  public String getNotes() {
    return notes;
  }*/

  public void setId(int id) {
    this.id = id;
  }
}
