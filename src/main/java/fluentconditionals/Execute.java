package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
public interface Execute {

    Execute then(Runnable toPrint);
    void orElse(Runnable toPrint);

    void orElseThrow(RuntimeException e);
    void orElseThrow(Supplier<RuntimeException> e);

    Execute thenReturn(Supplier<Integer> number);
    Integer orElse(Supplier<Integer> number);

    <T> Execute thenReturn(T number);
    <T> T orElse(T sth);

    Integer orElse(int i);

    int orElseThrowE(RuntimeException e);
    int orElseThrowE(Supplier<RuntimeException> e);
}
