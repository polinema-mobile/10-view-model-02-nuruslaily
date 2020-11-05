package id.putraprima.mvvmlogin.viewmodels;

import android.util.Patterns;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoggedInUser;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<LoggedInUser> loggedMutableLiveData = new MutableLiveData<>();
    public LoggedInUser logged = new LoggedInUser();

    public LiveData<LoggedInUser> getLogged(){
        return loggedMutableLiveData;
    }
    public void login(String username, String password) {

    }


    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}
