import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanici Adiniz : ");
            userName = input.nextLine();
            System.out.print("Parolaniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do {
                    System.out.println("""
                            1-Para yatirma
                            2-Para Cekme
                            3-Bakiye Sorgula
                            4-Cikis Yap""");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = input.nextInt();

                    if (select == 1) {
                        System.out.print("Para miktari : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktari : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right);
                }
            }
        }


        // Switch case
        System.out.println("------------------------");
        System.out.println("Switch Case ile uygulama");
        System.out.println(" ");
        String userName1, password1;
        Scanner scanner = new Scanner(System.in);
        int right1 = 3;
        int balance1 = 1500;
        int select1;
        while (right1 > 0) {
            System.out.print("Kullanici Adiniz : ");
            userName1 = scanner.nextLine();
            System.out.print("Parolaniz : ");
            password1 = scanner.nextLine();

            if (userName1.equals("patikaswitch") && password1.equals("dev123case")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
                do {
                    System.out.println("""
                            1-Para yatirma
                            2-Para Cekme
                            3-Bakiye Sorgula
                            4-Cikis Yap""");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select1 = scanner.nextInt();

                    switch (select1) {
                        case 1:
                            System.out.print("Para miktari : ");
                            int price1 = scanner.nextInt();
                            balance1 += price1;
                            System.out.println("Hesabiniza " + price1 + " miktar para yatirildi.");
                            System.out.println("Guncel bakiyeniz : " + balance1);
                            break;
                        case 2:
                            System.out.print("Para miktari : ");
                            price1 = scanner.nextInt();
                            if (price1 > balance1) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance1 -= price1;
                                System.out.println("Hesabinizdan " + price1 + " miktar para cekildi.");
                                System.out.println("Guncel bakiyeniz : " + balance1);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance1);
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                        default:

                    }

                } while (select1 != 4);
                break;
            } else {
                right1--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if (right1 == 0) {
                    System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan Hakkiniz : " + right1);

                }
            }
        }
    }
}