package kz.test.kazakh.stremmer;

import junit.framework.TestCase;
import kz.my.kazakh.stemmer.Stemmer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * Тестирование стеммера казахского языка.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 11:03:28
 */
public class TestStremmer extends TestCase {
    protected Properties in = new Properties();
    protected Properties out = new Properties();

    public void test1() throws Exception {
        FileInputStream fis = new FileInputStream("sample.xml");
        in.loadFromXML(fis);

        for (Object str : in.keySet()) {
            String key = (String) str;
            String value = (String) in.get(key);

            Stemmer stemmer = Stemmer.getInstance();
            String st = stemmer.stemming(key);

            if(!value.equals(st)) out.setProperty(key, st);
        }

        if(!out.isEmpty()) {
            FileOutputStream outStream = new FileOutputStream ("Errors.xml");
            out.storeToXML(outStream, "Errors");
        }
    }

    public void test2() throws Exception {
        String test = "ІеҒрҮҰҚЗЛГрпЬДжӨӨҺ";

        assertEquals("іеғрүұқзлгрпьджөөһ", test.toLowerCase());
    }

    public void test3() throws Exception {
        String str = "dsaaіңұүұғққұҮ.үsd34134/*-";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                System.out.println("char is digit "+ch);
            }

            if (!Character.isLetter(ch)) {
                System.out.println("char is not letter {" + ch + "}");
            }
        }
    }
}
