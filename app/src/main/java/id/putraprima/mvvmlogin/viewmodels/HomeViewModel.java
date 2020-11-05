package id.putraprima.mvvmlogin.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.models.LoggedInUser;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<LoggedInUser> loggedInUserMutableLiveData = new MutableLiveData<>();
    private LoggedInUser loggedInUser;

    public HomeViewModel(LoggedInUser loggedInUser) {
        this.loggedInUser = loggedInUser;
        this.loggedInUserMutableLiveData.setValue(this.loggedInUser);
    }

    public void doLogin(){
        this.loggedInUser.setUsername(loggedInUser.getUsername());
    }

    public LiveData<LoggedInUser> loggedInUserLiveData(){
        return this.loggedInUserMutableLiveData;
    }
}
