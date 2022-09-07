/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import static java.lang.StrictMath.pow;

/**
 *
 * @author user
 */
public class Regular {
    
    Form form = new Form();
    //float[]y = form.Yprob;
  //  float[]result = form.prognoz;
    public float Regul( float[]y,float[]result){
        float S=0;
        float S1 = 0;
        float S2 = 0;
        for(int i = 0; i< result.length; i++){
      
            S1+=(y[i]-result[i])*(y[i]-result[i]);
            S2+=y[i]*y[i];
        }
        S=S1/S2;
       S = (float) Math.sqrt(S);
        return S;
    }
    
}
