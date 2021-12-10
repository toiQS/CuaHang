package HangHoa;

public class Thit {
  private String ten;
  private int soLuong;

  public Thit(String ten, int soLuong) {
    this.ten = ten;
    this.soLuong = soLuong;
  }

  @Override
  public String toString() {
    return "Ten: " + ten + "\n" + "So luong: " + soLuong;
  }
}