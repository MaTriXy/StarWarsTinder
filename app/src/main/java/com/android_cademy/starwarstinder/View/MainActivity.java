package com.android_cademy.starwarstinder.View;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.android_cademy.starwarstinder.R;
import com.android_cademy.starwarstinder.ViewModel.MainActivityViewModel;
import com.android_cademy.starwarstinder.model.Profile;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Observer<List<Profile>> {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    MainActivityViewModel mainActivityViewModel =
        ViewModelProviders.of(this).get(MainActivityViewModel.class);
    mainActivityViewModel.getProfiles().observe(this,this);
  }

  @Override public void onChanged(@Nullable List<Profile> profiles) {
    //TODO Update UI and show new profiles
  }
}
