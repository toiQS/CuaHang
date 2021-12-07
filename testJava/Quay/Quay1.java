package testJava.Quay;

import java.util.ArrayList;

import testJava.HangHoa.Thit;

public class Quay1 {
  private String ten;
  private int soLuong;
  static ArrayList<Thit> listThit = new ArrayList<Thit>();

  public Quay1(String ten, int soLuong) {
    this.ten = ten;
    this.soLuong = soLuong;

  }

  public static void themThit(String ten, int soLuong) {
    Thit thit = new Thit(ten, soLuong);
    listThit.add(thit);
  }

  public static void xuatThongTin() {
    System.out.println("===== Thit =====");
    for (Thit thit: listThit) {
      System.out.println(thit);
    }
  }
}
