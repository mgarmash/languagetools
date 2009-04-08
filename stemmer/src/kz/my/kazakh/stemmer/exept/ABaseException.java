package kz.my.kazakh.stemmer.exept;

/**
 * Базовая ошибка.
 * Created by IntelliJ IDEA.
 * User: danik
 * Date: 08.04.2009
 * Time: 16:45:42
 */
public abstract class ABaseException extends Exception{

    protected ABaseException(String word) {
        super(word);
    }
}
