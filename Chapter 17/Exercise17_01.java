import java.io.*;

public class Exercise17_01 {
    public static void main(String[] args) throws IOException{
        try (FileOutputStream output = new FileOutputStream("Exercise17_01.txt");){
            for (int i = 0; i < 100; i++){
                int num = (int) (Math.random() * 100);
                output.write(num);
            }
        }
        try(FileInputStream input = new FileInputStream("Exercise17_01.txt");){
            int value;
            while ((value = input.read()) != -1){
                System.out.print(value + " ");
            }
        }
    }
}
