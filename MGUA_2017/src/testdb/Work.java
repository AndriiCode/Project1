/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;



/**
 *
 * @author user
 */
public class Work{
    Form form = new Form();
    int row = form.getRow();
    public float[] Koeff(float[][]ResultMatrix, float[]y){
        float []koef = new float[19];
         for (int i = 0; i<row;i++ ){
		 

				 koef[i] = 0;
                 
        }
           
   for (int i = 0; i<row;i++ ){
		 for (int j = 0; j < row; j++) {

				 koef[i]+= ResultMatrix[i][j] * y[j];
                 }
        }
   return koef;
    }
   
   
   
   
   
}
