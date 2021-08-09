package com.zi.javafundamental.accessmodifier.package2;

import com.zi.javafundamental.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {

    @Override
    protected void methodC() {
        super.methodC();

        System.out.println("Example for calling protected other package");
    }

}
