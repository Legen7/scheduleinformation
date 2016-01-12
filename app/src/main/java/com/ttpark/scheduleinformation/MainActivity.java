package com.ttpark.scheduleinformation;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    private int year_c = 0;
    private int month_c = 0;
    private int day_c = 0;
    private int week_c = 0;
    private int week_num = 0;
    private String currentDate = "";
    private int currentYear;
    private int currentMonth;
    private int currentDay;
    private int currentWeek;
    private int currentNum;



/*****
 *
 * 日期计算主程序
 *
 *  **/
    public MainActivity(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
        currentDate = sdf.format(date);
        year_c = Integer.parseInt(currentDate.split("-")[0]);
        month_c = Integer.parseInt(currentDate.split("-")[1]);
        day_c = Integer.parseInt(currentDate.split("-")[2]);
        currentYear = year_c;
        currentMonth = month_c;
        currentDay = day_c;
        

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
}
