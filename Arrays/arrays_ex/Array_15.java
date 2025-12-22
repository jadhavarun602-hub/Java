package arrays_ex;

//Delete an element from a specific position in an array. index-based (removes 89)

public class Array_15 {

 public static void main(String[] args) {

     int[] array = {23, 45, 67, 89, 53, 12, 65, 87};

     int position = 3; 

     int[] newArr = new int[array.length - 1];

     for (int i = 0, j = 0; i < array.length; i++) {

         if (i == position) {
             continue; 
         }

         newArr[j] = array[i];
         j++;
     }

   
     for (int i = 0; i < newArr.length; i++) {
         System.out.print(newArr[i] + " ");
     }
 }
}
