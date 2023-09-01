import java.util.Scanner;
public class Soru1 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      char secim = 'E'; // Kontrol mekanizmasi

      System.out.println("Koordinant sisteminde rastgele bir nokta sectim. Bulabilir misin?");
      System.out.println();
      System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
      int userx = scanner.nextInt();
      int usery = scanner.nextInt();
      int coox = (int)(Math.random() * 100) + 1;
      // 1 ile 100 arasinda randam sayi uretir ve bunu coox'e atar yani x ekseni belirlenir. 0 ile 99 arasinda bir  sayi olusturduk once daha sonra 1 ekledik ve 1 ile 100 oldu. Math random 0.0 ile 1.0 arasinda double bir sayi olusturur.
      int cooy = (int)(Math.random() * 100) + 1; // y ekseni icin.*/

      while (secim == 'E') {

         if (coox - userx == 0 && cooy - usery > 0) {
            System.out.println("Guney yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (coox - userx == 0 && cooy - usery < 0) {
            System.out.println("Kuzey yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery == 0 && coox - userx > 0) {
            System.out.println("Dogu yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery == 0 && coox - userx < 0) {
            System.out.println("Batı yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery > 0 && coox - userx > 0) {
            System.out.println("Guneydogu yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery < 0 && coox - userx < 0) {
            System.out.println("Kuzeybati yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery < 0 && coox - userx > 0) {
            System.out.println("Kuzeydogu yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery > 0 && coox - userx < 0) {
            System.out.println("Guneybati yonunde ilerleyin!!!");
            System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
            userx = scanner.nextInt();
            usery = scanner.nextInt();
         }
         if (cooy - usery == 0 && coox - userx == 0) {
            System.out.println();
            System.out.print("Tebrikler, buldunuz! Yeniden oynamak istiyor musunuz (E/H): ");
            secim = (scanner.next()).charAt(0);
            scanner.nextLine(); // Tampon boşaltma
            if (secim == 'H') {
               System.out.println();
               System.out.println("Hasta la vista, baby! I'll be back!");
               break;
            }
            if (secim == 'E') {
               coox = (int)(Math.random() * 100) + 1;
               // 1 ile 100 arasinda randam sayi uretir ve bunu coox'e atar yani x ekseni belirlenir. 0 ile 99 arasinda bir  sayi olusturduk once daha sonra 1 ekledik ve 1 ile 100 oldu. Math random 0.0 ile 1.0 arasinda double bir sayi olusturur.
               cooy = (int)(Math.random() * 100) + 1; // y ekseni icin.*/
               System.out.println();
               System.out.print("Lutfen x ve y koordinant tahmininizi giriniz (1-100): ");
               userx = scanner.nextInt();
               usery = scanner.nextInt();
            }
         }
      }
   }
}
