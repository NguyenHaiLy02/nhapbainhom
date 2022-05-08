package Main;
import View.TrangChu;

public class main {

    public static View.TrangChu frmTC = new TrangChu();
    public static Connect.clsConnectDB connection = new Connect.clsConnectDB();

    public static void main(String[] args) {
        View.DangNhap frmDN = new View.DangNhap();

        frmDN.show();
    }

}
