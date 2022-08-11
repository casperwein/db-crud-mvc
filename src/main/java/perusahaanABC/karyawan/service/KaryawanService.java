package perusahaanABC.karyawan.service;

import perusahaanABC.karyawan.model.Karyawan;

import java.util.List;

public interface KaryawanService {
    public Karyawan save(Karyawan obj);
    public Karyawan update(Karyawan obj);

    public List<Karyawan> deleted(Long id);
    public List<Karyawan> dataKywn(int row,int page);

    public Karyawan findById(long obj);

}
