package pekan6_2511531010;

public class Lagu_2511531010 {
    String judul_1010;
    String penyanyi_1010;
    Lagu_2511531010 next_1010;
    Lagu_2511531010 prev_1010;

    // constructor
    public Lagu_2511531010(String judul_1010, String penyanyi_1010) {
        this.judul_1010 = judul_1010;
        this.penyanyi_1010 = penyanyi_1010;
        this.next_1010 = null;
        this.prev_1010 = null;
    }
    // getter
    public String getJudul_1010() {
        return judul_1010;
    }
    public String getPenyanyi_1010() {
        return penyanyi_1010;
    }
    // setter
    public void setJudul_1010(String judul) {
        this.judul_1010 = judul;
    }
    public void setPenyanyi_1010(String penyanyi) {
        this.penyanyi_1010 = penyanyi;
    }
}