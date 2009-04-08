package kz.my.kazakh.stemmer.morphology;

import java.util.ArrayList;
import java.util.List;

/**
 * Притяжательные кончания.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 12:02:25
 */
public class BelongEnds {
    List<String> belongEnd = new ArrayList<String>();

    protected void initBelognEnds() {
        // после глухих звуков
        belongEnd.add("м"); //
        belongEnd.add("ң");
        belongEnd.add("ңыз");
        belongEnd.add("ңіз");
        belongEnd.add("сы");
        belongEnd.add("сі");

        // после согласных звуков
        belongEnd.add("ым");
        belongEnd.add("ім");
        belongEnd.add("ың");
        belongEnd.add("ің");
        belongEnd.add("ыңыз");
        belongEnd.add("іңіз");
        belongEnd.add("ы");
        belongEnd.add("і");

        // множест. число после гласных
        belongEnd.add("мыз"); belongEnd.add("міз");
        belongEnd.add("ың"); belongEnd.add("ің");
        belongEnd.add("ыңыз"); belongEnd.add("іңіз");
        belongEnd.add("ы"); belongEnd.add("і");

        // множест. число после согласных
        belongEnd.add("ымыз"); belongEnd.add("іміз");
    }
}
