package id.putraprima.mvvmlogin.models;

import android.util.Patterns;

public class LoggedIn {
    private String email;
    private String password;

    public LoggedIn() {
    }

    public LoggedIn(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEmailValid() {
        return Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches();
    }


    public boolean isPasswordLengthGreaterThan5() {
        return getPassword().length() > 5;
    }
}
