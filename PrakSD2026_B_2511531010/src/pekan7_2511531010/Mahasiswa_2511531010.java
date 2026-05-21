package pekan7_2511531010;

public class Mahasiswa_2511531010 {
	private String nama_1010;
    private String nim_1010;
    private String prodi_1010;

    public Mahasiswa_2511531010(String nama_1010, String nim_1010, String prodi_1010) {
        this.nama_1010 = nama_1010;
        this.nim_1010 = nim_1010;
        this.prodi_1010 = prodi_1010;
    }

    public String getNama_1010() {
        return nama_1010;
    }

    public String getNim_1010() {
        return nim_1010;
    }

    public String getProdi_1010() {
        return prodi_1010;
    }

    @Override
    public String toString() {
        return nama_1010;
    }
}