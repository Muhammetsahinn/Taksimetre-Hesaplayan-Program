import java.util.Scanner;

public class main4 {

    public static void main(String[] args){

        double km, ucret=2.20,acilis=10,para;

        Scanner grs = new Scanner(System.in);

        System.out.println("kac km gidildiğini yazınız");

        km = grs.nextDouble();

        para = acilis+km*ucret;

        para=(para<20)? 20 : para;

        System.out.println("taksi ücreti :" +para);









    }
}
