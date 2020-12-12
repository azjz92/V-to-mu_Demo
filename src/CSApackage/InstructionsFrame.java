/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSApackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author rod
 */
public class InstructionsFrame extends javax.swing.JFrame {

  /**
   * Creates new form InstructionsFrame
   */
  public InstructionsFrame() {
    initComponents();
    textArea2.setText("\n When the app opens there will be a default number (Q) of WTA CMs\n"
            + " and a default number (K) of units in each CM.  The lower right (\"Mac comprised...\")\n"
            + " panel will have V and \u03C1 values (bars) for each unit in each CM.\n"
            + " You can change Q or K with their corresponding spinners. There will be one unit\n"
            + " in each CM with the max V value (as indicated by the \"Max V\" slider (which is synced\n"
            + " to the G slider).  The max V is 1 at the outset. The rest of the units in each CM will\n"
            + " have V values chosen randomly from the range determined by the min and max crosstalk\n"
            + " sliders. A unit's V value represents its input summation, but normalized to [0,1].\n\n"
            + " The V chart bar colors:\n\n"
            + "  - Black denotes the unit with the max V in its CM, which is therefore the unit\n"
            + "    that should win in the CM.  Gray denotes a non-max-V unit.  By \"should win\", we\n"
            + "    mean the following. The fact that the app enforces that all Q winners have the same V \n"
            + "    is intended to simulate the situation where an input has been presented (we do not \n"
            + "    explicitly represent or show the input), and the set of Q max V units is the code of the \n"
            + "    most closely matching previously stored input (these previous inputs are also not \n"
            + "    explicitly represented).  Therefore, if the model were operating in inference (recognition)\n"
            + "    mode, we would want all Q of those units to be chosen winners. \n\n"
            + " The \u03C1 chart bar colors:\n\n"
            + "  - Black denotes the unit that actually wins, i.e., is drawn from the \u03C1 distribution.\n"
            + "    The winner might not be the unit with the max V.  In CMs in which that happens,\n"
            + "    the \u03C1 bar of the max V unit is drawn in pink indicating an \"error\" (in the sense\n"
            + "    that the winning unit was not part of the code of the most closely matching previously\n"
            + "    stored input, as described above).\n\n"
            + " Step 1: Either:\n\n"
            + "   - Press one of the \"life phase\" buttons\n"
            + "       This creates an entire new V dist. in each CM, respecting the specified crostalk limits \n"
            + "       for all cells besides the max. The cell with max V may change with each press. The max V \n"
            + "       in each cell will be as specified by the G and V sliders (which are tied).\n"
            + "   - press \"Generate New Sample\" button\n"
            + "       This also creates an entire new V dist. in each CM, with specified crosstalk limits\n"
            + "       But it keeps the winning cell the same.\n\n"
            + " Step 2: Then you can play with sliders and buttons to understand how Sparsey preserves similarity \n\n"
            + " Step 3: (optional) Press \"Run Experiment\" button.  Brings up dialog allowing you to run experiment involving\n"
            + "         many runs while max V varies from 1.0 down to the max crosstalk V in specifiable deltas.\n"
            + "         It also allows you to specify the number of trials performed at each max V setting.  It computes average\n"
            + "         for the set of trials at each max V setting.  Soon you'll be able to save results to a txt file.\n\n\n"
            + " Notes: \n\n"
            + "   - You might have to resize to see all the CMs in lower right panel. You can also change number of CMs.\n"
            + "   - You can hit buttons as many times as you want. Each time, new random V distributions are generated.\n"
            + "   - When you move sliders (except for crosstalk distribution limit sliders), the V distributions remain the same,\n"
            + "     but the \u03c1 distributions which vary.\n"
            + "   - When you vary the crosstalk range distribution sliders, you then have to hit one of the buttons to generate\n"
            + "     new V distributions adhering to the updated range.  But if you hit one of the \"life phase\" buttons,\n"
            + "     the crosstalk range limits are set to default values (as are the sliders).  If you want to specify the crosstalk\n"
            + "     range limits and keep them, you should then use the \"Generate New Sample\" button."    
    );
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    textArea2 = new java.awt.TextArea();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Sparsey Code Selection Algorithm (CSA) Demo Instructions");

    textArea2.setEditable(false);
    textArea2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    textArea2.setMinimumSize(new java.awt.Dimension(300, 300));
    textArea2.setPreferredSize(new java.awt.Dimension(400, 400));
    getContentPane().add(textArea2, java.awt.BorderLayout.CENTER);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  Font axisValuesFont = new Font("Serif", Font.BOLD, 14);
  Font axisVarFont = new Font("Serif", Font.BOLD, 24);
  Font titleFont = new Font("Serif", Font.BOLD, 24);
  
  public void paintComponent (Graphics g)
  {
//    super.paintComponent( g );
    Graphics2D g2 = (Graphics2D) g;
    
    g2.setColor( Color.BLACK );
    
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(InstructionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new InstructionsFrame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private java.awt.TextArea textArea2;
  // End of variables declaration//GEN-END:variables
}
