package CuaHang;

import java.util.Scanner;

public class MAIN {
  private static int chon;
  public static void main(String[] args) {

    int end = 1;
    do {
      System.out.println("1. Them");
      System.out.println("2. Xoa");
      System.out.println("3. Xuat thong tin");
      System.out.println("4. Tro ve");
      luaChon();
      switch(chon) {
        case 1 -> {
          System.out.println("1. Quay 1");
          System.out.println("2. Quay 2");
          System.out.println("3. Quay 3");
          System.out.println("4. Quay 4");
          Scanner scanner2 = new Scanner(System.in);
          int luaChon2 = scanner2.nextInt();
  
          switch(luaChon2) {
            // tao chi lam quay 1 thoi may kia tuong tu
            case 1 -> {
              new Quay1(luaChon2);
              System.out.println("Da them thanh cong");
            }
          }
        }
        
        case 2 -> {
          System.out.println("Nay chua co lam");
        }
  
        case 3 -> {
          System.out.println("1. Quay 1");
          System.out.println("2. Quay 2");
          System.out.println("3. Quay 3");
          System.out.println("4. Quay 4");
          Scanner scanner2 = new Scanner(System.in);
          int luaChon2 = scanner2.nextInt();
          switch(luaChon2) {
            // tao chi lam quay 1 thoi may kia tuong tu
            case 1 -> {
              new Quay1(chon);
            }
          }
        }

        case 4 -> {
          end = 0;
        }
      }
    }while(end == 1);
  }

  static int luaChon() {
    System.out.println("Nhap lua chon: ");
    Scanner scanner = new Scanner(System.in);
    chon = scanner.nextInt();
    return chon;
  }
}