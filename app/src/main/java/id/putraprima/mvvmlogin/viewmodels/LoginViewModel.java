package id.putraprima.mvvmlogin.viewmodels;

import android.util.Patterns;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoggedIn;

public class LoginViewModel extends ViewModel {
    public MutableLiveData<String> EmailAddress = new MutableLiveData<>();
    public MutableLiveData<String> Password = new MutableLiveData<>();

    private MutableLiveData<LoggedIn> userMutableLiveData;

    public MutableLiveData<LoggedIn> getUser() {

        if (userMutableLiveData == null) {
            userMutableLiveData = new MutableLiveData<>();
        }
        return userMutableLiveData;

    }

    public void onClick(View view) {

        LoggedIn loginUser = new LoggedIn(EmailAddress.getValue(), Password.getValue());

        userMutableLiveData.setValue(loginUser);

    }

}
