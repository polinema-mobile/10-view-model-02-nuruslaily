package id.putraprima.mvvmlogin.viewmodels;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.models.LoggedInUser;

public class HomeViewModelFactory implements ViewModelProvider.Factory{
    private LoggedInUser loggedInUser;

    public HomeViewModelFactory(LoggedInUser loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(HomeViewModel.class)){
            return (T) new HomeViewModel(loggedInUser);
        }
        throw new IllegalArgumentException("Viewmodel Yang Diminta MainActivityViewModel");
    }
}
