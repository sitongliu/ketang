/**
 * Created by LiuSitong on 2016/11/7.
 */
public class H {
    public static void main(String[] args) {
        int []a ={4,5,8,7,9,6,2,3,1};
        int start=0;
        int end = a.length-1;
        qiuckSort(a,start,end);
        for (int k :a){
            System.out.println(k);
        }

    }
    static void qiuckSort(int []a, int start, int end){
        int i= start;
        int j= end;
        if (i>=j){
            return ;
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
        j++;
        i--;
        qiuckSort(a,start,i);
        qiuckSort(a,j,end);
    }

}
