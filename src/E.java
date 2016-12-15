import java.util.Arrays;

/**
 * Created by LiuSitong on 2016/11/3.
 */
public class E {
    public static void main(String[] args) {
        int []a ={2,9,4,3,6,7};
        int key = 9;
        Arrays.sort(a);
      //  System.out.println(a);
        System.out.print(binarySearch(key,a));

    }

   public static int binarySearch(int key,int a[]){

        int low=0;
        int high=a.length-1;
        while (low<=high){
            int mid = (low + high)/2;
            if (mid>key){
                high= mid -1;
            }else if (mid<key){
                low = mid +1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
