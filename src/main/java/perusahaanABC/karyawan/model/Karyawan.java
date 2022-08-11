package perusahaanABC.karyawan.model;


import lombok.Data;

@Data
public class Karyawan {
    private Long id;
    private String nama;
    private int umur;
    private String jk;
    private String alamat;
}
