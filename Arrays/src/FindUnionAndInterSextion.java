import java.util.Arrays;

public class FindUnionAndInterSextion {
    static int arr1[] = {85 ,85,25, 1, 32, 54, 6};
    static int arr2[]= {85 , 2 , 2};
    static int [] arr = new int[arr1.length+arr2.length];
    static int index=0;
    public static void main(String[] args) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        union(i , j);
        for(int k =0 ; k<index ; k++){
            System.out.print(arr[k]+" ");
        }

    }

    public static void union(int i ,  int j){
        if(arr1[i]> arr2[j]){
            arr[index++] = arr2[j++];
        }else if(arr2[j] > arr1[i]){
            arr[index++] = arr1[i++];
        }else if(arr1[i] == arr2[j]){
            arr[index++] = arr2[j];
            i++;
            j++;
        }
        if(i == arr1.length){
            while (j!= arr2.length){
                arr[index++] = arr[j];
                j++;
            }
        }
        if(j == arr2.length){
            while (i!= arr1.length){
                arr[index++] = arr1[i];
                i++;
            }
        }
        if(i<arr1.length-1 &&arr1[i]==arr1[i+1])
            i++;
        if(j<arr2.length-1&&arr2[j] == arr2[j+1])
            j++;
        if(i==arr1.length && j== arr2.length){
            return ;
        }
        union(i, j);

    }

}
