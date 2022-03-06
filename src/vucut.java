import java.util.Scanner;
public class vucut {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int kg;
        double boy, endeks;
        System.out.print("Lütfen Boyunuzu Giriniz: ");
        boy= input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz: ");
        kg= input.nextInt();
        endeks=kg/(boy*boy);
        System.out.println("********************************************");
        System.out.print("Vücut kitle Endeksiniz: "+endeks);



    }
}
