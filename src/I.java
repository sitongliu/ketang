/**
 * Created by LiuSitong on 2016/11/10.
 */
public class I {
    public static void main(String[] args) {

        int a[] ={4,5,9,8,7,6,3,2};
        quickSort(a,0,a.length-1);
        for (int k :a){
            System.out.println(k);
        }
      //  binarySearch(a, 7);

    }

    static void quickSort(int []a,int start,int end){
        int i=start;
        int j= end;
        if (i>=j){
            return;
        }
        boolean flag = true;
        while (i!=j){
            int temp = a[i];
            a[i]= a[j];
            a[j] = a[i];
            flag= !flag;
        }
        if (flag){
            j--;
        }else {
            i++;
        }

        i--;
        j++;
        quickSort(a,start,i);
        quickSort(a,j,end);
    }

    static int binarySearch(int []a, int key){

        int low = 0;
        int heigh = a.length-1;
        while (low<heigh){
            int mid = (low+heigh)/2;
            if (key>a[mid]){
                low = mid;
            }else if(key<a[mid]){
                heigh = mid;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
