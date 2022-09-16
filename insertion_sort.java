/*
 * @author Cipta Ramadhani
 * Buku Dasar Algoritma dan Struktur Data Bahasa Java
 */

public class insertion_sort {    
    static int[] insertion(int[] array)
    {
     int ukuran=array.length;  
     int max,j;
     int i=1;
     
     while(i<ukuran)
     {
         max=array[i];
         for(j=i;j>0;j--)
         {
             if(max<array[j-1])
                 array[j]=array[j-1];
             else
                 break;
         }         
         array[j]=max;         
         i++;
     }     
     return array;     
    }    
}
