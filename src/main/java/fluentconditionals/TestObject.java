package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
public interface TestObject {

    TestObject then(Runnable toPrint);
    void orElse(Runnable toPrint);

    void orElseThrow(RuntimeException e);
    void orElseThrow(Supplier<RuntimeException> e);

    TestObject thenReturn(Supplier<Integer> number);
    Integer orElse(Supplier<Integer> number);

    Integer orElse(int i);

    int orElseThrowE(RuntimeException e);
    int orElseThrowE(Supplier<RuntimeException> e);
}
