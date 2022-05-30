package com.joelsonalves.gof.singleton;

/**
 * Singleton "Lazy"
 *
 * @author joelsonalves
 */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {

        super();

    }

    public static SingletonLazy getInstance() {

        if (instance == null) {

            instance = new SingletonLazy();

        }

        return instance;

    }

}
