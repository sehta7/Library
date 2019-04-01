package com.name.app;

import static fluentconditionals.FluentConditionals.*;
//Task 2
public class IfExecuteElseThrow {

    public static void main(String[] args) {

        when(TestHelper::somethingIsTrue)
                .then(TestHelper::printBar)
                .orElseThrow(new RuntimeException());
        //'Bar' printed to console

        when(TestHelper::somethingIsTrue)
                .then(TestHelper::printBar)
                .orElseThrow(RuntimeException::new);
        //'Bar' printed to console

        when(TestHelper::somethingIsTrue)
                .then(TestHelper::printBar)
                .orElseThrow(TestHelper::createException);
        //'Bar' printed to console

        when(!TestHelper.somethingIsTrue())
                .then(TestHelper::printFoo)
                .orElseThrow(TestHelper::createException);
        //exception thrown
    }
}
