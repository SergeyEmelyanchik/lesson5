package ru.geekbrains.lesson5;

import android.app.Application;

public class MyApp extends Application {

    public static int currentTheme = R.style.myThemeDefault;

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
