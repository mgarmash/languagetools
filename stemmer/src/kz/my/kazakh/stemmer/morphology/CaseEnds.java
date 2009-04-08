package kz.my.kazakh.stemmer.morphology;

import java.util.List;

/**
 * Окончания падежей.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 12:04:36
 */
public class CaseEnds {
    /* список окончаний */
    List<String> list;
    /* список исключений */
    List<String> exept;

    protected void init() {
        // Атау септiк - именительный падеж     окончания отсутствуют

        // iлiк септiк - притяжательный падеж
        list.add("ның"); list.add("нің");
        list.add("дың"); list.add("дің");
        list.add("тың"); list.add("тің");

        // Барыс септiк - направительно-дательный падеж
        list.add("ға"); list.add("ғе");
        list.add("қа"); list.add("ке");

        // Табыс септiк - винительный падеж
        list.add("ны"); list.add("ні");
        list.add("ды"); list.add("ді");
        list.add("ты"); list.add("ті");

        // Жатыс септiк - местный падеж
        list.add("да"); list.add("де");
        list.add("та"); list.add("те");

        // Шығыс септiк - исходный падеж
        list.add("нан"); list.add("нен");
        list.add("дан"); list.add("ден");
        list.add("тан"); list.add("тен");

        // Көмектес септiк - творительный падеж
        list.add("мен"); list.add("менен");
        list.add("бен"); list.add("бенен");
        list.add("пен"); list.add("пенен");        
    }
}
