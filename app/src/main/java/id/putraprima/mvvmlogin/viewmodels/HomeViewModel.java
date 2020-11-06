package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoggedIn;

public class HomeViewModel extends ViewModel {
    public MutableLiveData<LoggedIn> loggedInMutableLiveData = new MutableLiveData<>();
    public LoggedIn loggedIn = new LoggedIn();

    public LiveData<LoggedIn> getLoggedIn(){
        return loggedInMutableLiveData;
    }

}
