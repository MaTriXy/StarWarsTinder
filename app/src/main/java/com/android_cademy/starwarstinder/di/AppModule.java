package com.android_cademy.starwarstinder.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module public class AppModule {

  private Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  @Provides @Singleton Context providesAppContext() {
    return application.getApplicationContext();
  }

  //@Provides @Singleton AppDatabase providesDatabase(Context context) {
  //  return Room.inMemoryDatabaseBuilder(context.getApplicationContext(), AppDatabase.class).build();
  //}
  //
  //@Provides @Singleton FirebaseAuth providesFirebaseAuth() {
  //  return FirebaseAuth.getInstance();
  //}
  //
  //@Provides @Singleton FirebaseDatabase providesDatabaseReference() {
  //  return FirebaseDatabase.getInstance();
  //}
  //
  //@Provides @Singleton FirebaseRemoteConfig providesRemoteConfig() {
  //  FirebaseRemoteConfig remoteConfig = FirebaseRemoteConfig.getInstance();
  //  FirebaseRemoteConfigSettings configSettings =
  //      new FirebaseRemoteConfigSettings.Builder().setDeveloperModeEnabled(BuildConfig.DEBUG)
  //          .build();
  //  remoteConfig.setConfigSettings(configSettings);
  //  remoteConfig.setDefaults(R.xml.remote_config_defaults);
  //  return remoteConfig;
  //}
}
