/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple;

import jade.core.Agent;
import org.apache.commons.math3.stat.regression.OLSMultipleLinearRegression;

/**
 *
 * @author oem
 */
public class Multiple extends Agent {
    public void setup(){
             Multiple regression = new Multiple();
            double[] y = new double[]{11.0, 12.0, 13.0};
            double[][] x = new double[3][];
            x[0] = new double[]{0, 0, 0, 0, 0};
            x[1] = new double[]{2.0, 0, 0, 0, 0};
            x[2] = new double[]{0, 3.0, 0, 0, 0};
         
            regression.newSampleData(y, x);
           double[] beta = regression.estimateRegressionParameters();     
    
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private void newSampleData(double[] y, double[][] x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private double[] estimateRegressionParameters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
