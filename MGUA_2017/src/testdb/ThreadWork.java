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
public class ThreadWork {
    Form form = new Form();
    int row = form.getRow();
    float Nmatrix[][] = new float[row][row];
    float Tmatrix[][] = new float[row][row];
    float Mmatrix[][] = new float[row][row];
 
    
    int JJ = form.getJJ();
   int i;
   int j;
   
   
   
   
   
    public float[][]NewMatrix(float[][] matrix, int part){
        if(part == 0){
        for(i=0;i<row;i++){
          Nmatrix[i][0] = (float) 1.0;
          for(j=0;j<JJ;j++){
              Nmatrix[i][j+1] = matrix[i][j];
              Nmatrix[i][JJ+1+j] = matrix[i][j] * matrix[i][j];
          }
      } 
        }
        if(part==1){
            for(i=0;i<row;i++){
          Nmatrix[i][0] = (float) 1.0;
          for(j=0;j<JJ;j++){
              Nmatrix[i][j+1] = matrix[i][j];
              if(j<JJ-1){
                  Nmatrix[i][JJ+1+j] = matrix[i][j] * matrix[i][j+1];
              }
              else{
                 Nmatrix[i][JJ*2] = matrix[i][JJ-1] * matrix[i][1]; 
              }
          }
      }
        }
       for(i=0;i<row;i++){
           for(j=0;j<row;j++){
               Tmatrix[j][i] = Nmatrix[i][j];
           }
       }
      
    
    
         for (int i = 0; i<row;i++ ){
		 for ( j = 0; j < row; j++) {
			 Mmatrix[i][j] =0;
			
			 for (int k = 0; k < row; k++){
				 Mmatrix[i][j]+= Tmatrix[i][k] * Nmatrix[k][j];
			
			 }
                 }
        }
       
    
    
    
   
       float[][]work = new float[row][2*row];
       float[][]tmp = new float[row][2*row];
       float[][] Inverse = new float[row][row];
       for(i=0; i <row;i++){
           for(j=0;j<row;j++){
               work[i][j]= Mmatrix[i][j];
           }
           work[i][i+row] = 1;
       }
      for(i=0;i<row;i++){
          for(j=0;j<row*2;j++){
              tmp[i][j] = work[i][j];
             
          }
         
      }
     i=0;
     j=0;
      for(int k = 0; k< row; k++){
         
          for(j = k; j< row*2; j++){
             work[k][j] = work[k][j] / tmp[k][k];
            
              for(i = 0; i<row;i++){
                  if (i==k){
                      
                      continue;
                      
                  }
                  else{
                     
                  work[i][j] = work[i][j] - work[k][j] * tmp[i][k];
                 
                  
                
                  }
              }
              
          }
           for(i=0;i<row;i++){
          for(j=0;j<row*2;j++){
              tmp[i][j] = work[i][j];
             
          }
         
      }
      }
      
      for(i = 0; i<row; i++){
       for(int j = row,  k = 0; j < row*2;j++,k++){
           Inverse[i][k] = work[i][j];
       }
   }
     
       float[][] ResultMatrix = new float[row][row];
            
          for (int i = 0; i<row;i++ ){
		 for ( j = 0; j < row; j++) {
			 ResultMatrix[i][j] =0;
			
			 for (int k = 0; k < row; k++){
				 ResultMatrix[i][j]+= Inverse[i][k] * Tmatrix[k][j];
			
			 }
                 }
        }
       return ResultMatrix;
   }
}
