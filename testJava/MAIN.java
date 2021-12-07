package testJava;

import java.util.Scanner;

import testJava.Quay.Quay1;

public class MAIN {
  public static void main(String[] args) {
    int endMenu = 0;
    do {
      menu();
      // chon cac thao tac: them - xoa - tim kiem.................
      switch(luaChon()) {
        case 1 -> {
          int endMenuQuay = 0;
          do {
            quay();
            // chon quay de them 
            switch(luaChon()) {
              case 1 -> {
                int endHangHoa = 0;

                do {
                  hangHoa();
                  // chon ten hang hoa de them
                  switch(luaChon()) {
                    case 1 -> {
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay1.themThit(ten, soLuong);
                    }
                    case 2 -> {
                      System.err.println("Them Gia Dung");
                    }
                    case 3 -> {
                      System.out.println("Them Rau Cu");
                    }
                    case 4 -> {
                      System.out.println("Them Nuoc");
                    }
                    case 5 -> {
                      endHangHoa = 1;
                    }
                    default -> {
                      System.out.println("Khong co lua chon nay");
                    }
                  }

                } while(endHangHoa == 0);
              }
              case 2 -> {
                System.out.println("Chua lam");
              }
              case 3 -> {
                System.out.println("Chua lam");
              }
              case 4 -> {
                System.out.println("Chua lam");
              }
              case 5 -> {
                endMenuQuay = 1;
              }
              default -> {
                System.out.println("Khong co lua chon nay");
              }
            }
          } while (endMenuQuay == 0);
        }
        case 2 -> {
          System.out.println("Chon xoa");
        }
        case 3 -> {
          System.out.println("Chon tim kiem");
        }
        case 4 -> {
          // chon quay de xuat thong tin
          int endChonQuay = 0;
          do {
            quay();
            switch(luaChon()) {
              case 1 -> {
                Quay1.xuatThongTin();
              }
              case 2 -> {
                System.out.println("Chua Lam");
              }
              case 3 -> {
                System.out.println("Chua Lam");
              }
              case 4 -> {
                System.out.println("Chua Lam");
              }
              case 5 -> {
                endChonQuay = 1;
              }
              default -> {
                System.out.println("Khong co quay nay");
              }
            }
          } while(endChonQuay == 0);
        }
        case 5 ->{
          System.out.println("Chon thoat");
          endMenu = 1;
        }

        default -> {
          System.out.println("Kho co lua nay");
        }

      }

    }while (endMenu == 0);
  }

  static void hangHoa() {
    System.out.println("\n\n========== Hang Hoa ==========");
    System.out.println("1. Thit");
    System.out.println("2. Gia Dung");
    System.out.println("3. Rau Cu");
    System.out.println("4. Nuoc");
    System.out.println("5. Tro ve");
    System.out.println("==============================");
  }

  static void menu() {
    System.out.println("\n\n============ Menu ============");
    System.out.println("1. Them");
    System.out.println("2. Xoa");
    System.out.println("3. Tim kiem");
    System.out.println("4. Xuat thong tin");
    System.out.println("5. Thoat");
    System.out.println("==============================");
  }

  static void quay() {
    System.out.println("\n\n============ Quay ============");
    System.out.println("1. Quay 1");
    System.out.println("2. Quay 2");
    System.out.println("3. Quay 3");
    System.out.println("4. Quay 4");
    System.out.println("5. Tro ve");
    System.out.println("==============================");
  }

  static int luaChon() {
    System.out.print("Lua Chon: ");
    Scanner scanner = new Scanner(System.in);
    int suLuaChon = scanner.nextInt();
    return suLuaChon;
  }
}