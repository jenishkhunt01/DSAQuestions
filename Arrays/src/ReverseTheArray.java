import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Arrays arrays = new Arrays(n);
        int [] array = new int[n];
        for(int i =0 ; i< n ; i++){
            array[i] = sc.nextInt();
        }
        array =arrays.reverse(array);
        System.out.println(java.util.Arrays.toString(array));
        array = arrays.reverse(array);
        System.out.println(java.util.Arrays.toString(array));

    }

}

class Arrays{
    public int size;
    public Arrays(int size){
        this.size = size;
    }

    public int [] reverse(int [] arr){

        int index = size-1;
        for(int i = 0 ; i< size/2 ; i++, index--){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}

