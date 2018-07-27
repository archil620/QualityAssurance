public class PersonContactInfo {
    private String areaCode;
    private String phoneNumber;

    public String GetAreaCode() {
        return areaCode;
    }

    public String GetPhoneNumber() {
        if ((areaCode != null) && (areaCode != "")) {
            return "(" + areaCode + ") " + phoneNumber;
        }

        return phoneNumber;
    }

    public void SetAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void SetPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


