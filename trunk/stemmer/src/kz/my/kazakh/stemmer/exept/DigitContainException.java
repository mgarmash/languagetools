package kz.my.kazakh.stemmer.exept;

/**
 * Ошибка если слово содержит цифры.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 16:48:19
 */
public class DigitContainException extends ABaseException{

    public DigitContainException(String word) {
        super("Слово содержит цифру {" + word + "}");
    }
}
