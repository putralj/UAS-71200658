package com.uas.perawatan;

public class Pendaftaran extends DAO{
    private int idPendaftaran;
    private String nama;

    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public void setIdPendaftaran(int idPendaftaran) {
        this.idPendaftaran = idPendaftaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Pendaftaran(int idPendaftaran, String nama) {
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar) {
        if(!pengunjung.getStatus()) {
            daftar.setStatusDaftar(true);
            daftar.setPengunjung(pengunjung);
            daftar.setPemeriksa(pemeriksa);
            daftar.setPendaftaran(this);
        }
    }

    public Pengunjung registrasi(){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Masukan RM baru : ");
        int newRm = scan1.nextInt();

        System.out.print("Masukan nama Anda : ");
        String name = scan2.nextLine();

        System.out.print("Masukan usia Anda : ");
        int age = scan1.nextInt();

        System.out.print("Masukan alamat Anda : ");
        String address = scan2.nextLine();

        System.out.print("Masukkan penyakit Anda : ");
        String sick = scan2.nextLine();

        Pengunjung pengunjung = new Pengunjung(newRm, name,age, address, sick);
        super.inputPengunjung(pengunjung);
        System.out.println("Data Pengunjung Berhasil Disimpan!");
        System.out.println("=================PROSES REGISTRASI BERHASIL=================");
        return pengunjung;
    }


}
