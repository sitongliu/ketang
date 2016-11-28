/**
 * Created by LiuSitong on 2016/11/10.
 */
public class J {

    public void  modify(String b){
       b  = "456";
    }

    public static void main(String[] args) {
        String a ="123";
        System.out.println(a);
        J jj = new J();
        jj.modify(a);
        System.out.println(a);
    }

}
