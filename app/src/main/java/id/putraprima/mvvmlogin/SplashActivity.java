package id.putraprima.mvvmlogin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;

import id.putraprima.mvvmlogin.fragments.LoginFragment;
import id.putraprima.mvvmlogin.fragments.SplashFragment;
import id.putraprima.mvvmlogin.viewmodels.SplashViewModel;

public class SplashActivity extends AppCompatActivity implements Runnable {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container, new SplashFragment());
            fragmentTransaction.commit();
        }

        Handler handler = new Handler();
        handler.postDelayed(this, 3000);
    }

    public void run() {
        Intent intent = new Intent(this, SplashViewModel.class);
        startActivity(intent);
        finish();
    }
}
