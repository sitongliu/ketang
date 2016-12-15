/**
 * Created by LiuSitong on 2016/12/14.
 */
public class T {
    public static void main(String[] args) {
        int []a = { 4 ,5,6,8,2,1};
        Bubble(a);
        for (int k: a
             ) {
            System.out.println(k);
        }

    }
    public static  void  Bubble(int []a){
        for (int i = 0;i<a.length-1;i++){
            for(int j = 0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    int temp = 0;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
