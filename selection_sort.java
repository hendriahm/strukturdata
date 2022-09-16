/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab_vii;

/**
 *
 * @author Cipta Ramadhani
 */
public class selection_sort {
    
    public static int[] selec(int[] array)
    {
        int ukuran=array.length;
        
        while(ukuran>0)
        {
            int max=0;
            int i;
            
            for(i=1;i<ukuran;i++)
            {
                if(array[max]<array[i])
                    max=i;
            }
            
            int temp=array[max];
            array[max]=array[ukuran-1];
            array[ukuran-1]=temp;
            
            ukuran--;
        }        
        return array;
    }
    
}
