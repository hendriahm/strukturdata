//source: https://www.guru99.com

public class BubbleSortDetail {
public static void main(String[] args){
int arr[] ={5, 3, 1, 9, 8, 2, 4, 7};
System.out.println("---Array BEFORE Bubble Sort---");
printArray(arr);
BubbleSortDetail(arr);//sorting array elements using bubble sort
System.out.println("---Array AFTER Bubble Sort---");
printArray(arr);
}
static void BubbleSortDetail(int[] array){
int n = array.length;
int temp = 0;
// Looping through the array length

for(int i=0; i < n; i++) 
{ System.out.println("Sort yang ke "+(i+1));
for(int j=1; j < (n-i); j++){
System.out.println("Bandingkan "+ array[j-1]+ " dan " + array[j]);

if(array[j-1] > array[j]){
//swap elements
temp = array[j-1];
array[j-1] = array[j];
array[j] = temp;
System.out.println(array[j] + " lebih besar dari pada " + array[j-1]);
System.out.println("Tukar elemen: Array baru setelah tukar");
printArray(array);

}
}
}
}
static void printArray(int[] array){
for(int i=0; i < array.length; i++){
System.out.print(array[i] + " ");
}
System.out.println();
}
}
