/**
 * Created by LiuSitong on 2016/11/7.
 */
public class G {
    public static void main(String[] args) {

        int []a ={4,8,7,9,6,2,1,3};
        for (int i= 0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                   int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        for (int k:a){
            System.out.print(k);
        }


       System.out.print(binarySearch(a,9));

    }

    static int binarySearch(int []a,int k){
        int low =0;
        int height=a.length-1;

            while(low<=height){
                int mid =(low+height)/2;
                if(k<a[mid]){
                    height = mid-1;
                }else if (k>a[mid]){
                    low = mid +1;
                }else if (k==a[mid]){
                    return mid;
                }
            }
        return -1;
    }
}
