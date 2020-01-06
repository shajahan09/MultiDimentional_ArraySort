/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication118;

/**
 *
 * @author HP
 */
public class MultiDimemtionalArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] arrs = {
            {3,5,6,7},
            {4,2,9,6},
            {5,8,9,2}};
        arrs =sorting(arrs);
        for(int a=0; a<arrs.length;a++){
            for(int b=0; b<arrs[a].length;b++){
                System.out.print(arrs[a][b]+" ");
            }
            System.out.println("");
        }
    }

    private static int[][] sorting(int[][] arrays) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    for(int a=0; a<arrays.length;a++){
        int[] nestedArray = arrays[a];
        for(int k=1; k<nestedArray.length;k++){
            for(int i=0; i<nestedArray.length-k;i++){
            if(nestedArray[i]>nestedArray[i+1]){
                int temp =nestedArray[i];
                nestedArray[i] = nestedArray[i+1];
                nestedArray[i+1] =temp;
            }
        }
    }
    }
    return arrays;
    }
    
}
