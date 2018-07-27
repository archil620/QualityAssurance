public class Person {
    PersonAuthentication personAuthentication = new PersonAuthentication();
    PersonContactInfo    personContactInfo    = new PersonContactInfo();
    private String       name;

    public Person(String name) {
        this.name = name;
    }

    public boolean AuthenticateUser() {
        return personAuthentication.AuthenticateUser();
    }

    public String GetAreaCode() {
        return personContactInfo.GetAreaCode();
    }

    public String GetPhoneNumber() {
        return personContactInfo.GetPhoneNumber();
    }

    public void SetAreaCode(String areaCode) {
        personContactInfo.SetAreaCode(areaCode);
    }

    public void SetLoginCredentials(String userName, String password) {
        personAuthentication.SetLoginCredentials(userName, password);
    }

    public void SetPhoneNumber(String phoneNumber) {
        personContactInfo.SetPhoneNumber(phoneNumber);
    }
}



