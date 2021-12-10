

import java.util.Scanner;

import Quay.Quay1;
import Quay.Quay2;
import Quay.Quay3;
import Quay.Quay4;

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
            // case == quay vd: case 1 == quay1
            switch(luaChon()) {
              case 1 -> {
                int endHangHoa = 0;
                do {
                  System.out.println("________________Quay 1________________");
                  hangHoa();
                  // chon ten hang hoa de them
                  switch(luaChon()) {
                    case 1 -> {
                      System.out.println("***** Them Thit *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay1.themThit(ten, soLuong);
                    }
                    case 2 -> {
                      System.out.println("***** Them Gia Dung *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay1.themGiaDung(ten, soLuong);
                    }
                    case 3 -> {
                      System.out.println("***** Them Rau Cu *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay1.themRauCu(ten, soLuong);
                    }
                    case 4 -> {
                      System.out.println("***** Them Nuoc *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay1.themNuoc(ten, soLuong);
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
                int endHangHoa = 0;
                do {
                  System.out.println("________________Quay 2________________");
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
      
                      Quay2.themThit(ten, soLuong);
                    }
                    case 2 -> {
                      System.out.println("***** Them Gia Dung *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay2.themGiaDung(ten, soLuong);
                    }
                    case 3 -> {
                      System.out.println("***** Them Rau Cu *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay2.themRauCu(ten, soLuong);
                    }
                    case 4 -> {
                      System.out.println("***** Them Nuoc *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();

                      Quay2.themNuoc(ten, soLuong);
                    }
                    case 5 -> {
                      endHangHoa = 1;
                    }
                    default -> {
                      System.out.println("Khong co lua chon nay!!!");
                    }
                  }

                } while(endHangHoa == 0);
              }
              case 3 -> {
                int endHangHoa = 0;
                do {
                  System.out.println("________________Quay 3________________");
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
      
                      Quay3.themThit(ten, soLuong);
                    }
                    case 2 -> {
                      System.out.println("***** Them Gia Dung *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay3.themGiaDung(ten, soLuong);
                    }
                    case 3 -> {
                      System.out.println("***** Them Rau Cu *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay3.themRauCu(ten, soLuong);
                    }
                    case 4 -> {
                      System.out.println("***** Them Nuoc *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay3.themNuoc(ten, soLuong);
                    }
                    case 5 -> {
                      endHangHoa = 1;
                    }
                    default -> {
                      System.out.println("Khong co lua chon nay!!!");
                    }
                  }

                } while(endHangHoa == 0);
              }
              case 4 -> {
                int endHangHoa = 0;
                do {
                  System.out.println("________________Quay 4________________");
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
      
                      Quay4.themThit(ten, soLuong);
                    }
                    case 2 -> {
                      System.out.println("***** Them Gia Dung *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay4.themGiaDung(ten, soLuong);
                    }
                    case 3 -> {
                      System.out.println("***** Them Rau Cu *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
                      Quay4.themRauCu(ten, soLuong);
                    }
                    case 4 -> {
                      System.out.println("***** Them Nuoc *****");
                      Scanner scanner = new Scanner(System.in);
                      System.out.print("Nhap ten: ");
                      String ten = scanner.nextLine();
                      System.out.print("So luong: ");
                      int soLuong = scanner.nextInt();
                      scanner.nextLine();
      
                      Quay4.themNuoc(ten, soLuong);
                    }
                    case 5 -> {
                      endHangHoa = 1;
                    }
                    default -> {
                      System.out.println("Khong co lua chon nay!!!");
                    }
                  }
                } while(endHangHoa == 0);
              }
              case 5 -> {
                endMenuQuay = 1;
              }
              default -> {
                System.out.println("Khong co lua chon nay!!!");
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
                System.out.println("________________Quay 1________________");
                Quay1.xuatThongTin();
              }
              case 2 -> {
                System.out.println("________________Quay 2________________");
                Quay2.xuatThongTin();
              }
              case 3 -> {
                System.out.println("________________Quay 3________________");
                Quay3.xuatThongTin();
              }
              case 4 -> {
                System.out.println("________________Quay 4________________");
                Quay4.xuatThongTin();
              }
              case 5 -> {
                endChonQuay = 1;
              }
              default -> {
                System.out.println("Khong co quay nay!!!");
              }
            }
          } while(endChonQuay == 0);
        }
        case 5 ->{
          System.out.println("Cam on ban da lua chon phan men <3");
          endMenu = 1;
        }

        default -> {
          System.out.println("Khong co lua nay!!!");
        }

      }

    }while (endMenu == 0);
  }

  static void hangHoa() {
    System.out.println("\n\n");
    System.out.println("+========== Hang Hoa ==========+");
    System.out.println("|     1. Thit                  |");
    System.out.println("|     2. Gia Dung              |");
    System.out.println("|     3. Rau Cu                |");
    System.out.println("|     4. Nuoc                  |");
    System.out.println("|     5. Tro ve                |");
    System.out.println("+==============================+");
  }

  static void menu() {
    System.out.println("\n\n");
    System.out.println("+============ Menu ============+");
    System.out.println("|     1. Them                  |");
    System.out.println("|     2. Xoa                   |");
    System.out.println("|     3. Tim kiem              |");
    System.out.println("|     4. Xuat thong tin        |");
    System.out.println("|     5. Thoat                 |");
    System.out.println("+==============================+");
  }

  static void quay() {
    System.out.println("\n\n");
    System.out.println("+============ Quay ============+");
    System.out.println("|     1. Quay 1                |");
    System.out.println("|     2. Quay 2                |");
    System.out.println("|     3. Quay 3                |");
    System.out.println("|     4. Quay 4                |");
    System.out.println("|     5. Tro ve                |");
    System.out.println("+==============================+");
  }

  static int luaChon() {
    System.out.print("Lua Chon: ");
    Scanner scanner = new Scanner(System.in);
    int suLuaChon = scanner.nextInt();
    return suLuaChon;
  }
}