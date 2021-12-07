package testJava.Quay;

import testJava.HangHoa.Thit;
import testJava.HangHoa.GiaDung;
import testJava.HangHoa.Nuoc;
import testJava.HangHoa.RauCu;

import java.util.ArrayList;
import java.util.Scanner;

public class Quay1 {

  public Quay1(int luaChon) {
    ArrayList<Thit> listThit = new ArrayList<Thit>();
    ArrayList<GiaDung> listGiaDung = new ArrayList<GiaDung>();
    ArrayList<RauCu> listRauCu = new ArrayList<>();
    ArrayList<Nuoc> listNuoc = new ArrayList<Nuoc>();

    if (luaChon == 1) {

      System.out.println("1. Thit");
      System.out.println("2. Gia Dung");
      System.out.println("3. Rau Cu");
      System.out.println("4. Nuoc");
  
      Scanner scanner = new Scanner(System.in);
  
      int luaChon2 = scanner.nextInt();
      switch(luaChon2) {
        //listThit 
        case 1 -> {
          scanner.nextLine();
          System.out.print("Ten: ");
          String ten = scanner.nextLine();
          System.out.print("So Luong: ");
          int soLuong = scanner.nextInt();
  
          Thit themThit = new Thit(ten, soLuong);
  
          listThit.add(themThit);
        }
        
        case 2 -> {
          scanner.nextLine();
          System.out.print("Ten: ");
          String ten = scanner.nextLine();
          System.out.print("So Luong: ");
          int soLuong = scanner.nextInt();
  
          GiaDung themGiaDung = new GiaDung(ten, soLuong);
  
          listGiaDung.add(themGiaDung);
        }
  
        case 3 -> {
          scanner.nextLine();
          System.out.print("Ten: ");
          String ten = scanner.nextLine();
          System.out.print("So Luong: ");
          int soLuong = scanner.nextInt();
  
          RauCu themRauCu = new RauCu(ten, soLuong);
  
          listRauCu.add(themRauCu);
        }
  
        case 4 -> {
          scanner.nextLine();
          System.out.print("Ten: ");
          String ten = scanner.nextLine();
          System.out.print("So Luong: ");
          int soLuong = scanner.nextInt();

          Nuoc themNuoc = new Nuoc(ten, soLuong);
  
          listNuoc.add(themNuoc);
        }
      }
  
      scanner.close();
    } else {
      System.out.println("======Thit======");
      for (Thit tempThit: listThit) {
        System.out.println(tempThit);
      }
      System.out.println("======Gia Dung======");
      for (GiaDung tempGiaDung: listGiaDung) {
        System.out.println(tempGiaDung);
      }
      System.out.println("======Rau Cu======");
      for (RauCu tempRauCu: listRauCu) {
        System.out.println(tempRauCu);
      }
      System.out.println("======Nuoc======");
      for (Nuoc tempNuoc: listNuoc) {
        System.out.println(tempNuoc);
      }
    }
  }
}
