/**
 * Created by LiuSitong on 2016/11/17.
 */
public class DriverTacker {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Tacker tacker = new Tacker();

        driver.setName("liuliu");
        driver.getName();
        tacker.setSpeed(70);
        tacker.getSpeed();
    }
}
 class Driver{
     private String name;
     private int age;
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }


}
class Tacker{
    private String tackname;
    private int speed;

    public String getTackname() {
        return tackname;
    }

    public void setTackname(String tackname) {
        this.tackname = tackname;
    }

    public int getSpeed() {
        if (speed>40){
            this.speed = 40;
            System.out.println(speed+"超速了");
        }
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}