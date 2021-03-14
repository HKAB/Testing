package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HoroscopeTest {

    @Test
    void TestNormNorm() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(15, 6), Horoscope.Zodiac.GEMINI);
    }

    @Test
    void TestNormMin() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(15, 1), Horoscope.Zodiac.CAPRICORN);
    }

    @Test
    void TestNormMinPositive() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(15, 2), Horoscope.Zodiac.AQUARIUS);
    }

    @Test
    void TestNormMaxNegative() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(15, 11), Horoscope.Zodiac.SCORPIO);
    }

    @Test
    void TestNormMax() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(15, 12), Horoscope.Zodiac.SAGITTARIUS);
    }

    @Test
    void TestMinNorm() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(1, 6), Horoscope.Zodiac.GEMINI);
    }

    @Test
    void TestMinPositiveNorm() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(2, 6), Horoscope.Zodiac.GEMINI);
    }

    @Test
    void TestMaxNorm() {
        Horoscope h = new Horoscope();
        Assert.assertNull(h.getZodiac(31, 6));
    }

    @Test
    void TestMaxNegativeNorm() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(30, 6), Horoscope.Zodiac.CANCER);
    }

    @Test
    void TestRandomValidPart() {
        Horoscope h = new Horoscope();
        Assert.assertEquals(h.getZodiac(3, 8), Horoscope.Zodiac.LEO);
    }

    @Test
    void TestRandomInvalidPart() {
        Horoscope h = new Horoscope();
        Assert.assertNull(h.getZodiac(12334, -1919));
    }


}