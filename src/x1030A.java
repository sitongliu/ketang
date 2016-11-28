/**
 * Created by LiuSitong on 2016/10/30.
 */
public class x1030A {
    public static void main(String[] args) {
       year();
        year1(2016);




      int score=45;
        switch (score/20+1) {
            case 1 : {
                int a =score/20+1;
                System.out.println("1");
                break;
            }
            case 2 :{
                System.out.println("2");
                break;
            }
            case 3:{
                System.out.println("3");
                break;
            }
            case 4:{
                System.out.println("4");
                break;
            }
            case 5:{
                System.out.println("5");
            }
            case 100:{

            }
        }


    }

    //没有返回值 没有形参
     static  void year(){
         int a=2016;
         if (((a%4==0)&&(a%100!=0))||(a%400==0)){
             System.out.println("是闰年");
         }else {
             System.out.println("不是");
         }
     }

     //没有返回值 ，有形参
    static  void year1(int a){
        if (((a%4==0)&&(a%100!=0))||(a%400==0)){
            System.out.println("是闰年");
        }else {
            System.out.println("不是");
        }
    }





}
