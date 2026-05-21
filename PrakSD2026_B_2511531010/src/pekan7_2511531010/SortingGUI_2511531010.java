package pekan7_2511531010;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class SortingGUI_2511531010 extends JFrame {
    private JTextField txtNama_1010;
    private JTextField txtNim_1010;
    private JTextField txtProdi_1010;
    private JButton btnTambah_1010;
    private JButton btnHapus_1010;
    private JButton btnSorting_1010;
    private JComboBox<String> cbSorting_1010;
    private JTable table_1010;
    private DefaultTableModel model_1010;
    private JTextArea areaProses_1010;
    private ArrayList<Mahasiswa_2511531010> list_1010 = new ArrayList<>();

    public SortingGUI_2511531010() {
        setTitle("GUI Sorting Mahasiswa");
        setSize(950, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Color bgColor_1010 = new Color(15, 23, 42);
        Color panelColor_1010 = new Color(30, 41, 59);
        Color accent_1010 = new Color(0, 191, 255);

        JPanel mainPanel_1010 = new JPanel(new BorderLayout());
        mainPanel_1010.setBackground(bgColor_1010);

        // HEADER
        JLabel title_1010 = new JLabel("SORTING DATA MAHASISWA", JLabel.CENTER);
        title_1010.setFont(new Font("Poppins", Font.BOLD, 28));
        title_1010.setForeground(Color.WHITE);
        title_1010.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

        mainPanel_1010.add(title_1010, BorderLayout.NORTH);

        // PANEL KIRI
        JPanel leftPanel_1010 = new JPanel();
        leftPanel_1010.setBackground(panelColor_1010);
        leftPanel_1010.setPreferredSize(new Dimension(300, 0));
        leftPanel_1010.setLayout(new GridLayout(12, 1, 10, 10));
        leftPanel_1010.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        txtNama_1010 = new JTextField();
        txtNim_1010 = new JTextField();
        txtProdi_1010 = new JTextField();

        cbSorting_1010 = new JComboBox<>();
        cbSorting_1010.addItem("Insertion Sort");
        cbSorting_1010.addItem("Selection Sort");
        cbSorting_1010.addItem("Bubble Sort");

        btnTambah_1010 = new JButton("Tambah Data");
        btnHapus_1010 = new JButton("Hapus Semua");
        btnSorting_1010 = new JButton("Mulai Sorting");

        styleButton_1010(btnTambah_1010, accent_1010);
        styleButton_1010(btnHapus_1010, Color.RED);
        styleButton_1010(btnSorting_1010, new Color(34, 197, 94));

        leftPanel_1010.add(label_1010("Nama Mahasiswa"));
        leftPanel_1010.add(txtNama_1010);

        leftPanel_1010.add(label_1010("NIM"));
        leftPanel_1010.add(txtNim_1010);

        leftPanel_1010.add(label_1010("Program Studi"));
        leftPanel_1010.add(txtProdi_1010);

        leftPanel_1010.add(label_1010("Pilih Sorting"));
        leftPanel_1010.add(cbSorting_1010);

        leftPanel_1010.add(btnTambah_1010);
        leftPanel_1010.add(btnHapus_1010);
        leftPanel_1010.add(btnSorting_1010);

        // PANEL TENGAH
        JPanel centerPanel_1010 = new JPanel(new BorderLayout());
        centerPanel_1010.setBackground(bgColor_1010);

        model_1010 = new DefaultTableModel();
        model_1010.addColumn("Nama");
        model_1010.addColumn("NIM");
        model_1010.addColumn("Program Studi");

        table_1010 = new JTable(model_1010);
        table_1010.setRowHeight(25);
        table_1010.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        JScrollPane scrollTable_1010 = new JScrollPane(table_1010);

        areaProses_1010 = new JTextArea();
        areaProses_1010.setBackground(panelColor_1010);
        areaProses_1010.setForeground(Color.WHITE);
        areaProses_1010.setFont(new Font("Consolas", Font.PLAIN, 14));

        JScrollPane scrollArea_1010 = new JScrollPane(areaProses_1010);
        scrollArea_1010.setPreferredSize(new Dimension(0, 220));

        centerPanel_1010.add(scrollTable_1010, BorderLayout.CENTER);
        centerPanel_1010.add(scrollArea_1010, BorderLayout.SOUTH);

        mainPanel_1010.add(leftPanel_1010, BorderLayout.WEST);
        mainPanel_1010.add(centerPanel_1010, BorderLayout.CENTER);
        add(mainPanel_1010);

        btnTambah_1010.addActionListener(e_1010 -> tambahData_1010());
        btnHapus_1010.addActionListener(e_1010 -> hapusData_1010());
        btnSorting_1010.addActionListener(e_1010 -> prosesSorting_1010());
    }

    private JLabel label_1010(String text_1010) {
        JLabel lbl_1010 = new JLabel(text_1010);
        lbl_1010.setForeground(Color.WHITE);
        lbl_1010.setFont(new Font("Segoe UI", Font.BOLD, 14));
        return lbl_1010;
    }
    private void styleButton_1010(JButton btn_1010, Color color_1010) {
        btn_1010.setBackground(color_1010);
        btn_1010.setForeground(Color.WHITE);
        btn_1010.setFocusPainted(false);
        btn_1010.setFont(new Font("Segoe UI", Font.BOLD, 14));
    }
    private void tambahData_1010() {
        String nama_1010 = txtNama_1010.getText();
        String nim_1010 = txtNim_1010.getText();
        String prodi_1010 = txtProdi_1010.getText();

        Mahasiswa_2511531010 mhs_1010 =
                new Mahasiswa_2511531010(nama_1010, nim_1010, prodi_1010);
        list_1010.add(mhs_1010);
        model_1010.addRow(new Object[]{
                nama_1010, nim_1010, prodi_1010
        });

        txtNama_1010.setText("");
        txtNim_1010.setText("");
        txtProdi_1010.setText("");
    }

    private void hapusData_1010() {
        list_1010.clear();
        model_1010.setRowCount(0);
        areaProses_1010.setText("");
    }
    private void prosesSorting_1010() {
        areaProses_1010.setText("");
        String pilihan_1010 =
                cbSorting_1010.getSelectedItem().toString();
        ArrayList<Mahasiswa_2511531010> temp_1010 =
                new ArrayList<>(list_1010);
        if (pilihan_1010.equals("Insertion Sort")) {
            insertionSort(temp_1010);
        }
        else if (pilihan_1010.equals("Selection Sort")) {
            selectionSort(temp_1010);
        }
        else {
            bubbleSort(temp_1010);
        }

        model_1010.setRowCount(0);

        for (Mahasiswa_2511531010 m_1010 : temp_1010) {

            model_1010.addRow(new Object[]{
                    m_1010.getNama_1010(),
                    m_1010.getNim_1010(),
                    m_1010.getProdi_1010()
            });
        }
    }

    // INSERTION SORT
    private void insertionSort(ArrayList<Mahasiswa_2511531010> data_1010) {
        areaProses_1010.append("=== INSERTION SORT ===\n\n");
        for (int i_1010 = 1; i_1010 < data_1010.size(); i_1010++) {
            Mahasiswa_2511531010 key_1010 = data_1010.get(i_1010);
            int j_1010 = i_1010 - 1;
            while (j_1010 >= 0 &&
                    data_1010.get(j_1010).getNama_1010()
                    .compareToIgnoreCase(key_1010.getNama_1010()) > 0) {
                data_1010.set(j_1010 + 1, data_1010.get(j_1010));
                j_1010--;
            }

            data_1010.set(j_1010 + 1, key_1010);

            tampilLangkah(data_1010, i_1010);
        }
    }

    // SELECTION SORT
    private void selectionSort(ArrayList<Mahasiswa_2511531010> data_1010) {
        areaProses_1010.append("=== SELECTION SORT ===\n\n");
        for (int i_1010 = 0; i_1010 < data_1010.size() - 1; i_1010++) {
            int min_1010 = i_1010;
            for (int j_1010 = i_1010 + 1; j_1010 < data_1010.size(); j_1010++) {
                if (data_1010.get(j_1010).getNama_1010()
                        .compareToIgnoreCase(
                                data_1010.get(min_1010).getNama_1010()) < 0) {
                    min_1010 = j_1010;
                }
            }

            Mahasiswa_2511531010 temp_1010 = data_1010.get(i_1010);
            data_1010.set(i_1010, data_1010.get(min_1010));
            data_1010.set(min_1010, temp_1010);

            tampilLangkah(data_1010, i_1010 + 1);
        }
    }

    // BUBBLE SORT
    private void bubbleSort(ArrayList<Mahasiswa_2511531010> data_1010) {
        areaProses_1010.append("=== BUBBLE SORT ===\n\n");
        for (int i_1010 = 0; i_1010 < data_1010.size() - 1; i_1010++) {
            for (int j_1010 = 0; j_1010 < data_1010.size() - i_1010 - 1; j_1010++) {
                if (data_1010.get(j_1010).getNama_1010()
                        .compareToIgnoreCase(
                                data_1010.get(j_1010 + 1).getNama_1010()) > 0) {
                    Mahasiswa_2511531010 temp_1010 = data_1010.get(j_1010);
                    data_1010.set(j_1010, data_1010.get(j_1010 + 1));
                    data_1010.set(j_1010 + 1, temp_1010);
                }
            }
            tampilLangkah(data_1010, i_1010 + 1);
        }
    }

    private void tampilLangkah(
            ArrayList<Mahasiswa_2511531010> data_1010,
            int langkah_1010) {
        areaProses_1010.append("Langkah " + langkah_1010 + " : ");
        for (Mahasiswa_2511531010 m_1010 : data_1010) {
            areaProses_1010.append(
                    m_1010.getNama_1010() + " | ");
        }

        areaProses_1010.append("\n");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SortingGUI_2511531010().setVisible(true);
        });
    }
}