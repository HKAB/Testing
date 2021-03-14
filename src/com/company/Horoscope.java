package com.company;

import org.junit.Test;

import java.util.*;

public class Horoscope {

    enum Zodiac {
        CAPRICORN,
        AQUARIUS,
        PISCES,
        ARIES,
        TAURUS,
        GEMINI,
        CANCER,
        LEO,
        VIRGO,
        LIBRA,
        SCORPIO,
        SAGITTARIUS
    }

    private Map<Zodiac, String> spiritColor;
    private Map<Zodiac, String> luckyGem;
    private Map<Zodiac, String> seasonalElement;
    private Map<Zodiac, String> shortDescription;
    private Map<Zodiac, String> asciiImage;

    public Horoscope() {
        spiritColor = new HashMap<Zodiac, String>();
        spiritColor.put(Zodiac.CAPRICORN, "Brown and grey");
        spiritColor.put(Zodiac.AQUARIUS, "Blue");
        spiritColor.put(Zodiac.PISCES, "Light green");
        spiritColor.put(Zodiac.ARIES, "Red");
        spiritColor.put(Zodiac.TAURUS, "Green");
        spiritColor.put(Zodiac.GEMINI, "Yellow");
        spiritColor.put(Zodiac.CANCER, "White and silver");
        spiritColor.put(Zodiac.LEO, "Gold");
        spiritColor.put(Zodiac.VIRGO, "Green and brown");
        spiritColor.put(Zodiac.LIBRA, "Pink and blue");
        spiritColor.put(Zodiac.SCORPIO, "Black");
        spiritColor.put(Zodiac.SAGITTARIUS, "Purple");

        luckyGem = new HashMap<Zodiac, String>();
        luckyGem.put(Zodiac.CAPRICORN, "Topaz");
        luckyGem.put(Zodiac.AQUARIUS, "Amethyst");
        luckyGem.put(Zodiac.PISCES, "Aquamarine");
        luckyGem.put(Zodiac.ARIES, "Diamond");
        luckyGem.put(Zodiac.TAURUS, "Emerald");
        luckyGem.put(Zodiac.GEMINI, "Agate");
        luckyGem.put(Zodiac.CANCER, "Pearl");
        luckyGem.put(Zodiac.LEO, "Ruby");
        luckyGem.put(Zodiac.VIRGO, "Sapphire");
        luckyGem.put(Zodiac.LIBRA, "Peridot");
        luckyGem.put(Zodiac.SCORPIO, "Garnet");
        luckyGem.put(Zodiac.SAGITTARIUS, "Turquoise");

        seasonalElement = new HashMap<Zodiac, String>();
        seasonalElement.put(Zodiac.CAPRICORN, "Earth");
        seasonalElement.put(Zodiac.AQUARIUS, "Air");
        seasonalElement.put(Zodiac.PISCES, "Water");
        seasonalElement.put(Zodiac.ARIES, "Fire");
        seasonalElement.put(Zodiac.TAURUS, "Earth");
        seasonalElement.put(Zodiac.GEMINI, "Air");
        seasonalElement.put(Zodiac.CANCER, "Water");
        seasonalElement.put(Zodiac.LEO, "Fire");
        seasonalElement.put(Zodiac.VIRGO, "Earth");
        seasonalElement.put(Zodiac.LIBRA, "Air");
        seasonalElement.put(Zodiac.SCORPIO, "Water");
        seasonalElement.put(Zodiac.SAGITTARIUS, "Fire");

        shortDescription = new HashMap<Zodiac, String>();
        shortDescription.put(Zodiac.CAPRICORN, "Detail-oriented, intelligent, hardworking");
        shortDescription.put(Zodiac.AQUARIUS, "Imaginative, idealistic, intuitive");
        shortDescription.put(Zodiac.PISCES, "Creative, sensitive, artistic");
        shortDescription.put(Zodiac.ARIES, "Ambitious, independent, impatient.");
        shortDescription.put(Zodiac.TAURUS, "Dependable, musical, practical");
        shortDescription.put(Zodiac.GEMINI, "Curious, affectionate, kind");
        shortDescription.put(Zodiac.CANCER, "Intuitive, emotional, intelligent, passionate");
        shortDescription.put(Zodiac.LEO, "Proud, bold, ambitious");
        shortDescription.put(Zodiac.VIRGO, "Graceful, organized, kind");
        shortDescription.put(Zodiac.LIBRA, "Diplomatic, artistic, intelligent");
        shortDescription.put(Zodiac.SCORPIO, "Seductive, passionate, independent");
        shortDescription.put(Zodiac.SAGITTARIUS, "Adventurous, creative, strong willed");

        asciiImage = new HashMap<Zodiac, String>();
        asciiImage.put(Zodiac.CAPRICORN, "            _\n" +
                "    \\      /_)    Capricorn-  The Goat\n" +
                "     \\    /`.\n" +
                "      \\  /   ;\n" +
                "       \\/ __.'\n");
        asciiImage.put(Zodiac.AQUARIUS, " .-\"-._.-\"-._.-   Aquarius-  The Water Bearer\n" +
                " .-\"-._.-\"-._.-\n");
        asciiImage.put(Zodiac.PISCES, "     `-.    .-'   Pisces-  The Fishes\n" +
                "        :  :\n" +
                "      --:--:--\n" +
                "        :  :\n" +
                "     .-'    `-.");
        asciiImage.put(Zodiac.ARIES, "   .-.   .-.\n" +
                "  (_  \\ /  _)    Aries-  The Ram\n" +
                "       |\n" +
                "       |\n");
        asciiImage.put(Zodiac.TAURUS, "    .     .\n" +
                "    '.___.'      Taurus-  The Bull\n" +
                "    .'   `.\n" +
                "   :       :\n" +
                "   :       :\n" +
                "    `.___.'");
        asciiImage.put(Zodiac.GEMINI, "    ._____.\n" +
                "      | |        Gemini-  The Twins\n" +
                "      | |\n" +
                "     _|_|_\n" +
                "    '     '");
        asciiImage.put(Zodiac.CANCER, "      .--.\n" +
                "     /   _`.     Cancer-  The Crab\n" +
                "    (_) ( )\n" +
                "   '.    /\n" +
                "     `--'");
        asciiImage.put(Zodiac.LEO, "      .--.\n" +
                "     (    )       Leo-  The Lion\n" +
                "    (_)  /\n" +
                "        (_,");
        asciiImage.put(Zodiac.VIRGO, "   _\n" +
                "  ' `:--.--.\n" +
                "     |  |  |_     Virgo-  The Virgin\n" +
                "     |  |  | )\n" +
                "     |  |  |/\n" +
                "          (J");
        asciiImage.put(Zodiac.LIBRA, "        __\n" +
                "   ___.'  '.___   Libra-  The Balance\n" +
                "   ____________\n");
        asciiImage.put(Zodiac.SCORPIO, "   _\n" +
                "  ' `:--.--.\n" +
                "     |  |  |      Scorpius-  The Scorpion\n" +
                "     |  |  |\n" +
                "     |  |  |  ..,\n" +
                "           `---':");
        asciiImage.put(Zodiac.SAGITTARIUS, "          ...\n" +
                "          .':     Sagittarius-  The Archer\n" +
                "        .'\n" +
                "    `..'\n" +
                "    .'`.");

    }

