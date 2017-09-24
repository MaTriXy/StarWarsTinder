package com.android_cademy.starwarstinder.model;

import com.android_cademy.starwarstinder.db.AppDatabase;
import com.android_cademy.starwarstinder.network.ProfileNetworkDataSource;
import javax.inject.Inject;

public class ProfileRepository {

  private final AppDatabase db;
  private final ProfileNetworkDataSource profileNetworkDataSource;

  @Inject
  public ProfileRepository(AppDatabase db, ProfileNetworkDataSource profileNetworkDataSource) {
    this.db = db;
    this.profileNetworkDataSource = profileNetworkDataSource;
  }
}
