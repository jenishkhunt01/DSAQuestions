import java.util.Arrays;

public class MoveAllNegativeElementsToOneSideOfTheArray {
    public static void main(String[] args) {
        int [] array = {-12 , 11, -13 , -5 , 6 , -7 , 5 , 3};
        move(array);
    }

    public static void move(int [] arr){
        for(int i =0 ; i< arr.length ; i++){
            int tempi=i;
            while (i>0&&arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i--;
            }
            i=tempi;
        }
        System.out.println(Arrays.toString(arr));
    }
}
