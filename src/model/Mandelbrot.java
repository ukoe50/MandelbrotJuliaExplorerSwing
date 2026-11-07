/*
 * Created @Uwe Koehler , 17.07.2006
 */
package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Mandelbrot extends AbstractJM {

    public Mandelbrot(int imageWidth, int imageHeight, double c_real_min, double c_real_max, double c_imag_min, double c_imag_max, double p_real, double p_imag, int max_iterations, boolean coordSystemVisible) {
        super(imageWidth, imageHeight, c_real_min, c_real_max, c_imag_min, c_imag_max,
                p_real, p_imag, max_iterations, coordSystemVisible);
    }

    @Override
    public void createImage() {
        double c_real, c_imag, nextReal, nextImag, tmp, colHelp, complex_step_real,complex_step_imag;
        int iter, red = 0, green = 0, blue = 0;
        bufferedImage = new BufferedImage(imageWidth,imageHeight,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = bufferedImage.createGraphics();
        complex_step_real = Math.abs(c_real_min-c_real_max)/(double)imageWidth;
        complex_step_imag = Math.abs(c_imag_min-c_imag_max)/(double)imageHeight;
        
        // pixel in x-direction
        for (int x = 0; x < imageWidth; x++) {
            c_real = c_real_min + complex_step_real*(double)x; 
            // pixel in y-direction
            for (int y = 0; y < imageHeight; y++) {
                c_imag = c_imag_max - complex_step_imag*(double)y;
                iter = 0;
                nextReal = c_real;      
                nextImag = c_imag;
                for (iter = 0; (nextReal*nextReal + nextImag*nextImag < 4) && (iter < max_iter); iter++){
                    tmp = nextReal;
                    nextReal = nextReal*nextReal - nextImag*nextImag + c_real;      
                    nextImag = 2*tmp*nextImag + c_imag;
                }
                /*
                colHelp = 255d/(double)max_iter*iter;
                green = (int)colHelp;
                if (colHelp < 32)
                    red = (int)(8*colHelp);
                else if (colHelp < 64)
                    red = (int)(4*colHelp);
                else if (colHelp < 128)
                    red = (int)(2*colHelp);
                else if (colHelp < 256)
                    red = (int)colHelp;
                blue = (int)(colHelp);
                */         
                colHelp = 255d/(double)max_iter*iter;
                
                //green = (int)colHelp;
                
                // Parabel
                double itquad_max = max_iter*max_iter;
                double div = itquad_max/(iter*iter);
                red = (int)(255/div);
                //green = 0;
                blue = (int)(255-255/div);
                
                
                if (colHelp < 32)
                    green = (int)(8*colHelp);
                else if (colHelp < 64)
                    green = (int)(4*colHelp);
                else if (colHelp < 128)
                    green = (int)(2*colHelp);
                else if (colHelp < 256)
                    green = (int)colHelp;
                

                g.setColor(new Color(red,green,blue));
                g.drawLine(x, y, x, y);
            }
        }
       
    }


    
    

}
