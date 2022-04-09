import java.util.Arrays;

public class FindKthSmallestElement {
    static int [] array = {10 , 20 , 40 , 30 , 60 , 70};

    public static void main(String[] args) {
        Arrays.sort(array);
        System.out.println(findKthSmallest(3));
    }
    public static int findKthSmallest(int k){
       return array[k-1];
    }
}
