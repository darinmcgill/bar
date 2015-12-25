package com.x5e.bar;

import javax.inject.Provider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Beer {
    public Beer(int i) {
        this.i = i;
    }
    public int i;
    public String toString() {
        return "[" + (new Integer(i)).toString() + "]";
    }
}

public class Pub implements Provider<Beer>{
    private static final Logger logger = LoggerFactory.getLogger(Pub.class);
    public Beer get() { return new Beer(3); }

    public static void main(String ... args) throws Exception {
        System.out.println("hello universe");
        logger.info("log me please");
        Pub p = new Pub();
        logger.debug("beer: {}",p.get());
    }
}
