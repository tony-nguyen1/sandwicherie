package main.java.inter;

import java.util.*;

import main.java.customException.OutOfRangeKilocariesException;

/**
 * 
 */
public interface IAliment {

    /**
     * 
     */
    public static float tauxConvertion = 4.1868f;

    /**
     * @param float f 
     * @return
     */
    public abstract void setKilocalories(float f) throws OutOfRangeKilocariesException;
    
    public abstract float getKilocalories();

}