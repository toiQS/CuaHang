package testJava.HangHoa;

public class RauCu {
  private String ten;
  private int soLuong;

  public RauCu(String ten, int soLuong) {
    this.ten = ten;
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return "Ten: " + ten + "\n" + "So luong: " + soLuong;
  }
} 
