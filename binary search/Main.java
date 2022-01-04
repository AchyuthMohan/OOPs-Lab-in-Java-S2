import java.util.Scanner;



class Main {
  int binarySearch(int array[], int element, int low, int high) {

  
    while (low <= high) {

      int mid = low + (high - low) / 2;

      if (array[mid] == element)
        return mid;

      if (array[mid] < element)
        low = mid + 1;


      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String args[]) {

    Main obj = new Main();
    Scanner input = new Scanner(System.in);

    int[] array = new int[30];
    int n,j;
    System.out.println("Enter the array size: ");
    n=input.nextInt();
    int i;
    System.out.println("Enter the elements in ascending order: ");
    for(i=0;i<n;i++){
        array[i]=input.nextInt();
    } 
   for(i=0;i<n;i++){
       for(j=i+1;j<n;j++){
           if(array[i]>array[j]){
               int temp=array[i];
               array[i]=array[j];
               array[j]=temp;
           }
       }
   }
    

    System.out.println("Enter element to be searched:");

    int element = input.nextInt();
    input.close();

    int result = obj.binarySearch(array, element, 0, n - 1);
    if (result == -1)
      System.out.println("Not found");
    else
      System.out.println("Element found at index " + result);
  }
}