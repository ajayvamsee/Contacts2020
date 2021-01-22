package com.example.contacts2020;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import org.w3c.dom.ls.LSException;

import java.util.List;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID="67B5624F-E30D-9C5E-FF5E-19FF0AE1F100";
    public static final String API_KEY="5C2F4404-EDE6-4748-95D8-CB2BD8071ACA";
    public static final String SERVER_URL="https://api.backendless.com";

    // inorder to identify the user of his own contacts

    public static BackendlessUser user;


    // Setting Access of contacts throught  out the application

      public static List<Contact> contacts;




    @Override
    public void onCreate() {
        super.onCreate();


        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(),APPLICATION_ID,API_KEY);
    }
}



