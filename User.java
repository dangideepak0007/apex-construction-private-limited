
package ApexConstructionPrivateLimited;

public class User {
    
    private String userName;
    private String mobileNumber;
    private String gender;

    public User(String userName, String mobileNumber, String gender) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

