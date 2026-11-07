/*
 * Created @Uwe Koehler , 11.07.2006
 */
package model;

import java.util.Observable;

/**
 * Represents all data which could be changed by the user
 */
public class OldModel extends Observable {

    public static final int DEFAULT = 0;
    public static final int MANDELBROT = 1;
    public static final int JULIA_MENGE = 2;
    public static final int ZOOMRECT = 3;
    
    private double c_imag_max;
    private double c_imag_min;
    private double c_real_max;
    private double c_real_min;
    private double p_imag;
    private double p_real;
    private double clickedReal;
    private double clickedImag;
    private int max_iter;
    private int paintMode;
    private boolean triggerRepaint;
    
    public OldModel(){}
    

    public void updateObservers(){
        setChanged();
        notifyObservers();
    }
    // Methods who register the changes
    public void setC_imag_max(double c_imag_max) {
        this.c_imag_max = c_imag_max;
    }
    public double getC_imag_max() {
        return c_imag_max;
    }
    public void setC_imag_min(double c_imag_min) {
        this.c_imag_min = c_imag_min;
    }
    public double getC_imag_min() {
        return c_imag_min;
    }
    public void setC_real_max(double c_real_max) {
        this.c_real_max = c_real_max;
    }
    public double getC_real_max() {
        return c_real_max;
    }
    public void setC_real_min(double c_real_min) {
        this.c_real_min = c_real_min;
    }
    public double getC_real_min() {
        return c_real_min;
    }
    public void setP_imag(double p_imag) {
        this.p_imag = p_imag;
    }
    public double getP_imag() {
        return p_imag;
    }
    public void setP_real(double p_real) {
        this.p_real = p_real;
    }
    public double getP_real() {
        return p_real;
    }

    public void setPaintMode(int paintMode) {
        this.paintMode = paintMode;
    }
    public int getPaintMode() {
        return paintMode;
    }
    public void setTriggerRepaint(boolean triggerRepaint) {
        this.triggerRepaint = triggerRepaint;
    }
    public boolean isTriggerRepaint() {
        return triggerRepaint;
    }
    public void setMax_iter(int max_iter) {
        this.max_iter = max_iter;
    }
    public int getMax_iter() {
        return max_iter;
    }
    public void setClickedReal(double clickedReal) {
        this.clickedReal = clickedReal;
    }
    public double getClickedReal() {
        return clickedReal;
    }
    public void setClickedImag(double clickedImag) {
        this.clickedImag = clickedImag;
    }
    public double getClickedImag() {
        return clickedImag;
    }
}
