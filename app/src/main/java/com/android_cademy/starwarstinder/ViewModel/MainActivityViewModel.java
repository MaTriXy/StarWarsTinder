package com.android_cademy.starwarstinder.ViewModel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.android_cademy.starwarstinder.model.Profile;
import java.util.List;

public class MainActivityViewModel extends ViewModel {

  private MutableLiveData<List<Profile>> profiles;

  public MutableLiveData<List<Profile>> getProfiles() {
    if (profiles == null) {
      profiles = new MutableLiveData<>();
      loadProfiles();
    }
    return profiles;
  }

  private void loadProfiles() {

  }
}
