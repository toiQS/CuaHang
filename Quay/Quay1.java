package Quay;

import java.util.ArrayList;


import HangHoa.GiaDung;
import HangHoa.Nuoc;
import HangHoa.RauCu;
import HangHoa.Thit;

public class Quay1 {
  static int soLuongHangHoa = 0;
  static ArrayList<Thit> listThit = new ArrayList<Thit>();
  static ArrayList<GiaDung> listGiaDung = new ArrayList<GiaDung>();
  static ArrayList<RauCu> listRauCu = new ArrayList<RauCu>();
  static ArrayList<Nuoc> listNuoc = new ArrayList<Nuoc>();

  public Quay1() {

  }

  public static void themThit(String ten, int soLuong, int gia) {
    Thit thit = new Thit(ten, soLuong, gia);
    soLuongHangHoa =+ soLuong;
    listThit.add(thit);
  }

  public static void themGiaDung(String ten, int soLuong, int gia) {
    GiaDung giaDung = new GiaDung(ten, soLuong, gia);
    soLuongHangHoa =+ soLuong;
    listGiaDung.add(giaDung);
  }

  public static void themRauCu(String ten, int soLuong, int gia) {
    RauCu rauCu = new RauCu(ten, soLuong, gia);
    soLuongHangHoa =+ soLuong;
    listRauCu.add(rauCu);
  }

  public static void themNuoc(String ten, int soLuong, int gia) {
    Nuoc nuoc = new Nuoc(ten, soLuong, gia);
    soLuongHangHoa =+ soLuong;
    listNuoc.add(nuoc);
  }

  public static void xuatThongTin() {
    System.out.println("So luong hang hoa hien co tai quay: " + soLuongHangHoa);
    System.out.println("Chi tiet: ");
    System.out.println("===== Thit =====");
    for (Thit thit: listThit) {
      System.out.println(thit);
    }

    System.out.println("===== Gia Dung =====");
    for (GiaDung giaDung: listGiaDung) {
      System.out.println(giaDung);
    }

    System.out.println("===== Rau Cu =====");
    for (RauCu rauCu: listRauCu) {
      System.out.println(rauCu);
    }

    System.out.println("===== Nuoc =====");
    for (Nuoc nuoc: listNuoc) {
      System.out.println(nuoc);
    }

  }
}
