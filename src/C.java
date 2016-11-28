/**
 * Created by LiuSitong on 2016/10/31.
 */
public class C {
    public static void main(String[] args) {
        shuzu();

    }

    static void shuzu(){

        int [] a = new int[10];
        for (int i=0;i<10;i++){
            a[i]=i;
            System.out.print(a[i]);
        }

      int i = 0;
        while (i<10){
            a[i]=i;
            System.out.print(a[i]);
            i++;
        }


        for (int k : a){
            System.out.println(k);
        }


    }
}
