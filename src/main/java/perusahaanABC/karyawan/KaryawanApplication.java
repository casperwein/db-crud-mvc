package perusahaanABC.karyawan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KaryawanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaryawanApplication.class, args);
		System.out.println("Karyawan Perusahaan ABC");
	}
}
