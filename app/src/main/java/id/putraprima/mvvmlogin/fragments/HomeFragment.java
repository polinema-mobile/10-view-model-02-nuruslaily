package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentHomeBinding;
import id.putraprima.mvvmlogin.models.LoggedIn;
import id.putraprima.mvvmlogin.viewmodels.HomeViewModel;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModel;

public class HomeFragment extends Fragment {
    private LoggedIn loggedIn;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        //loggedIn = new ViewModelProvider(this).get(LoginViewModel.class);
        //binding.setLoginViewModel(loggedIn);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
}