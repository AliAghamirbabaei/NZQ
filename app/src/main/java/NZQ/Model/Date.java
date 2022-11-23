package Model;

import ir.huri.jcal.JalaliCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Date {

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    public Date(int year, int month, int day, int hour, int minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String toIran() {
        JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar(year, month, day, hour, minute)); 
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("IRST"));
        calendar.set(year, month - 1, day, hour, minute);
        java.util.Date date = calendar.getTime();
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String formatted = simpleDateFormat.format(date);
        StringBuilder sb = new StringBuilder(jalaliDate.toString());
        sb.append(" ");
        sb.append(formatted);
        return sb.toString();
    }

    @Override
    public String toString() {
        String sDay;
        String sMonth;
        String sHour;
        String sMinute;
        if (day < 10) {
            sDay = "0" + day;
        } else {
            sDay = String.valueOf(day);
        }

        if (month < 10) {
            sMonth = "0" + month;
        } else {
            sMonth = String.valueOf(month);
        }

        if (hour < 10) {
            sHour = "0" + hour;
        } else {
            sHour = String.valueOf(hour);
        }

        if (minute < 10) {
            sMinute = "0" + minute;
        } else {
            sMinute = String.valueOf(minute);
        }

        return year + "-" + sMonth + "-" + sDay + " " + sHour + ":" + sMinute;
    }

    public static Date stringToDate(String time) {
        String[] formattedTimeAndDate = time.split(" ");
        String[] formattedDate = formattedTimeAndDate[0].split("-");
        String[] formattedTime = formattedTimeAndDate[1].split(":");
        return new Date(Integer.parseInt(formattedDate[0]),
                Integer.parseInt(formattedDate[1]),
                Integer.parseInt(formattedDate[2]),
                Integer.parseInt(formattedTime[0]),
                Integer.parseInt(formattedTime[1]));
    }

    public static int getDifferentBetweenTwoDates(String date1, String date2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            java.util.Date firstDate = simpleDateFormat.parse(date1);
            java.util.Date secondDate = simpleDateFormat.parse(date2);

            long diffInMillis = Math.abs(secondDate.getTime() - firstDate.getTime());
            return (int) TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
        } catch (ParseException parseException) {
            return -1;
        }
    }
    
    public static boolean isDateDead(Date date) {
        Date currentDate = Date.getCurrentDate();
        if (date.getYear() < currentDate.getYear()) {
            return true;
        }
        if (date.getMonth() < currentDate.getMonth()) {
            return true;
        }
        
        if (date.getDay() < currentDate.getDay()) {
            return true;
        }
        return false;
    }
//
//    public static Boolean isDeadlinePassed(Date date) {
//        int deadline = Integer.parseInt(date.getYear() + "" + date.getMonth() + "" + date.getDay());
//        Date currentDate = getCurrentDate();
//        int now = Integer.parseInt(currentDate.getYear() + "" + currentDate.getMonth() + "" + currentDate.getDay());
//        return now >= deadline;
//    }

    public static Date getCurrentDate() {
        final java.util.Date currentTime = new java.util.Date();
        final SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        formattedDate.setTimeZone(TimeZone.getTimeZone("GMT"));
        return stringToDate(formattedDate.format(currentTime));
    }
}
/*
boolean dayDateValidation(String day) {
        this.day = day;
        int monthValue = Integer.parseInt(month);
        int dayValue = Integer.parseInt(day);
        int yearValue = Integer.parseInt(year);

        if (day.length() > 2) {
            return false;
        }

        if (dayValue < 1) {
            return false;
        }

        if (dayValue >= 1) {
            if ((monthValue == 4
                    || monthValue == 6
                    || monthValue == 9
                    || monthValue == 11)
                    && dayValue <= 30) {
                return true;
            }
            }
            if ((monthValue == 1
                    || monthValue == 3
                    || monthValue == 5
                    || monthValue == 7
                    || monthValue == 8
                    || monthValue == 10
                    || monthValue == 12)
                    && dayValue <= 31) {
                return true;
            }
            if (monthValue == 2) {
                if (dayValue <= 28) {
                    return true;
                } else if (dayValue == 29) {
                    if ((yearValue % 4 == 0
                            && yearValue % 100 != 0)
                            | yearValue % 400 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
        return true;
                }


    boolean monthDateValidation(String month) {
        this.month = month;
        if (month.length() > 2) {
            return false;
        }
        if (Integer.parseInt(month) > 12) {
            return false;
        }
        if (Integer.parseInt(month) < 1) {
            return false;
        }
        return true;
    }
*/
