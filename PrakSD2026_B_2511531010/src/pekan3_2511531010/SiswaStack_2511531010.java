package pekan3_2511531010;

import java.util.ArrayList;

class Siswa_2511531010 {
    String nama;
    int nim;

    public Siswa_2511531010(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}

public class SiswaStack_2511531010 {
    private ArrayList<Siswa_2511531010> stack;

    public SiswaStack_2511531010() {
        stack = new ArrayList<>();
    }

    public void push_2511531010(Siswa_2511531010 mhs) {
        stack.add(mhs);
    }

    public Siswa_2511531010 pop_2511531010() {
        if (!isEmpty_2511531010()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public Siswa_2511531010 peek_2511531010() {
        if (!isEmpty_2511531010()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty_2511531010() {
        return stack.isEmpty();
    }

    public void tampilkanSiswa_2511531010() {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    public static void main(String[] args) {
        SiswaStack_2511531010 studentStack_2511531010 = new SiswaStack_2511531010();

        Siswa_2511531010 mhs1 = new Siswa_2511531010("Ali", 1);
        Siswa_2511531010 mhs2 = new Siswa_2511531010("Boby", 2);
        Siswa_2511531010 mhs3 = new Siswa_2511531010("Charles", 3);

        studentStack_2511531010.push_2511531010(mhs1);
        studentStack_2511531010.push_2511531010(mhs2);
        studentStack_2511531010.push_2511531010(mhs3);

        System.out.println("Siswa di dalam stack:");
        studentStack_2511531010.tampilkanSiswa_2511531010();

        System.out.println("Siswa teratas: " + studentStack_2511531010.peek_2511531010());
        System.out.println("Mengeluarkan siswa teratas dari stack: " + studentStack_2511531010.pop_2511531010());
        System.out.println("Daftar siswa setelah di pop:");
        studentStack_2511531010.tampilkanSiswa_2511531010();
    }
}