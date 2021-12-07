package testJava.HangHoa;

public class Thit {
  private String ten;
  private int soLuong;

  public Thit(String ten, int soLuong) {
    this.ten = ten;
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return ten + ' ' + soLuong;
  }
}
