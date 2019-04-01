package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
class ExecuteWhenFalse implements TestObject{

    @Override
    public TestObject then(Runnable toPrint) {
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
    public TestObject thenReturn(Supplier<Integer> number) {
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
