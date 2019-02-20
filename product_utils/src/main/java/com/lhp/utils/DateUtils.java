package com.lhp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

   public static String date2String(Date date,String patt){
       SimpleDateFormat sdf=new SimpleDateFormat(patt);
       String format = sdf.format(date);
       return format;
   }

   public static Date string2Date(String string,String patt) throws ParseException {
       SimpleDateFormat sdf=new SimpleDateFormat(patt);
       Date date = sdf.parse(string);
       return date;
   }
}
