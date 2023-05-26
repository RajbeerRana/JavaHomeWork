package GroupProject2;

public class Registration {
    //Create Registration Class in which you would have variables as
    //email, userName and password that have an access scope only
    //within its own class. After creating an object of the class user should
    //be able to call methods and in each method separately pass values
    //to set users email, username and password.
    //Requirements:
    //A. Valid email consider to be only yahoo
    //B. Valid userName and password cannot be empty and should be of
    //length larger than 6 characters. Also, valid password cannot contain
    //userName.

    private String email;
    private String userName;
    private String password;

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        if (email.contains("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("THis email is invalid, try again ");
            ;
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(!userName.isBlank() && userName.length() >= 6){
            this.userName = userName;
        }else{
            System.out.println("Please enter valid user name");
        }
    }

    public String getPassword() {
      return password;
    }

    public void setPassword(String password) {
        if(!password.isBlank() && password.length() >= 6 && !password.equals(userName)){
            this.password = password;
        }else{
            System.out.println("Please enter valid Password");
        }
    }
}

