package fluentconditionals;

import java.util.function.Supplier;

/**
 * @author Ola Podorska
 */
public class FluentConditionals {


    public static final Runnable doNothing = () -> {};

    public static Execute when(boolean condition){
        if (condition){
        return new ExecuteWhenTrue();
        } else{
            return new ExecuteWhenFalse();
        }
    }

    public static Execute when(Supplier<Boolean> supplier){
        boolean condition = supplier.get();

        if (condition){
            return new ExecuteWhenTrue();
        } else{
            return new ExecuteWhenFalse();
        }
    }
}
