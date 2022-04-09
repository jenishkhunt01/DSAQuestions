import java.util.Arrays;

public class SortTheArrayOf012 {
    static int[] arr = {0 , 2,1 ,2 , 0};

    public static void main(String[] args) {
        sort();

    }
    public static void sort(){
        int j=1;
        int loop_count =0;

        for(int i =0 ; i< arr.length ; i++,j++){

            int temp_i =1;
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                while (i>0 && arr[i-1]> arr[i]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    i--;
                }
                i = temp_i;
                if(j==arr.length-1)
                    break;
            }
            loop_count++;
        }
        for(int i =0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(loop_count);
    }
}
