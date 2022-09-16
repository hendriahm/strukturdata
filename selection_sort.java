/*
 * @author Cipta Ramadhani
 * Buku Dasar Algoritma dan Struktur Data Bahasa Java
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
