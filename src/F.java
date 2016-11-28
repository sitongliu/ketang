/**
 * Created by LiuSitong on 2016/11/3.
 */
public class F {
    public static void main(String[] args) {

        arrays();

    }

    static  void  arrays(){
       int [][][]a = {

               {
                       {1,2,5,3} ,{3,4,5,9,10}
               },
               {
                       {4,5,5,5,6},{5,6,7}
               },
               {
                       {6,7,8},{7,8,9,10}
               }

       };

       for (int i=0;i<a.length;i++){
           for (int j=0;j<a[i].length;j++){
               for (int k=0;k<a[i][j].length;k++){
                   System.out.print(a[i]);
               }
           }
       }





      /* for (int [][]b : a){
           for (int []c :b){
               for (int d:c){
                   System.out.print(d);
               }
               System.out.println("");
           }
           System.out.println("");
       }*/


    }
}
