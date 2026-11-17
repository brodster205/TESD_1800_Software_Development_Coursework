import java.io.*;
public class Excercise17_03{
   public static void main(String[] args) throws IOException{
       try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));){
           for (int i = 0; i < 100; i++){
               int num = (int) (Math.random() * 100);
               output.writeInt(num);
           }
       }
       int sum = 0;
       try (DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"));){
           int value;
           while (true){
            value = input.readInt();
               System.out.print(value + " ");
               sum += value;
           }
       }
       catch (EOFException ex){
           System.out.println("\nThe sum is " + sum);
       }

   }
}

