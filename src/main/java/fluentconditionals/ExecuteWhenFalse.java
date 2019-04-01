package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
class ExecuteWhenFalse implements Execute {

    @Override
    public Execute then(Runnable toPrint) {
        return this;
    }

    @Override
    public void orElse(Runnable toPrint) {
        toPrint.run();
    }

    @Override
    public void orElseThrow(RuntimeException exception) {
        throw exception;
    }

    public void orElseThrow(Supplier<RuntimeException> exceptionSupplier) {
        orElseThrow(exceptionSupplier.get());
    }

    @Override
    public Execute thenReturn(Supplier<Integer> number) {
        return this;
    }

    @Override
    public Integer orElse(Supplier<Integer> number) {
        return number.get();
    }

    @Override
    public Integer orElse(int i) {
        return 0;
    }

    @Override
    public int orElseThrowE(RuntimeException exception) {
        throw exception;
    }

    @Override
    public int orElseThrowE(Supplier<RuntimeException> e) {
        throw e.get();
    }
}
