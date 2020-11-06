package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.models.LoggedIn;
import id.putraprima.mvvmlogin.viewmodels.LoginViewModel;

public class LoginFragment extends Fragment {
    public static String LOGIN_SUCCESSFUL = "LOGIN_SUCCESSFUL";

    private LoginViewModel loginViewModel;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
        binding.setLifecycleOwner(this);
        binding.setLoginViewModel(loginViewModel);
        loginViewModel.getUser().observe(getViewLifecycleOwner(), new Observer<LoggedIn>() {
            @Override
            public void onChanged(@Nullable LoggedIn loggedIn) {

                if (TextUtils.isEmpty(Objects.requireNonNull(loggedIn).getEmail())) {
                    binding.editTextEmail.setError("Enter an E-Mail Address");
                    binding.editTextEmail.requestFocus();
                } else if (!loggedIn.isEmailValid()) {
                    binding.editTextEmail.setError("Enter a Valid E-mail Address");
                    binding.editTextEmail.requestFocus();
                } else if (TextUtils.isEmpty(Objects.requireNonNull(loggedIn).getPassword())) {
                    binding.editTextPassword.setError("Enter a Password");
                    binding.editTextPassword.requestFocus();
                } else if (!loggedIn.isPasswordLengthGreaterThan5()) {
                    binding.editTextPassword.setError("Enter at least 6 Digit password");
                    binding.editTextPassword.requestFocus();
                } else {
                    binding.lblEmailAnswer.setText(loggedIn.getEmail());
                    binding.lblPasswordAnswer.setText(loggedIn.getPassword());
                }

            }
        });return binding.getRoot();
    }

}