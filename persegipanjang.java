import java.util.Scanner;
class PersegiPanjang {
    double panjang;
    double lebar;
    public PersegiPanjang() {}
    public void setPanjang(double p) {
        panjang = p;
    }
    public void setLebar(double l) {
        lebar = l;
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public void tampil() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukkan panjang: ");
        persegiPanjang.setPanjang(input.nextDouble());
        System.out.print("Masukkan lebar: ");
        persegiPanjang.setLebar(input.nextDouble());
        input.close();
        persegiPanjang.tampil();
    }
}