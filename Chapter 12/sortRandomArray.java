import java.util.Scanner;
import java.util.Arrays;
class testInputOutput {
   public static void main(String[] args) throws Exception{
       java.io.File file = new java.io.File("Exercise12_15.txt");
       int[] data = new int[100];
       try(
           java.io.PrintWriter output = new java.io.PrintWriter(file);){
       for (int i = 0; i < 100; i++){
           output.print((int) (Math.random() * 10));
           data[i] = (int)(Math.random() * 100);
       }
   }
   Scanner input = new Scanner(file);
   input.close();
   Arrays.sort(data);
   System.out.println(Arrays.toString(data));
   }
}



