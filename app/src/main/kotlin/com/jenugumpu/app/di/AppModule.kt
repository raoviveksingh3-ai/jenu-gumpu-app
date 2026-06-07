package com.jenugumpu.app.di

import android.content.Context
import androidx.room.Room
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.jenugumpu.app.data.api.PriceApi
import com.jenugumpu.app.data.local.db.JenuGumpuDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): JenuGumpuDatabase {
        return Room.databaseBuilder(
            context,
            JenuGumpuDatabase::class.java,
            "jenu_gumpu_db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Singleton
    @Provides
    fun provideFirebaseFirestore(): FirebaseFirestore = FirebaseFirestore.getInstance()

    @Singleton
    @Provides
    fun provideFirebaseStorage(): FirebaseStorage = FirebaseStorage.getInstance()

    @Singleton
    @Provides
    fun providePriceApi(): PriceApi {
        return Retrofit.Builder()
            .baseUrl("https://api.jenugumpu.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PriceApi::class.java)
    }

    @Singleton
    @Provides
    fun provideUserDao(database: JenuGumpuDatabase) = database.userDao()

    @Singleton
    @Provides
    fun provideHarvestLogDao(database: JenuGumpuDatabase) = database.harvestLogDao()
}