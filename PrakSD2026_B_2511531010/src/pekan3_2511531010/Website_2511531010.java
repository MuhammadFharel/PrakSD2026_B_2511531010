package pekan3_2511531010;

public class Website_2511531010 {
    
    private String judul_1010;
    private String url_1010;

    // constructor
    public Website_2511531010(String judul, String url) {
        this.judul_1010 = judul;
        this.url_1010 = url;
    }

    // getter
    public String getJudul_1010() {
        return judul_1010;
    }

    public String getUrl_1010() {
        return url_1010;
    }

    // setter
    public void setJudul_1010(String judul) {
        this.judul_1010 = judul;
    }

    public void setUrl_1010(String url) {
        this.url_1010 = url;
    }

    @Override
    public String toString() {
        return "Judul: " + judul_1010 + ", URL: " + url_1010;
    }
}