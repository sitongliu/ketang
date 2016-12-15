/**
 * Created by LiuSitong on 2016/11/28.
 */
public class R {
    public static void main(String[] args) {
        int a[] ={4,5,9,8,7,6,3,2};
        quickSort(a,0,a.length-1);
        for (int k :a){
            System.out.println(k);
        }

    }

    static  void  quickSort(int []a,int start,int end){
        int i = start;
        int j = end;

        if (i>=j){
            return;
        }

        boolean flag = true;
        while (i!=j){
            if (a[i]>a[j]){
                int temp =0;
                temp=a[i];
                a[i] =a[j];
                a[j]= temp;
                flag=!flag;
            }
            if (flag){
                j--;
            }else {
                i++;
            }
        }
        i--;
        j++;

        quickSort(a,start,i);
        quickSort(a,j,end);

    }
}
