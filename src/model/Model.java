/*
 * Created @Uwe Koehler , 11.07.2006
 */
package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Observable;
import javax.imageio.ImageIO;

//import com.sun.image.codec.jpeg.ImageFormatException;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;

/**
 * Represents all data which could be changed by the user
 */
public class Model extends Observable {

    public static final int DEFAULT = 0;
    public static final int MANDELBROT = 1;
    public static final int JULIA_MENGE = 2;
    public static final int ZOOMRECT = 3;
    
    private Mandelbrot mandelbrot;
    private JuliaSet juliaSet;
    private AbstractJM activeObject;
    
    private double clickedReal;
    private double clickedImag;
    private String filepath;
    private int writeImageWidth;
    private int writeImageHeight;
    
    private int paintMode;
    private boolean triggerRepaint;
    
    
    public Model(){}
    

    public void updateObservers(){
        setChanged();
        notifyObservers();
        
    }
    
    
    // Methods who register the changes
 

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


    public void setActiveObject(AbstractJM activeObject) {
        this.activeObject = activeObject;
    }


    public AbstractJM getActiveObject() {
        return activeObject;
    }


    public void setMandelbrot(Mandelbrot mandelbrot) {
        this.mandelbrot = mandelbrot;
    }


    public Mandelbrot getMandelbrot() {
        return mandelbrot;
    }


    public void setJuliaSet(JuliaSet juliaSet) {
        this.juliaSet = juliaSet;
    }


    public JuliaSet getJuliaSet() {
        return juliaSet;
    }


    public void writeImage() {
        FileOutputStream out = null;
        BufferedImage buffImage = null;
        
        try {
            out = new FileOutputStream(new File(getFilepath()));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        int oldWidth = activeObject.getImageWidth();
        int oldHeight = activeObject.getImageHeight();
        
        activeObject.setImageWidth(getWriteImageWidth());
        activeObject.setImageHeight(getWriteImageHeight());
        activeObject.createImage();
        buffImage = activeObject.getImage();
        activeObject.setImageWidth(oldWidth);
        activeObject.setImageHeight(oldHeight);
        activeObject.createImage();
        
        
		//        JPEGImageEncoder enc = JPEGCodec.createJPEGEncoder(out);
		//        JPEGEncodeParam  prm = enc.getDefaultJPEGEncodeParam(buffImage);
		//        prm.setQuality(1.0f, false);
		//        enc.setJPEGEncodeParam(prm);
        try {
            //enc.encode(buffImage);
            
            ImageIO.write(buffImage, "jpeg", out);
        //} catch (ImageFormatException e) {
        //    e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Image written");
       
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }


    public String getFilepath() {
        return filepath;
    }


    public void setWriteImageWidth(int writeImageWidth) {
        this.writeImageWidth = writeImageWidth;
    }


    public int getWriteImageWidth() {
        return writeImageWidth;
    }


    public void setWriteImageHeight(int writeImageHeight) {
        this.writeImageHeight = writeImageHeight;
    }


    public int getWriteImageHeight() {
        return writeImageHeight;
    }
}
