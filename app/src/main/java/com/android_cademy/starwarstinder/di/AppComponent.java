package com.android_cademy.starwarstinder.di;

import com.android_cademy.starwarstinder.model.ProfileRepository;
import dagger.Component;
import javax.inject.Singleton;

@Singleton @Component(modules = { AppModule.class }) public interface AppComponent {

  //void inject(MainViewModel mainViewModel);

  void inject(ProfileRepository profileRepository);
}
