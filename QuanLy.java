import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
  private List<NhanVien> nhanvienList; //tạo danh sách nhân viên
  public QuanLy(){
    this.nhanvienList = new ArrayList<>();
  }
  public void addNhanVien(NhanVien nhanvien){ //thêm nhân viên
    nhanvienList.add(nhanvien);
  }

  public boolean delNhanVien(String Ma){ //xóa nhân viên dựa theo mã nhân viên
    NhanVien nhanvien = this.nhanvienList.stream().filter(o -> o.getMa().equals(Ma)).findFirst().orElse(null);
    if(nhanvien == null){
      return false;
    }
    this.nhanvienList.remove(nhanvien);
    return true;
  }

  public List<NhanVien> searchNhanVien(String Ma){ //tìm kiếm dựa theo mã nhân viên
    return this.nhanvienList.stream().filter(o -> o.getMa().equals(Ma)).collect(Collectors.toList());
  }

  public void showThongTin(){ //xuất ra toàn bộ thông tin trong danh sách nhân viên
    this.nhanvienList.forEach(o -> System.out.println(o.toString()));
  }

  public List<NhanVien> SuaThongTinNhanVien(int a, NhanVien nhanvien){ //sửa thông tin dựa vào số thứ tự của nhân viên hiện trên danh sách
    nhanvienList.set(a,nhanvien);
    return nhanvienList;
  }
}