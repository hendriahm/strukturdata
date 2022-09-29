//source: https://www.guru99.com/
public class InsertionSortDetail {
public static void main(String a[]) {
int[] myArray = {4, 3, 2, 10, 12, 1, 5, 6};
System.out.println("Before Insertion Sort");
printArray(myArray);
//sorting array using insertion sort
insertionSort(myArray);
System.out.println("After Insertion Sort");
printArray(myArray);
}
public static void insertionSort(int arr[]) {
int n = arr.length;
for (int i = 1; i < n; i++)
{ System.out.println("Sorting yang ke: "+(i));
int key = arr[i];
int j = i-1;
while ( (j > -1) && ( arr [j] > key ) )
{
System.out.println("Bandingkan "+ key + " dan " + arr [j]);
arr [j+1] = arr [j];
j--;
}
arr[j+1] = key;
System.out.println("Tukarkan elemen: Array baru setelah tukar");
printArray(arr);
}
}
static void printArray(int[] array){
for(int i=0; i < array.length; i++)
{
System.out.print(array[i] + " ");
}
System.out.println();
}
}
