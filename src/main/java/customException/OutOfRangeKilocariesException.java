package main.java.customException;

import java.util.*;

/**
 * 
 */
public class OutOfRangeKilocariesException extends Exception{

    /**
     * Default constructor
     */
    public OutOfRangeKilocariesException(float f) {
    	super(String.format("La valeur ({0}) passée en argument doit être comprise entre 0 inclus et 1000 inclus.", f));
    }

}