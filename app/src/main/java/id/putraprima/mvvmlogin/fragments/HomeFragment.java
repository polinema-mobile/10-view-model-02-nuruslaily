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
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.models.LoggedInUser;
import id.putraprima.mvvmlogin.viewmodels.HomeViewModel;
import id.putraprima.mvvmlogin.viewmodels.HomeViewModelFactory;

public class HomeFragment extends Fragment {
    private LoggedInUser loggedInUser;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentHomeBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home, container, false);
        HomeViewModelFactory homeViewModelFactory = new HomeViewModelFactory(new ());
        loggedInUser = new ViewModelProvider(this, homeViewModelFactory).get(HomeViewModel.class);
        binding.setViewModel(homeViewModel);
        binding.setLifecycleOwner(this);
    }
}