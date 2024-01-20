package com.example.telepropinas;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.google.firebase.auth.FirebaseUser;

public class SharedViewModel extends AndroidViewModel {

    private final Application app;

    public SharedViewModel(@NonNull Application application) {
        super(application);
        this.app = application;
    }

    private MutableLiveData<FirebaseUser> user = new MutableLiveData<>();;

    public LiveData<FirebaseUser> getUser() {
        return user;
    }

    public void setUser(FirebaseUser passedUser) {
        user.postValue(passedUser);
    }


}
