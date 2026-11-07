/*
 * Created @Uwe Koehler , 17.07.2006
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import com.sun.image.codec.jpeg.ImageFormatException;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

//import factory.ImageFactory;

/**
 * Super Class for Mandelbrot and JuliaSet
 */
public abstract class AbstractJM {
    
    static int counter=0;
    BufferedImage bufferedImage;
    
    protected int imageWidth;
    protected int imageHeight;
    protected double c_imag_max;
    protected double c_imag_min;
    protected double c_real_max;
    protected double c_real_min;
    protected double p_imag;
    protected double p_real;
    protected int max_iter;
    protected boolean coordSystemVisible;
    
    public AbstractJM(            
        int imageWidth, 
        int imageHeight,
        double c_real_min,
        double c_real_max,
        double c_imag_min,
        double c_imag_max,
        double p_real,
        double p_imag,
        int max_iter,
        boolean coordSystemVisible){

        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.c_imag_max = c_imag_max;
        this.c_imag_min = c_imag_min;
        this.c_real_max = c_real_max;
        this.c_real_min = c_real_min;
        this.p_imag = p_imag;
        this.p_real = p_real;
        this.max_iter = max_iter;
        this.coordSystemVisible = coordSystemVisible;        
    }
    
    public abstract void createImage();
    
    public BufferedImage getImage(){
        return bufferedImage;
    }
           
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

    public void setMax_iter(int max_iter) {
        this.max_iter = max_iter;
    }

    public int getMax_iter() {
        return max_iter;
    }

    public void setCoordSystemVisible(boolean coordSystemVisible) {
        this.coordSystemVisible = coordSystemVisible;
    }

    public boolean isCoordSystemVisible() {
        return coordSystemVisible;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageHeight() {
        return imageHeight;
    }

}
