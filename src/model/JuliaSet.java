/*
 * Created @Uwe Koehler , 17.07.2006
 */
package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class JuliaSet extends AbstractJM {

    public JuliaSet(int imageWidth, int imageHeight, double c_real_min, double c_real_max, double c_imag_min, double c_imag_max, double p_real, double p_imag, int max_iter, boolean coordSystemVisible) {
        super(imageWidth, imageHeight, c_real_min, c_real_max, c_imag_min, c_imag_max,
                p_real, p_imag, max_iter, coordSystemVisible);
    }

    @Override
    public void createImage() {
        double c_real, c_imag, nextReal, nextImag, tmp, colHelp, complex_step_real,complex_step_imag;
        int iter, red, green = 0, blue;
        
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
                nextReal = c_real*c_real - c_imag*c_imag + p_real;      
                nextImag = 2*c_real*c_imag + p_imag;
                for (iter = 0; (nextReal*nextReal + nextImag*nextImag < 4) && (iter < max_iter); iter++){
                    tmp = nextReal;
                    nextReal = nextReal*nextReal - nextImag*nextImag + p_real;      
                    nextImag = 2*tmp*nextImag + p_imag;
                }
                colHelp = 255d/(double)max_iter*iter;
                red = (int)colHelp;
                if (colHelp < 32)
                    green = (int)(8*colHelp);
                else if (colHelp < 64)
                    green = (int)(4*colHelp);
                else if (colHelp < 128)
                    green = (int)(2*colHelp);
                else if (colHelp < 256)
                    green = (int)colHelp;
                blue = (int)(255d-colHelp);                

                g.setColor(new Color(red,green,blue));
                g.drawLine(x, y, x, y);                
            }
        }
    }
}
