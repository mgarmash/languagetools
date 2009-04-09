package kz.my.kazakh.stemmer;

import kz.my.kazakh.stemmer.exept.ABaseException;
import kz.my.kazakh.stemmer.exept.DigitContainException;
import kz.my.kazakh.stemmer.exept.SpecCharacterContainException;

/**
 * Стеммер казахского языка <br>
 * Created by IntelliJ IDEA.
 * User: user
 * Date: 08.04.2009
 * Time: 10:40:46
 */
public class Stemmer {
    protected static Stemmer instance = new Stemmer();


    protected Stemmer() {
        // иниты
    }

    public static Stemmer getInstance() {
        return instance;
    }

    public String stemming(String str) throws ABaseException {
        // проверяем слово.
        checkWord(removeComplexWord(str));
        //
        
        return str;
    }

    protected void checkWord(String word) throws ABaseException{

        for (char ch : word.toCharArray()) {
            if(Character.isDigit(ch)) throw new DigitContainException(word);
            if (Character.isLetter(ch)) throw new SpecCharacterContainException(word);
        }
    }

    protected String removeComplexWord(String word) {
        return word.indexOf("-") > 0 ? word.substring(word.indexOf("-") + 1) : word;
    }
}
