package com.smd.nicdetailsfinder;

import android.content.Context;
import android.widget.Toast;

import java.util.Date;

public class NICDetailFinder {

//    private String gender, firstTwo, middle, mon;
//    private final int[] month = { 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366 };
//    private int i = -1, d = 0;
//    private int mid,mtemp,monInNum,checkValue;
//
//    public static String BIRTH_DAY,AGE,YEAR,MONTH,DAY,GENDER,MONTH_NUMBER;
//
//    public NICDetailFinder(String nicNumber){
//        if(nicNumber.length() == 10 || nicNumber.length() == 12)
//        {
//            if(nicNumber.length() == 10)
//            {
//                checkValue = 10;
//                oldNic(nicNumber);
//            }
//            else
//            {
//                checkValue = 12;
//                newNic(nicNumber);
//            }
//        }
//    }
//
//    private void oldNic(String nicNumber) {
//        firstTwo = nicNumber.substring(0,1);
//        middle = nicNumber.substring(2,4);
//        if(Integer.parseInt(middle) > 500){
//            gender = "Male";
//            for (int a: month
//                 ) {
//                ++i;
//                if (a > Integer.parseInt(middle))
//                {
//                    monInNum = monthNumber(a);
//                    mon = monthName(a);
//                    mid = Integer.parseInt(middle);
//                    try
//                    {
//                        mtemp = month[--i];
//                    }
//                    catch(Exception ex)
//                    {
//                        //
//                    }
//                    for (int i = 1; i < monthOfDays(a); i++)
//                    {
//                        mtemp++;
//                        d++;
//                        if (mtemp == mid)
//                            break;
//                    }
//                    break;
//                }
//            }
//        }
//        else
//        {
//            gender = "Female";
//            for (int a : month)
//            {
//                ++i;
//                if (a > (Integer.parseInt(middle) - 500))
//                {
//                    monInNum = monthNumber(a);
//                    mon = monthName(a);
//                    mid = Integer.parseInt(middle) - 500;
//                    mtemp = month[--i];
//                    for (int i = 1; i < monthOfDays(a); i++)
//                    {
//                        mtemp++;
//                        d++;
//                        if (mtemp == mid)
//                            break;
//                    }
//                    break;
//                }
//            }
//        }
//    }
//
//    private void newNic(String nicNumber) {
//        firstTwo = nicNumber.substring(0,3);
//        middle = nicNumber.substring(4,6);
//        if (Integer.parseInt(middle) < 500)
//        {
//            gender = "Male";
//            for(int a : month)
//            {
//                ++i;
//                if (a > Integer.parseInt(middle))
//                {
//                    monInNum = monthNumber(a);
//                    mon = monthName(a);
//                    mid = Integer.parseInt(middle);
//                    try
//                    {
//                        mtemp = month[--i];
//                    }
//                    catch (Exception ex) {
//                        //
//                    }
//                    for (int i = 1; i < monthOfDays(a); i++)
//                    {
//                        mtemp++;
//                        d++;
//                        if (mtemp == mid)
//                            break;
//                    }
//                    break;
//                }
//            }
//        }
//        else
//        {
//            gender = "Female";
//            for (int a : month)
//            {
//                ++i;
//                if (a > (Integer.parseInt(middle) - 500))
//                {
//                    monInNum = monthNumber(a);
//                    mon = monthName(a);
//                    mid = Integer.parseInt(middle) - 500;
//                    try { mtemp = month[--i]; } catch (Exception ex) {
//                        //
//                    }
//                    for (int i = 1; i < monthOfDays(a); i++)
//                    {
//                        mtemp++;
//                        d++;
//                        if (mtemp == mid)
//                            break;
//                    }
//                    break;
//                }
//            }
//        }
//    }
//
//    private int monthOfDays(int a) {
//        switch (a)
//        {
//            case 31:
//                return 31;
//            case 60:
//                return 29;
//            case 91:
//                return 31;
//            case 121:
//                return 30;
//            case 152:
//                return 31;
//            case 182:
//                return 30;
//            case 213:
//                return 31;
//            case 244:
//                return 31;
//            case 274:
//                return 30;
//            case 305:
//                return 31;
//            case 335:
//                return 30;
//            case 366:
//                return 31;
//            default:
//                return 0;
//        }
//    }
//
//    private String monthName(int a) {
//        switch (a)
//        {
//            case 31:
//                return "January";
//            case 60:
//                return "February";
//            case 91:
//                return "March";
//            case 121:
//                return "April";
//            case 152:
//                return "May";
//            case 182:
//                return "June";
//            case 213:
//                return "July";
//            case 244:
//                return "August";
//            case 274:
//                return "September";
//            case 305:
//                return "October";
//            case 335:
//                return "November";
//            case 366:
//                return "December";
//            default:
//                return null;
//        }
//    }
//
//    private int monthNumber(int a) {
//        switch (a)
//        {
//            case 31:
//                return 1;
//            case 60:
//                return 2;
//            case 91:
//                return 3;
//            case 121:
//                return 4;
//            case 152:
//                return 5;
//            case 182:
//                return 6;
//            case 213:
//                return 7;
//            case 244:
//                return 8;
//            case 274:
//                return 9;
//            case 305:
//                return 10;
//            case 335:
//                return 11;
//            case 366:
//                return 12;
//            default:
//                return 0;
//        }
//    }
//
//    protected void finalize(){
//        Date date = new Date();
//        if (checkValue == 10)
//        {
//            BIRTH_DAY =  ("19" + firstTwo) + " " + mon + " " + d;
//        }
//        else if (checkValue == 12)
//        {
//            BIRTH_DAY =  firstTwo + " " + mon + " " + d;
//        }
//        else
//        {
//            BIRTH_DAY =  null;
//        }
//
//        if (checkValue == 10)
//        {
//            AGE = Integer.toString(date.getYear() - Integer.parseInt(("19" + firstTwo)));
//        }
//        else if (checkValue == 12)
//        {
//            AGE =  Integer.toString(date.getYear() - Integer.parseInt(firstTwo));
//        }
//        else
//        {
//            AGE = null;
//        }
//
//        if (checkValue == 10)
//        {
//            YEAR =  "19" + firstTwo;
//        }
//        else if(checkValue == 12)
//        {
//            YEAR =  firstTwo;
//        }
//        else
//        {
//            YEAR =  null;
//        }
//
//        MONTH = mon;
//        DAY = Integer.toString(d);
//        GENDER = gender;
//        MONTH_NUMBER = Integer.toString(monInNum);
//
//    }

    public static void testLibrary(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
