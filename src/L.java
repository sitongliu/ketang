/**
 * Created by LiuSitong on 2016/11/14.
 */
public class L {
    public static void main(String[] args) {
        int a [] ={4,5,8,9,7,6,3,2,1,5,5,5};
    }
    static void  quikSort(int a, int start ,int end){
        int i= start;
        int j= end;
        if (i>=j){

        }

    }


  static int binarySort(int []a,int key){
      int low = 0;
      int height =a.length-1;
      while (low<height) {
          int mid = (low + height) / 2;
          if (key > a[mid]) {
              low = mid + 1;
          } else if (key < a[mid]) {
              height = mid - 1;
          } else if (key == a[mid]) {
              return mid;
          }
      }
      return -1;
    }
}
