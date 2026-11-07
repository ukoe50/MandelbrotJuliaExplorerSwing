package view;

import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JPanel;
import model.JuliaSet;
import model.Mandelbrot;
import model.Model;

public class AppPanel extends JPanel {
	GraphicPanel graphicPanel;
    EditorPanel editorPanel;
    int editorWidth = 250;
    
    public AppPanel(Rectangle rect){
        setLayout(null);
        setBounds(rect);
        setBackground(Color.WHITE);
        
        Model model = new Model();
        editorPanel = new EditorPanel(model,0,0,editorWidth,getHeight());
        add(editorPanel);
        graphicPanel = new GraphicPanel(model,editorWidth,0,getWidth()-editorWidth,getHeight());
        add(graphicPanel);
        model.addObserver(graphicPanel);
        model.addObserver(editorPanel);
        model.setMandelbrot(new Mandelbrot(getWidth()-editorWidth, getHeight(), -2.1, 0.9, -1.5, 1.5, 0.0, 0.0, 150, false));
        model.setJuliaSet(new JuliaSet(getWidth()-editorWidth, getHeight(), -2.0, 2.0, -2.0, 2.0, 0.0, 0.0, 150, false));
        model.setActiveObject(model.getMandelbrot());
        model.setPaintMode(Model.MANDELBROT);
        model.setTriggerRepaint(false);
        model.updateObservers();
    }
}
