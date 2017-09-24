package com.android_cademy.starwarstinder.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.android_cademy.starwarstinder.model.Profile;

@Dao public interface ProfileDao {

  @Query("Select * from profile") LiveData<Profile> getProfiles();

  @Insert(onConflict = OnConflictStrategy.REPLACE) void bulkInsert(Profile... weather);

  @Query("DELETE FROM profile") void deleteProfiles();
}
