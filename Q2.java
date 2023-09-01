import java.util.Scanner;
public class Soru2 {
   public static void main(String[] args) {
      int MAX = 0; //Siralama icin gerekli olan sabitler.
      int MAX1 = 0;
      int MAX2 = 0;
      Scanner scanner = new Scanner(System.in);
      System.out.print("Lutfen 4 tane tam sayi giriniz: ");
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int num3 = scanner.nextInt();
      int num4 = scanner.nextInt();

      System.out.println();

      if (num1 > num2)
         MAX1 = num1;
      else
         MAX1 = num2;
      if (num3 > num4)
         MAX2 = num3;
      else
         MAX2 = num4;
      if (MAX1 > MAX2)
         MAX = MAX1;
      else
         MAX = MAX2;

      //Donguyu baslatmamiz gereken maksimum buyukluk icin gerekli siralama.

      while (MAX >= 1) {
         System.out.print(MAX + ":	");

         // maksimum basildiktan sonra tek tek girilen degerler kontrol edilmeye baslanir eger ilk deger MAX sayimiza buyukse ya da esitse * basilir ancak sayimiz kucukse tablonun duzgunlugu icin "   " basilir daha sonra sayi ikiye gecilir. Sayilarda kuculdukce bosluk artaracaktir. Ancak sonsuz dongu olmamasi icin ve istenen sonuca ulasilmasi icin MAX azaltilmalidir.

         if (num1 >= MAX)
            System.out.print("* ");
         else
            System.out.print("  ");

         if (num2 >= MAX)
            System.out.print("* ");
         else
            System.out.print("  ");

         if (num3 >= MAX)
            System.out.print("* ");
         else
            System.out.print("  ");

         if (num4 >= MAX)
            System.out.print("* ");
         else
            System.out.print("  ");

         MAX--;
         System.out.println();
      }
      System.out.println("	A B C D");

   }
}
