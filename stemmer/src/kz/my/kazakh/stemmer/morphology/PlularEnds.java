package kz.my.kazakh.stemmer.morphology;

import java.util.ArrayList;
import java.util.List;

/**
 * Окончания множественного числа.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 12:00:51
 */
public class PlularEnds {
    protected List<String> list;

    protected void initPluralEnds() {
        list = new ArrayList<String>();
        //
        list.add("лар"); list.add("лер");
        list.add("дар"); list.add("дер");
        list.add("тар"); list.add("тер");
    }
}
