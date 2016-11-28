/**
 * Created by LiuSitong on 2016/10/31.
 */
public class D {
    public static void main(String[] args) {
        max();
    }
    static  void  max(){
        int [] a = {1,2,99,4,5,6};
        int max= a[0];
        for (int i=1;i<6;i++){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.print(max);
    }
}
