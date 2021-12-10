package HangHoa;

public class Thit {
  private String ten;
  private int soLuong;
  private int gia;

  public Thit(String ten, int soLuong, int gia) {
    this.ten = ten;
    this.soLuong = soLuong;
    this.gia = gia;
  }

  @Override
  public String toString() {
    return "Ten: " + ten + "\n"
           + "So luong: " + soLuong + "\n" 
           + "Gia: " + gia
           + "\n";
  }
}