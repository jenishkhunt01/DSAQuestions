

public class FIndMinAndMax {
    public static void main(String[] args) {
        int [] array = {10 , 20 , 30 , 40 , 60 , 70};
        findMin(array);

    }
    public static void findMin(int [] arr){
        int min = 100000;
        int max=0;
        for(int i =0 ; i< arr.length ; i++) {

            if (min > arr[i])
                min = arr[i];
            if (max < arr[i])
                max = arr[i];
        }
        System.out.println(min+" "+max);
    }

}
