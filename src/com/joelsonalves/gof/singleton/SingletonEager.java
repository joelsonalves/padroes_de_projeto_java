package com.joelsonalves.gof.singleton;

/**
 * Singleton "Eager"
 *
 * @author joelsonalves
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {

        super();

    }

    public static SingletonEager getInstance() {

        return instance;

    }

}
