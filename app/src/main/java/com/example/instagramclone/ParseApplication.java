package com.example.instagramclone;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Gks7sDzjDRcfBKlhwyPvVFsnUqp8v4M8NAdofxHZ")
                .clientKey("Mphap47MeG2v3yyRxGzlKdybSubuZyblB0holJZ2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}