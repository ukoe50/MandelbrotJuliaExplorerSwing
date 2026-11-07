/*
 * Created @Uwe Koehler , 12.07.2006
 */
package vep;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.ScrollPane;

public class Editor {

    private JPanel jPanel = null;  //  @jve:decl-index=0:visual-constraint="47,23"
    private JLabel jLabel1 = null;
    private JLabel jLabel3 = null;
    private TextField txt_iterations = null;
    private JLabel jLabel4 = null;
    private JLabel jLabel5 = null;
    private JLabel jLabel6 = null;
    private JLabel jLabel7 = null;
    private TextField txt_minBorderReal = null;
    private TextField txt_maxBorderReal = null;
    private TextField txt_minBorderImag = null;
    private TextField txt_maxBorderImag = null;
    private JLabel jLabel = null;
    private JLabel jLabel8 = null;
    private JLabel jLabel9 = null;
    private TextField txt_constantReal = null;
    private TextField txt_constantImag = null;
    private TextField txt_clickedPReal = null;
    private JLabel jLabel10 = null;
    private TextField txt_clickedPImag = null;
    private JButton butt_createJuliaFrom = null;
    private JButton butt_repaint = null;
    private JLabel jLabel11 = null;
    private JLabel jLabel12 = null;
    private JRadioButton jRadioButton = null;
    private JRadioButton jRadioButton1 = null;
    private JRadioButton jRadioButton2 = null;
    private JLabel jLabel13 = null;
    private TextField textField = null;
    private JButton jButton = null;
    private JRadioButton jRadioButton3 = null;
    private JLabel jLabel14 = null;
    private JRadioButton jRadioButton4 = null;
    private JRadioButton jRadioButton5 = null;
    private JLabel jLabel2 = null;
    private JLabel jLabel15 = null;
    private JButton jButton1 = null;
    private JButton jButton2 = null;
    /**
     * This method initializes jPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            jLabel15 = new JLabel();
            jLabel15.setBounds(new java.awt.Rectangle(51,99,144,19));
            jLabel15.setText("Zoom out : Right Mouse-Click");
            jLabel15.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel2 = new JLabel();
            jLabel2.setBounds(new java.awt.Rectangle(51,84,144,17));
            jLabel2.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel2.setText("Zoom in : Left Mouse-Click");
            jLabel14 = new JLabel();
            jLabel14.setBounds(new java.awt.Rectangle(16,727,199,16));
            jLabel14.setFont(new java.awt.Font("Dialog", java.awt.Font.ITALIC, 11));
            jLabel14.setText("by Uwe Köhler. 2006");
            jLabel13 = new JLabel();
            jLabel13.setBounds(new java.awt.Rectangle(15,650,104,19));
            jLabel13.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel13.setText("Path and filename :");
            jLabel12 = new JLabel();
            jLabel12.setBounds(new java.awt.Rectangle(15,582,210,19));
            jLabel12.setText("Export As JPG :");
            jLabel11 = new JLabel();
            jLabel11.setBounds(new java.awt.Rectangle(87,37,76,22));
            jLabel11.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
            jLabel11.setText("Explorer");
            jLabel10 = new JLabel();
            jLabel10.setBounds(new java.awt.Rectangle(15,375,90,18));
            jLabel10.setText("Clicked Point Imag");
            jLabel10.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel9 = new JLabel();
            jLabel9.setBounds(new java.awt.Rectangle(15,357,90,18));
            jLabel9.setText("Clicked Point Real");
            jLabel9.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel8 = new JLabel();
            jLabel8.setBounds(new java.awt.Rectangle(15,327,90,18));
            jLabel8.setText("Constant Imag");
            jLabel8.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel = new JLabel();
            jLabel.setBounds(new java.awt.Rectangle(15,309,90,18));
            jLabel.setText("Constant Real");
            jLabel.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel7 = new JLabel();
            jLabel7.setBounds(new java.awt.Rectangle(15,260,90,18));
            jLabel7.setText("Min Border Imag");
            jLabel7.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel6 = new JLabel();
            jLabel6.setBounds(new java.awt.Rectangle(15,279,90,18));
            jLabel6.setText("Max Border Imag");
            jLabel6.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel5 = new JLabel();
            jLabel5.setBounds(new java.awt.Rectangle(15,240,90,18));
            jLabel5.setText("Max Border Real");
            jLabel5.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel4 = new JLabel();
            jLabel4.setBounds(new java.awt.Rectangle(15,221,90,18));
            jLabel4.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel4.setText("Min Border Real");
            jLabel3 = new JLabel();
            jLabel3.setBounds(new java.awt.Rectangle(15,192,77,18));
            jLabel3.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jLabel3.setText("Max Iterations");
            jLabel1 = new JLabel();
            jLabel1.setText("Mandelbrot and Julia-Set");
            jLabel1.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 16));
            jLabel1.setBounds(new java.awt.Rectangle(27,17,210,20));
            jPanel = new JPanel();
            jPanel.setLayout(null);
            jPanel.setBounds(new java.awt.Rectangle(0,0,250,750));
            jPanel.setBackground(new java.awt.Color(241,232,153));
            jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray,2));
            jPanel.add(jLabel1, null);
            jPanel.add(jLabel3, null);
            jPanel.add(getTextField(), null);
            jPanel.add(jLabel4, null);
            jPanel.add(jLabel5, null);
            jPanel.add(jLabel6, null);
            jPanel.add(jLabel7, null);
            jPanel.add(getTxt_minBorderReal(), null);
            jPanel.add(getTxt_maxBorderReal(), null);
            jPanel.add(getTxt_minBorderImag(), null);
            jPanel.add(getTxt_maxBorderImag(), null);
            jPanel.add(jLabel, null);
            jPanel.add(jLabel8, null);
            jPanel.add(jLabel9, null);
            jPanel.add(getTxt_constantReal(), null);
            jPanel.add(getTxt_constantImag(), null);
            jPanel.add(getTxt_clickedPReal(), null);
            jPanel.add(jLabel10, null);
            jPanel.add(getTxt_clickedPImag(), null);
            jPanel.add(getButt_createJuliaFrom(), null);
            jPanel.add(getButt_repaint(), null);
            jPanel.add(jLabel11, null);
            jPanel.add(jLabel12, null);
            jPanel.add(getJRadioButton(), null);
            jPanel.add(getJRadioButton1(), null);
            jPanel.add(getJRadioButton2(), null);
            jPanel.add(jLabel13, null);
            jPanel.add(getTextField2(), null);
            jPanel.add(getJButton(), null);
            jPanel.add(getJRadioButton3(), null);
            jPanel.add(jLabel14, null);
            jPanel.add(getJRadioButton4(), null);
            jPanel.add(getJRadioButton5(), null);
            jPanel.add(jLabel2, null);
            jPanel.add(jLabel15, null);
            jPanel.add(getJButton1(), null);
            jPanel.add(getJButton2(), null);
        }
        return jPanel;
    }

    /**
     * This method initializes textField	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTextField() {
        if (txt_iterations == null) {
            txt_iterations = new TextField();
            txt_iterations.setBounds(new java.awt.Rectangle(112,193,54,18));
            txt_iterations.setName("txt_iterations");
            txt_iterations.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_iterations;
    }

    /**
     * This method initializes textField1	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_minBorderReal() {
        if (txt_minBorderReal == null) {
            txt_minBorderReal = new TextField();
            txt_minBorderReal.setBounds(new java.awt.Rectangle(112,222,118,18));
            txt_minBorderReal.setName("txt_minBorderReal");
            txt_minBorderReal.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_minBorderReal;
    }

    /**
     * This method initializes textField2	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_maxBorderReal() {
        if (txt_maxBorderReal == null) {
            txt_maxBorderReal = new TextField();
            txt_maxBorderReal.setBounds(new java.awt.Rectangle(112,241,118,18));
            txt_maxBorderReal.setName("txt_maxBorderReal");
            txt_maxBorderReal.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_maxBorderReal;
    }

    /**
     * This method initializes textField3	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_minBorderImag() {
        if (txt_minBorderImag == null) {
            txt_minBorderImag = new TextField();
            txt_minBorderImag.setBounds(new java.awt.Rectangle(112,260,118,18));
            txt_minBorderImag.setName("txt_minBorderImag");
            txt_minBorderImag.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_minBorderImag;
    }

    /**
     * This method initializes textField4	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_maxBorderImag() {
        if (txt_maxBorderImag == null) {
            txt_maxBorderImag = new TextField();
            txt_maxBorderImag.setBounds(new java.awt.Rectangle(112,279,118,18));
            txt_maxBorderImag.setName("txt_maxBorderImag");
            txt_maxBorderImag.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_maxBorderImag;
    }

    /**
     * This method initializes textField5	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_constantReal() {
        if (txt_constantReal == null) {
            txt_constantReal = new TextField();
            txt_constantReal.setBounds(new java.awt.Rectangle(112,309,118,18));
            txt_constantReal.setName("txt_constantReal");
            txt_constantReal.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_constantReal;
    }

    /**
     * This method initializes textField6	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_constantImag() {
        if (txt_constantImag == null) {
            txt_constantImag = new TextField();
            txt_constantImag.setBounds(new java.awt.Rectangle(112,328,118,18));
            txt_constantImag.setName("txt_constantImag");
            txt_constantImag.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_constantImag;
    }

    /**
     * This method initializes textField7	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_clickedPReal() {
        if (txt_clickedPReal == null) {
            txt_clickedPReal = new TextField();
            txt_clickedPReal.setBounds(new java.awt.Rectangle(112,357,118,18));
            txt_clickedPReal.setName("txt_clickedPReal");
            txt_clickedPReal.setEditable(false);
            txt_clickedPReal.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_clickedPReal;
    }

    /**
     * This method initializes textField8	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTxt_clickedPImag() {
        if (txt_clickedPImag == null) {
            txt_clickedPImag = new TextField();
            txt_clickedPImag.setBounds(new java.awt.Rectangle(112,376,118,18));
            txt_clickedPImag.setName("txt_clickedPImag");
            txt_clickedPImag.setEditable(false);
            txt_clickedPImag.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return txt_clickedPImag;
    }

    /**
     * This method initializes jButton1	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButt_createJuliaFrom() {
        if (butt_createJuliaFrom == null) {
            butt_createJuliaFrom = new JButton();
            butt_createJuliaFrom.setBounds(new java.awt.Rectangle(22,416,199,22));
            butt_createJuliaFrom.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            butt_createJuliaFrom.setText("Create Julia-Set at Clicked Point");
        }
        return butt_createJuliaFrom;
    }

    /**
     * This method initializes jButton2	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButt_repaint() {
        if (butt_repaint == null) {
            butt_repaint = new JButton();
            butt_repaint.setBounds(new java.awt.Rectangle(22,444,199,22));
            butt_repaint.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            butt_repaint.setText("Repaint Image");
        }
        return butt_repaint;
    }

    /**
     * This method initializes jRadioButton	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton() {
        if (jRadioButton == null) {
            jRadioButton = new JRadioButton();
            jRadioButton.setBounds(new java.awt.Rectangle(15,601,70,20));
            jRadioButton.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jRadioButton.setBackground(new java.awt.Color(241,232,153));
            jRadioButton.setText("512/512");
        }
        return jRadioButton;
    }

    /**
     * This method initializes jRadioButton1	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton1() {
        if (jRadioButton1 == null) {
            jRadioButton1 = new JRadioButton();
            jRadioButton1.setBounds(new java.awt.Rectangle(131,601,76,20));
            jRadioButton1.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jRadioButton1.setBackground(new java.awt.Color(241,232,153));
            jRadioButton1.setText("1024/1024");
        }
        return jRadioButton1;
    }

    /**
     * This method initializes jRadioButton2	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton2() {
        if (jRadioButton2 == null) {
            jRadioButton2 = new JRadioButton();
            jRadioButton2.setBounds(new java.awt.Rectangle(15,620,84,20));
            jRadioButton2.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jRadioButton2.setBackground(new java.awt.Color(241,232,153));
            jRadioButton2.setText("2048/2048");
        }
        return jRadioButton2;
    }

    /**
     * This method initializes textField	
     * 	
     * @return java.awt.TextField	
     */
    private TextField getTextField2() {
        if (textField == null) {
            textField = new TextField();
            textField.setText("C:\\Image.jpg");
            textField.setBounds(new java.awt.Rectangle(15,671,210,20));
            textField.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
        }
        return textField;
    }

