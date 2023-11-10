package condition;

public class KiemTraDieuKien {

    public boolean KiemTraChuoiRong(String chuoi) {
        if(chuoi.isEmpty()) {
            System.out.println("Chuỗi nhập vào không được để rỗng, vui lòng nhập lại: ");
            return false;
        } else return true;
    }

    public boolean KiemTraChieuDaiChuoi(String chuoi, int chieuDai) {
        if(chuoi.length() == chieuDai) return true;
        else {
            System.out.println("Chuỗi nhập vào phải có chiều dài là " + chieuDai + ",vui lòng nhập lại: ");
            return false;
        }
    }

    public boolean KiemTraChuoiSo(String chuoi) {
        if(chuoi == null || chuoi.equals("")) {
            System.out.println("Chuỗi là giá trị null, hoặc không chứa kí tự, vui lòng nhập lại:");
            return false;
        }
        try {
            long iVal = Long.parseLong(chuoi);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Chuỗi chứa kí tự không phải số, vui lòng nhập lại: ");
            return false;
        }
    }

    public boolean KiemTraLaSoDuong(double so) {
        if(so < 0) {
            System.out.println("Doanh thu tháng >= 0,vui lòng nhập lại: ");
            return false;
        } else return true;
    }

    public boolean KiemTraSoNgayLamViec(int soNgayLamViec, int thang, int nam) {
        int soNgayCuaThang = SoNgayCuaThang(thang, nam);
        if(soNgayLamViec >= 0 && soNgayLamViec <= soNgayCuaThang) return true;
        else {
            System.out.println("Số ngày làm việc của tháng " + thang + " từ 0 - " + soNgayCuaThang + ",vui lòng nhập lại: ");
            return false;
        }
    }

    private int SoNgayCuaThang(int thang, int nam) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) return 29;
                else return 28;
            default:
                return -1;
        }
    }

    public boolean KiemTraPhanTramCoPhieu(float ptCoPhieu) {
        if(ptCoPhieu >= 0 && ptCoPhieu <= 100) return true;
        else {
            System.out.println("Phần trăm cổ phiếu có trong khoảng 0 - 100");
            return false;
        }
    }
}
