package com.travelbudget.travelbudget;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Conner on 11/9/2015.
 */
public class SharedPrefManager {
    public static final String MY_EMP_PREFS = "MySharedPref";

    private static Context mContext;

    private static String mpgs = "";

    private static String food = "";

    private static String hotelPrice = "";

    private static String mileage = "";

    private static String taxes = "";

    public static void Init(Context context){
        mContext = context;
    }
    public static void LoadFromPref()
    {
        SharedPreferences settings = mContext.getSharedPreferences(MY_EMP_PREFS, 0);

        mpgs = settings.getString("MPG's", "");

        food = settings.getString("Food", "");

        hotelPrice = settings.getString("Hotel price", "");

        mileage = settings.getString("Total mileage", "");

        taxes = settings.getString("Tax rates", "");
    }

    public static void StoreToPref() {

        SharedPreferences settings = mContext.getSharedPreferences(MY_EMP_PREFS, 0);

        SharedPreferences.Editor editor = settings.edit();

        editor.putString("MPG's", mpgs);
        editor.putString("Food", food);
        editor.putString("Hotel price", hotelPrice);
        editor.putString("Total mileage", mileage);
        editor.putString("Tax rates", taxes);

        editor.commit();

    }

    public static void DeleteSingleEntryFromPref(String keyName)
    {
        SharedPreferences settings = mContext.getSharedPreferences(MY_EMP_PREFS, 0);

        SharedPreferences.Editor editor = settings.edit();
        editor.remove(keyName);
        editor.commit();
    }

    public static void DeleteAllEntriesFromPref()
    {
        SharedPreferences settings = mContext.getSharedPreferences(MY_EMP_PREFS,0);

        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
    }

    public static void setMpgs (String a)
    {
        mpgs = a;
    }

    public static void setFood (String b)
    {
        food = b;
    }

    public static void setHotel (String c)
    {
        hotelPrice = c;
    }

    public static void setPeople (String d) {mileage = d;}

    public static void setTaxes (String e)
    {
        taxes = e;
    }

    public static String getMpgs()
    {
        return mpgs;
    }

    public static String getFood()
    {
        return food;
    }

    public static String getHotel() { return hotelPrice;}

    public static String getPeople()
    {
        return mileage;
    }

    public static String getTaxes()
    {
        return taxes;
    }

}