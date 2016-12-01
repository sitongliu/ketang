/**
 * Created by LiuSitong on 2016/12/1.
 */
public class S {
    public static void main(String[] args) {
        int []a= {1,2,5,6,9,8,7,4};
        BubbleSort(a);
        for (int k:a){
            System.out.println(k);
        }
        System.out.println(BinarySearch(a,7));

    }
    static  void BubbleSort(int []a){
        for (int i= 0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
    }
    static  int BinarySearch(int []a,int key){
        int low= 0;
        int height = a.length-1;
        while (low<=height){
            int mid = (low+height)/2;
         if (key>a[mid]){
             low= mid+1;
         }else if (key<a[mid]){
             height= mid-1;
         }else if (key==a[mid]){
             return mid;
         }
    }
        return -1;
    }

}