    /**
     * This method initializes jButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getJButton() {
        if (jButton == null) {
            jButton = new JButton();
            jButton.setBounds(new java.awt.Rectangle(15,699,210,20));
            jButton.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jButton.setText("Export Image");
        }
        return jButton;
    }

    /**
     * This method initializes jRadioButton3	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton3() {
        if (jRadioButton3 == null) {
            jRadioButton3 = new JRadioButton();
            jRadioButton3.setBounds(new java.awt.Rectangle(131,620,76,20));
            jRadioButton3.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jRadioButton3.setBackground(new java.awt.Color(241,232,153));
            jRadioButton3.setText("4096/4096");
        }
        return jRadioButton3;
    }

    /**
     * This method initializes jRadioButton4	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton4() {
        if (jRadioButton4 == null) {
            jRadioButton4 = new JRadioButton();
            jRadioButton4.setBounds(new java.awt.Rectangle(15,150,95,22));
            jRadioButton4.setText("Mandelbrot");
        }
        return jRadioButton4;
    }

    /**
     * This method initializes jRadioButton5	
     * 	
     * @return javax.swing.JRadioButton	
     */
    private JRadioButton getJRadioButton5() {
        if (jRadioButton5 == null) {
            jRadioButton5 = new JRadioButton();
            jRadioButton5.setBounds(new java.awt.Rectangle(134,150,95,22));
            jRadioButton5.setText("Julia-Set");
        }
        return jRadioButton5;
    }

    /**
     * This method initializes jButton1	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new JButton();
            jButton1.setBounds(new java.awt.Rectangle(22,472,199,22));
            jButton1.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11));
            jButton1.setText("Set Defaults");
        }
        return jButton1;
    }

    /**
     * This method initializes jButton2	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new JButton();
            jButton2.setBounds(new java.awt.Rectangle(149,654,77,13));
            jButton2.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
            jButton2.setText("Search");
        }
        return jButton2;
    }

}
