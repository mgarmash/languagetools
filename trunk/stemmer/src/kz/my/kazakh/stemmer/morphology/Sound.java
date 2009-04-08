package kz.my.kazakh.stemmer.morphology;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 12:16:33
 */
public class Sound {
    // гласные
    protected List<String> hardVowels;
    protected List<String> softVowels;
    // согласные        consonant
    protected List<String> deafConsonants;
    protected List<String> voicedСonsonants;
    // сонорные согласные
    protected List<String> resonantConsonants;

    protected void init1() {
        hardVowels = new ArrayList<String>();
        // твердые гласные
        hardVowels.add("а");
        hardVowels.add("о");
        hardVowels.add("ұ");
        hardVowels.add("ы");
        hardVowels.add("э");
        hardVowels.add("у");    // если употребляется после согласных то он гласный
    }

    protected void init2() {
        softVowels = new ArrayList<String>();
        // мягкие гласные
        softVowels.add("ә");
        softVowels.add("ө");
        softVowels.add("ү");
        softVowels.add("і");
        softVowels.add("е");
        softVowels.add("у");
    }

    protected void init3() {
        deafConsonants = new ArrayList<String>();
        // глухие согласные
        deafConsonants.add("п");
        deafConsonants.add("ф");
        deafConsonants.add("к");
        deafConsonants.add("қ");
        deafConsonants.add("т");
        deafConsonants.add("с");
        deafConsonants.add("ш");
        deafConsonants.add("щ");
        deafConsonants.add("ц");
        deafConsonants.add("ч");
        deafConsonants.add("х");
        deafConsonants.add("х");
        deafConsonants.add("Һ");
    }

    protected void init4() {
        voicedСonsonants = new ArrayList<String>();
        // звонкие согласные
        voicedСonsonants.add("б");
        voicedСonsonants.add("в");
        voicedСonsonants.add("г");
        voicedСonsonants.add("ғ");
        voicedСonsonants.add("д");
        voicedСonsonants.add("ж");
        voicedСonsonants.add("з");
    }

    protected void init5() {
        resonantConsonants = new ArrayList<String>();
        // сонорные согласные
        resonantConsonants.add("р");
        resonantConsonants.add("л");
        resonantConsonants.add("м");
        resonantConsonants.add("н");
        resonantConsonants.add("ң");
        resonantConsonants.add("й");
        //resonantConsonants.add("у"); !!!
    }
}
