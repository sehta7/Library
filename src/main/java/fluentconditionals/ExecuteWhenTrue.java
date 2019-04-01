package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
class ExecuteWhenTrue implements Execute {

    private Supplier<Integer> number;

    public Execute then(Runnable toPrint){
        toPrint.run();
        return this;
    }
    @Override
    public void orElse(Runnable toPrint) {
        //do nothing
    }

    @Override
    public void orElseThrow(RuntimeException exception) {
        throw exception;
    }

    @Override
    public void orElseThrow(Supplier<RuntimeException> e) {
        orElseThrow(e.get());
    }

    @Override
    public Execute thenReturn(Supplier<Integer> number) {
        this.number = number;
        return this;
    }

    @Override
    public Integer orElse(Supplier<Integer> number) {
        return this.number.get();
    }

    @Override
    public Integer orElse(int i) {
        return 0;
    }

    @Override
    public int orElseThrowE(RuntimeException exception) {
        return this.number.get();
    }

    @Override
    public int orElseThrowE(Supplier<RuntimeException> e) {
        return 0;
    }
}
