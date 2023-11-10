package baitapcuoikhoa;

public class GiamDoc extends NhanVien{
    private float phanTramCoPhan;

    public GiamDoc(){
        setLuongMotNgay(300);
    }

    public float getPhanTramCoPhan() {
        return phanTramCoPhan;
    }

    public void setPhanTramCoPhan(float phanTramCoPhan) {
        this.phanTramCoPhan = phanTramCoPhan;
    }

    @Override
    public void nhapThongTinNhanVien() {
        super.nhapThongTinNhanVien();
        nhapSoNgayLamViec();
        nhapPhanTramCoPhieu();
        tinhLuong();
    }

    private void nhapPhanTramCoPhieu() {
        System.out.println("Nhập phần trăm cổ phiếu: ");
        float phanTramCoPhieu = sc.nextFloat();
        while (true){
            if(kt.KiemTraPhanTramCoPhieu(phanTramCoPhieu)) break;
            else {
                phanTramCoPhieu = sc.nextFloat();
                sc.nextLine();
            }
        }
        setPhanTramCoPhan(phanTramCoPhieu);
    }


}
