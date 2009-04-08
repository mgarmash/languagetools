package kz.my.kazakh.stemmer.morphology;

import java.util.ArrayList;
import java.util.List;

/**
 * Имя Существительное.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 16:06:17
 */
public class Noun {
    protected List<String> ends;

    protected void init() {
        ends = new ArrayList<String>();
        //
        ends.add("шы"); ends.add("ші");
        ends.add("лас"); ends.add("лес");
        ends.add("дас"); ends.add("дес");
        ends.add("тас"); ends.add("тес");
        //
        ends.add("лық"); ends.add("лік");
        ends.add("дық"); ends.add("дік");
        ends.add("тық"); ends.add("тік");
        //
        ends.add("кер"); ends.add("гер");

        // существетельные от глаголов
        ends.add("ма"); ends.add("ме");
        ends.add("па"); ends.add("пе");
        ends.add("ба"); ends.add("бе");

        ends.add("ым"); ends.add("ім");
        ends.add("м");

        ends.add("қыш");ends.add("кіш");
        ends.add("ғыш");ends.add("гіш");

    }
}
