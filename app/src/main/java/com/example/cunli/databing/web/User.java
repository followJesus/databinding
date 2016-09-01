package com.example.cunli.databing.web;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.cunli.databing.BR;


/**
 * Created by winder on 2016/7/6.
 */
public class User extends BaseObservable {
    public  String email;
    public  String password;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }



}