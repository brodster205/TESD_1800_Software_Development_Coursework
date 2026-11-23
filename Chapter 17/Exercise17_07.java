import java.io.*;
public class Exercise17_07 {
   public static void main(String[] args) throws IOException {
       Loan loan1 = new Loan();
       Loan loan2 = new Loan(1.8, 10, 10000);
      
       try (
               ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Exercise17_07.dat")));
       ) {
           output.writeObject(loan1);
           output.writeObject(loan2);
       }
       catch (IOException ex) {
           System.out.println("File could not be opened");
       }
       outputData("Exercise17_07.dat");
   }
   public static void outputData(String Exercise17_07){
    double total = 0;
       try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(Exercise17_07)));){
          while (true){
            Loan loan = (Loan) input.readObject();
            total += loan.getLoanAmount();
          }
       }
       catch (EOFException ex) {
        System.out.println("Total loan amount is " + total);
       }
       catch (IOException | ClassNotFoundException ex) {
        System.out.println("Error reading file " + ex.getMessage());
       }
   }
}
