
import java.util.Scanner;
public class Deneme {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız kilometre kaç kuruş yakıyor? (Örnek: 0,32): ");
        double kurus = scanner.nextDouble();
        System.out.print("Aracınızla kaç km gittiniz: ");
        int km = scanner.nextInt();
        System.out.println("Toplam ödemeniz gereken tutar: " +(kurus*km)+" TL'dir");
    }
}
