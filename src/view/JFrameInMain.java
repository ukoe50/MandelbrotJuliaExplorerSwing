package view;

import java.awt.Color;
import javax.swing.JFrame;

public class JFrameInMain {

	private final static String windows = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
	private final static String metal = "javax.swing.plaf.metal.MetalLookAndFeel";
	private final static String motif = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1100,825);
		AppPanel appPanel = new AppPanel(frame.getBounds());
		appPanel.setBackground(Color.RED);
		frame.add(appPanel);
		frame.setVisible(true);
	}

	public String getAppletInfo() {
		return "Java Swing Application redesigned by Uwe K�hler 2026";
	}
}
