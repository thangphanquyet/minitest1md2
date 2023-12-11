import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        String password;
        String name;
        int count =1;
       do {
            System.out.println("nhập name");
            name = nhap.nextLine();
            System.out.println("nhập mật khẩu");
            password = nhap.nextLine();

            if ((name.equals("admin"))&&(password.equals("123456"))){
                int number=-1;
                while (number!=0){
                    //hien menu
                    System.out.println("MENU");
                    System.out.println("1. Vẽ hinh vuông");
                    System.out.println("2. Vẽ hinh vuông");
                    System.out.println("3. Vẽ hinh vuông");
                    System.out.println("0.exit");
                    System.out.println("Nhap so");
//                nhapHinhVuong(nhap);
                    number = nhap.nextInt();
                    switch (number){
                        case 1:
                            System.out.println("ve hinh vuong");
                            nhapHinhVuong();
                            break;
                        case 2:
                            System.out.println("ve tam giac cân");
                            nhapHinhtamgiaccan();
                            break;
                        case 3:
                            System.out.println("vẽ hình tam giác");
                            nhaphinhtamgiac();
                        case 0:
                            System.exit(0);
                    }
                }

            } else {
                count++;
            }

        } while (count<4);


    }

    private static void nhapHinhVuong(){
        Scanner input = new Scanner(System.in);
        System.out.println("nhập chiều rộng, cao:");
          int rong, cao;
            do {
                System.out.println("nhập chiều rộng:");
                rong = input.nextInt();
                System.out.println("nhập chều cao:");
                cao = input.nextInt();
            } while (rong != cao);
            System.out.println("hình vuông");
                for(int i = 1; i <= cao; i++){
                    for(int j = 1; j <= rong; j++) {
                        System.out.print("*  ");
                    }
                    System.out.println("");
                    }

    }
    private static void nhapHinhtamgiaccan(){
        Scanner sc = new Scanner(System.in);
        int hight, k = 0;
        System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }

    }
    private static void nhaphinhtamgiac(){
        Scanner sc = new Scanner(System.in);
        int hight;
        System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
        hight = sc.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}