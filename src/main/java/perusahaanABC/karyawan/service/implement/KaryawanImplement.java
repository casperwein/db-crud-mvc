package perusahaanABC.karyawan.service.implement;

import org.springframework.stereotype.Service;
import perusahaanABC.karyawan.model.Karyawan;
import perusahaanABC.karyawan.service.KaryawanService;

import java.util.ArrayList;
import java.util.List;

@Service
public class KaryawanImplement implements KaryawanService {

    static List<Karyawan> listKaryawan = new ArrayList<>();

    @Override
    public Karyawan save(Karyawan obj) {
        obj.setId(obj.getId());
        return obj;
    }

    @Override
    public Karyawan update(Karyawan obj) {
        for (Karyawan dataKaryawan : listKaryawan){
            if(obj.getId().equals(dataKaryawan.getId())){
                Karyawan dataUpdate = new Karyawan();
                dataUpdate.setId(dataKaryawan.getId());
                dataUpdate.setNama(dataKaryawan.getNama());
                dataUpdate.setJk(dataKaryawan.getJk());
                dataUpdate.setUmur(dataKaryawan.getUmur());
                dataUpdate.setAlamat(dataKaryawan.getAlamat());
                listKaryawan.remove(dataKaryawan);
                listKaryawan.add(dataUpdate);
                return  dataUpdate;
            }
        }
        return null;
    }

    @Override
    public List<Karyawan> deleted(Long id) {
        for (Karyawan dataKaryawan : listKaryawan){
            if(id.equals(dataKaryawan.getId())){
                listKaryawan.remove(dataKaryawan);
                return  listKaryawan;
            }
        }
        return  null;
    }

    @Override
    public List<Karyawan> dataKywn(int row, int page) {
        return listKaryawan;
    }

    @Override
    public Karyawan findById(long obj) {
        for(Karyawan dataKaryawan : listKaryawan){
            if(obj == dataKaryawan.getId()){
                return dataKaryawan;
            }
        }
        return null;
    }
}
