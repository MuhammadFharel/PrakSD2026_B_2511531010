package pekan2_2511531010;

public class Musik_2511531010 {
    
    private String judul_1010;
    private String penyanyi_1010;
    private int durasi_1010;

    // constructor
    public Musik_2511531010(String judul, String penyanyi, int durasi) {
        this.judul_1010 = judul;
        this.penyanyi_1010 = penyanyi;
        this.durasi_1010 = durasi;
    }

    // getter
    public String getJudul_1010() {
        return judul_1010;
    }

    public String getPenyanyi_1010() {
        return penyanyi_1010;
    }

    public int getDurasi_1010() {
        return durasi_1010;
    }

    // setter
    public void setJudul_1010(String judul) {
        this.judul_1010 = judul;
    }

    public void setPenyanyi_1010(String penyanyi) {
        this.penyanyi_1010 = penyanyi;
    }

    public void setDurasi_1010(int durasi) {
        this.durasi_1010 = durasi;
    }
}