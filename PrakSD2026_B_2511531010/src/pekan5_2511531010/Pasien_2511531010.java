package pekan5_2511531010;

public class Pasien_2511531010 {
    String namaPasien_1010;
    String penyakit_1010;
    int nomorAntrian_1010;
    Pasien_2511531010 next_1010;
    // Constructor
    public Pasien_2511531010(String namaPasien_1010, String penyakit_1010, int nomorAntrian_1010) {
        this.namaPasien_1010 = namaPasien_1010;
        this.penyakit_1010 = penyakit_1010;
        this.nomorAntrian_1010 = nomorAntrian_1010;
        this.next_1010 = null;
    }
    // Getter
    public String getNamaPasien_1010() {
        return namaPasien_1010;
    }
    public String getPenyakit_1010() {
        return penyakit_1010;
    }
    public int getNomorAntrian_1010() {
        return nomorAntrian_1010;
    }
    public Pasien_2511531010 getNext_1010() {
        return next_1010;
    }
    // Setter
    public void setNext_1010(Pasien_2511531010 next_1010) {
        this.next_1010 = next_1010;
    }
}