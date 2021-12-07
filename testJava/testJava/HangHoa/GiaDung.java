package testJava.HangHoa;

public class GiaDung {
  private String ten;
  private int soLuong;

  public GiaDung(String ten, int soLuong) {
    this.ten = ten;
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return "Ten: " + ten + "\n" + "So luong: " + soLuong;
  }
} 