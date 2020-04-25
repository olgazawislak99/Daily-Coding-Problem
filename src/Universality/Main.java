package Universality;

import java.io.*;

class Main {

    private static String[] getDates() throws java.lang.Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(bufferedReader.readLine());
        String[] dates = new String[testCases];

        for (int i=0; i<testCases;i++){
            String input = bufferedReader.readLine();
            dates[i] = input;

        }
        return dates;
    }


    private static String getDayOfTheWeek(String date){
        //Zeller's congruence
        String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        String[] s =date.split(" ");
        int year = Integer.parseInt(s[2]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[0]);

        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = day + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h % 7;

        return  weekdays[h];
    }

    public static void main(String[] args) throws java.lang.Exception {
        String [] dates = getDates();
        for (String date: dates) {
            String day = getDayOfTheWeek(date);
            System.out.println(day);
        }

    }
}
