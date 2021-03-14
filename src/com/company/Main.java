package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Horoscope horoscope = new Horoscope();

        Scanner sc = new Scanner(System.in);
        System.out.print("Day: ");
        Integer day = sc.nextInt();
        System.out.print("Month: ");
        Integer month = sc.nextInt();

	    Horoscope.Zodiac zodiac = horoscope.getZodiac(day, month);

	    if (!(zodiac == null)) {
            System.out.println();
            System.out.println(horoscope.getAsciiImage(zodiac));
            System.out.println();
            System.out.println(horoscope.getShortDescription(zodiac));
            System.out.println("Lucky gem: " + horoscope.getLuckyGem(zodiac));
            System.out.println("Element: " + horoscope.getSeasonalElement(zodiac));
            System.out.println("Spirit color: " + horoscope.getSpiritColor(zodiac));
        }
        else {
            System.out.println("Invalid input!!");
        }

    }
}