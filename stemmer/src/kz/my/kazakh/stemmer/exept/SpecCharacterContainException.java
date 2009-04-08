package kz.my.kazakh.stemmer.exept;

/**
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 17:08:12
 */
public class SpecCharacterContainException extends ABaseException{

    public SpecCharacterContainException(String word) {
        super("Слово содержит спец символы {" + word + "}");
    }
}