    public Zodiac getZodiac( Integer day, Integer month) {

        if ((month == 12 && day >= 22 && day <= 31) || (month ==  1 && day >= 1 && day <= 19))
            return Zodiac.CAPRICORN;
        else if ((month ==  1 && day >= 20 && day <= 31) || (month ==  2 && day >= 1 && day <= 17))
            return Zodiac.AQUARIUS;
        else if ((month ==  2 && day >= 18 && day <= 29) || (month ==  3 && day >= 1 && day <= 19))
            return Zodiac.PISCES;
        else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            return Zodiac.ARIES;
        else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            return Zodiac.TAURUS;
        else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
            return Zodiac.GEMINI;
        else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            return Zodiac.CANCER;
        else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            return Zodiac.LEO;
        else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            return Zodiac.VIRGO;
        else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            return Zodiac.LIBRA;
        else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            return Zodiac.SCORPIO;
        else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
            return Zodiac.SAGITTARIUS;
        return null;
    }

    public String getSpiritColor(Zodiac zodiac) {
        return this.spiritColor.get(zodiac);

    }

    public String getLuckyGem(Zodiac zodiac) {
        return this.luckyGem.get(zodiac);
    }

    public String getSeasonalElement(Zodiac zodiac) {
        return this.seasonalElement.get(zodiac);
    }

    public String getShortDescription(Zodiac zodiac) {
        return this.shortDescription.get(zodiac);
    }

    public String getAsciiImage(Zodiac zodiac) { return this.asciiImage.get(zodiac); }

}
