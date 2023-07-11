import java.util.Scanner;
public class App {
    public void NhapChuoiBai4()
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap chuoi x: ");
        String x = sc.nextLine();
        System.out.print("Nhap chuoi y: ");
        String y = sc.nextLine();

         System.out.println("\nTong chieu dai cua chuoi x la: " + x.length());
         System.out.println("3 ky tu dau tien cua chuoi x: " + x.substring(0, 3));
         System.out.println("3 ky tu cuoi cua chuoi x: " + x.substring(x.length()-3, x.length()));
         System.out.println("Ky tu thu 6 cua chuoi x la: " + x.charAt(6));

         String newString = x.substring(0, 3) + y.substring(y.length()-3, y.length());
         System.out.println("Chuoi moi duoc tao la: " + newString);

         System.out.println("Phan biet chu hoa chu thuong");

         if(x.equals(y))
         {
            System.out.println("Hai chuoi bang nhau");
         }
         else
         {
            System.out.println("Hai chuoi khong bang nhau");
         }

         System.out.println("Khong phan biet chu hoa chu thuong");
         if(x.equalsIgnoreCase(y))
         {
            System.out.println("Hai chuoi bang nhau");
         }
         else
         {
            System.out.println("Hai chuoi khong bang nhau");
         }

        sc.close();

    }
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.NhapChuoiBai4();

    }
}
