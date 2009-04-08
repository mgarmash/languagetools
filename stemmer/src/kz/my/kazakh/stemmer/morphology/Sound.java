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
    protected List<String> list1;
    protected List<String> list2;
    // согласные
    protected List<String> list3;
    protected List<String> list4;
    // сонорные согласные
    protected List<String> list5;

    protected void init1() {
        list1 = new ArrayList<String>();
        // твердые гласные
        list1.add("а");
        list1.add("о");
        list1.add("ұ");
        list1.add("ы");
        list1.add("э");
        list1.add("у");    // если употребляется после согласных то он гласный
    }

    protected void init2() {
        list2 = new ArrayList<String>();
        // мягкие гласные
        list2.add("ә");
        list2.add("ө");
        list2.add("ү");
        list2.add("і");
        list2.add("е");
        list2.add("у");
    }

    protected void init3() {
        list3 = new ArrayList<String>();
        // глухие согласные
        list3.add("п");
        list3.add("ф");
        list3.add("к");
        list3.add("қ");
        list3.add("т");
        list3.add("с");
        list3.add("ш");
        list3.add("щ");
        list3.add("ц");
        list3.add("ч");
        list3.add("х");
        list3.add("х");
        list3.add("Һ");
    }

    protected void init4() {
        list4 = new ArrayList<String>();
        // звонкие согласные
        list4.add("б");
        list4.add("в");
        list4.add("г");
        list4.add("ғ");
        list4.add("д");
        list4.add("ж");
        list4.add("з");
    }

    protected void init5() {
        list5 = new ArrayList<String>();
        // сонорные согласные
        list5.add("р");
        list5.add("л");
        list5.add("м");
        list5.add("н");
        list5.add("ң");
        list5.add("й");
        //list5.add("у"); !!!
    }
}
