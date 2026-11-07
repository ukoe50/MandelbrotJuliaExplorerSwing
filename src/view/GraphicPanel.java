/*
 * Created @Uwe Koehler , 11.07.2006
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;
import model.Model;


class GraphicPanel extends JPanel implements Observer{
    
    Model model;

    int mouseX, mouseY;
    int MouseButton = 0;
    int xStart, yStart, xEnd, yEnd, lastXEnd, lastYEnd;
    
    
    public void update(Observable arg0, Object arg1) {
        if (model.isTriggerRepaint()){
            if (model.getActiveObject() != null)
                model.getActiveObject().createImage();
            repaint();
            
        }
    }   
    public GraphicPanel(Model model){
        this.model = model;
        setPreferredSize(new Dimension(5000,5000));
        setDoubleBuffered(true); 
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.LOWERED));
        init();
    }
    public GraphicPanel(Model model, int x, int y, int w, int h){
        this.model = model;
        setLayout(null);
        setBounds(x,y,w,h);
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.LOWERED));
        init();
    }
    public void init(){
        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
 
    }       
    public void setDefaults(){
        xStart=0;
        yStart=0;
        xEnd=0;
        yEnd=0;
        lastXEnd=0;
        lastYEnd=0;
    }
    
    public void paint(Graphics g){
        if (model.getActiveObject() != null)
            g.drawImage(model.getActiveObject().getImage(),0,0,this);
        model.setTriggerRepaint(false);
    }
    

    
    private void paintZoomInRect(Graphics g){
        
    }

    /**
     * innere Klasse MyMouseMotionListener
     */
    class MyMouseMotionListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent event) {
            if (MouseButton == 1){
                lastXEnd = xEnd;
                lastYEnd = yEnd;
                xEnd = event.getX();
                yEnd = event.getY();
            }
            
            if (MouseButton == 3){
            }
        }
        public void mouseMoved(MouseEvent event) {
        }
    }
    /**
     * innere Klasse MyMouseListener
     */
    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent event) {
            if (event.getButton() == MouseEvent.BUTTON1){
                MouseButton = 1;
                xStart = event.getX();
                yStart = event.getY();
                //System.out.println("xStart" + xStart);
                //System.out.println("yStart" + yStart);
            }
            if (event.getButton() == MouseEvent.BUTTON3){
                MouseButton = 3;
                mouseX = event.getX();
                mouseY = event.getY();    
            }
        }
        
        public void mouseReleased(MouseEvent event) {
            if (event.getButton() == MouseEvent.BUTTON1){
                MouseButton = 0;
                int tempX = event.getX();
                int tempY = event.getY();
                double lengthX = Math.abs(model.getActiveObject().getC_real_min()-model.getActiveObject().getC_real_max());
                double lengthY = Math.abs(model.getActiveObject().getC_imag_min()-model.getActiveObject().getC_imag_max());
                double complex_step_real = lengthX/(double)getWidth();
                double complex_step_imag = lengthY/(double)getHeight();
                double newmiddleX = model.getActiveObject().getC_real_min()+(double)tempX*complex_step_real;
                double newmiddleY = model.getActiveObject().getC_imag_max()-(double)tempY*complex_step_imag;
                // zoom in
                double newareaX = lengthX/(double)4;
                double newareaY = lengthY/(double)4;
                model.setClickedReal(newmiddleX);
                model.setClickedImag(newmiddleY);
                model.getActiveObject().setC_real_min(newmiddleX-newareaX);
                model.getActiveObject().setC_real_max(newmiddleX+newareaX);
                model.getActiveObject().setC_imag_min(newmiddleY-newareaY);
                model.getActiveObject().setC_imag_max(newmiddleY+newareaY);
                model.setTriggerRepaint(true);
                model.updateObservers();
            }
            else if (event.getButton() == MouseEvent.BUTTON3){
                MouseButton = 0;
                int tempX = event.getX();
                int tempY = event.getY();
                double lengthX = Math.abs(model.getActiveObject().getC_real_min()-model.getActiveObject().getC_real_max());
                double lengthY = Math.abs(model.getActiveObject().getC_imag_min()-model.getActiveObject().getC_imag_max());
                double complex_step_real = lengthX/(double)getWidth();
                double complex_step_imag = lengthY/(double)getHeight();
                double newmiddleX = model.getActiveObject().getC_real_min()+(double)tempX*complex_step_real;
                double newmiddleY = model.getActiveObject().getC_imag_max()-(double)tempY*complex_step_imag;
                // zoom out
                double newareaX = lengthX*(double)1.5;
                double newareaY = lengthY*(double)1.5;
                model.setClickedReal(newmiddleX);
                model.setClickedImag(newmiddleY);
                model.getActiveObject().setC_real_min(newmiddleX-newareaX);
                model.getActiveObject().setC_real_max(newmiddleX+newareaX);
                model.getActiveObject().setC_imag_min(newmiddleY-newareaY);
                model.getActiveObject().setC_imag_max(newmiddleY+newareaY);
                model.setTriggerRepaint(true);
                model.updateObservers();
            }
    
        }
    }
 

 
}