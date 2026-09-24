import java.util.Scanner;
class testRandomArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] randomArray = new int[100];
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = (int)(Math.random() * 10);
        }
        System.out.println("What number of the array would you like to see ");
        int index = input.nextInt();
        if ((index - 1) <= randomArray.length){
            System.out.println("the number is " + randomArray[index - 1]);
        }
        else{
            System.out.println("Out of Bounds.");
        }
        input.close();
    }
}
