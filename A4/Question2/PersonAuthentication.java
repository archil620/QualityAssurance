public class PersonAuthentication {
    private String userName;
    private String password;

    public boolean AuthenticateUser() {
        return (userName.equals("joe") && password.equals("joepass"));
    }

    public void SetLoginCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}



