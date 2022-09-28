//source: https://www.guru99.com/
public class SelectionSort {
public static void main(String a[]){
int[] myArray = {7,4,6,3,0,5,1,2};
System.out.println("------Before Selection Sort-----");
printArray(myArray);
selection(myArray);//sorting array using selection sort
System.out.println("-----After Selection Sort-----");
printArray(myArray);
}
public static void selection(int[] array){
for (int i = 0; i < array.length - 1; i++) {
System.out.println("Sort yang ke "+(i+1));
int index = i;
for (int j = i + 1; j < array.length; j++){
System.out.println("Bandingkan "+ array[index] + " dan " + array[j]);
if (array[j] < array[index]){
System.out.println(array[index] + " lebih besar dari pada " + array[j] );
index = j;
}
}
int smallerNumber = array[index];
array[index] = array[i];
array[i] = smallerNumber;
System.out.println("Tukar elemen: Array Baru setelah tukar");
printArray(array);
}
}
static void printArray(int[] array){
for(int i=0; i < array.length; i++){
System.out.print(array[i] + " ");
}
System.out.println();
}
}
