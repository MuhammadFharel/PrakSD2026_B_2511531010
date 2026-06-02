package pekan8_2511531010;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511531010 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_1010;
    private JLabel[] labelArray_1010;
    private JButton stepButton_1010, resetButton_1010, setButton_1010;
    private JTextField inputField_1010;
    private JPanel panelArray_1010;
    private JTextArea stepArea_1010;
    
    // Variabel pendukung algoritma langkah demi langkah Merge Sort
    private Queue<int[]> mergeQueue_1010 = new LinkedList<>();
    private int stepCount_1010 = 1;
    private boolean isMerging_1010 = false;
    private boolean copying_1010 = false;
    
    private int left_1010, mid_1010, right_1010;
    private int[] temp_1010;
    private int i_1010, j_1010, k_1010;

    /**
     * Create the frame.
     */
    public MergeSortGUI_2511531010() {
        setTitle("Merge Sort Langkah per Langkah");
        setSize(750, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_1010 = new JPanel(new FlowLayout());
        inputField_1010 = new JTextField(30);
        setButton_1010 = new JButton("Set Array");
        inputPanel_1010.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_1010.add(inputField_1010);
        inputPanel_1010.add(setButton_1010);

        // Panel array visual
        panelArray_1010 = new JPanel();
        panelArray_1010.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_1010 = new JPanel();
        stepButton_1010 = new JButton("Langkah Selanjutnya");
        resetButton_1010 = new JButton("Reset");
        stepButton_1010.setEnabled(false);
        controlPanel_1010.add(stepButton_1010);
        controlPanel_1010.add(resetButton_1010);
        
        // Area teks untuk log langkah-langkah
        stepArea_1010 = new JTextArea(10, 60);
        stepArea_1010.setEditable(false);
        stepArea_1010.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_1010 = new JScrollPane(stepArea_1010);

        // Tambahkan panel ke frame
        add(inputPanel_1010, BorderLayout.NORTH);
        add(panelArray_1010, BorderLayout.CENTER);
        add(controlPanel_1010, BorderLayout.SOUTH);
        add(scrollPane_1010, BorderLayout.EAST);

        // Event Listeners
        setButton_1010.addActionListener(e_1010 -> setArrayFromInput());
        stepButton_1010.addActionListener(e_1010 -> performStep());
        resetButton_1010.addActionListener(e_1010 -> reset());
    }

    private void generateMergeSteps(int l_1010, int r_1010) {
        if (l_1010 < r_1010) {
            int m_1010 = l_1010 + (r_1010 - l_1010) / 2;
            generateMergeSteps(l_1010, m_1010);
            generateMergeSteps(m_1010 + 1, r_1010);
            mergeQueue_1010.add(new int[]{l_1010, m_1010, r_1010});
        }
    }

    private void setArrayFromInput() {
        String text_1010 = inputField_1010.getText().trim();
        if (text_1010.isEmpty()) return;
        String[] parts_1010 = text_1010.split(",");
        array_1010 = new int[parts_1010.length];
        try {
            for (int i_idx = 0; i_idx < parts_1010.length; i_idx++) {
                array_1010[i_idx] = Integer.parseInt(parts_1010[i_idx].trim());
            }
        } catch (NumberFormatException e_1010) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        labelArray_1010 = new JLabel[array_1010.length];
        panelArray_1010.removeAll();
        for (int i_idx = 0; i_idx < array_1010.length; i_idx++) {
            labelArray_1010[i_idx] = new JLabel(String.valueOf(array_1010[i_idx]));
            labelArray_1010[i_idx].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_1010[i_idx].setOpaque(true);
            labelArray_1010[i_idx].setBackground(Color.WHITE);
            labelArray_1010[i_idx].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_1010[i_idx].setPreferredSize(new Dimension(50, 50));
            labelArray_1010[i_idx].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_1010.add(labelArray_1010[i_idx]);
        }
        
        mergeQueue_1010.clear();
        generateMergeSteps(0, array_1010.length - 1);
        stepButton_1010.setEnabled(true);
        stepArea_1010.setText("");
        stepCount_1010 = 1;
        isMerging_1010 = false;
        panelArray_1010.revalidate();
        panelArray_1010.repaint();
    }

    private void performStep() {
        resetHighlights();
        
        if (!isMerging_1010 && !mergeQueue_1010.isEmpty()) {
            int[] range_1010 = mergeQueue_1010.poll();
            left_1010 = range_1010[0];
            mid_1010 = range_1010[1];
            right_1010 = range_1010[2];
            temp_1010 = new int[right_1010 - left_1010 + 1];
            i_1010 = left_1010;
            j_1010 = mid_1010 + 1;
            k_1010 = 0;
            copying_1010 = false;
            isMerging_1010 = true;
            stepArea_1010.append("Langkah " + stepCount_1010++ + 
                    ": Mulai merge dari " + left_1010 + " ke " + right_1010 + "\n");
            return;
        }
        
        if (isMerging_1010 && !copying_1010) {
            if (i_1010 <= mid_1010 && j_1010 <= right_1010) {
                labelArray_1010[i_1010].setBackground(Color.CYAN);
                labelArray_1010[j_1010].setBackground(Color.CYAN);
                if (array_1010[i_1010] <= array_1010[j_1010]) {
                    temp_1010[k_1010++] = array_1010[i_1010++];
                } else {
                    temp_1010[k_1010++] = array_1010[j_1010++];
                }
                stepArea_1010.append("Langkah " + stepCount_1010++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_1010 <= mid_1010) {
                temp_1010[k_1010++] = array_1010[i_1010++];
                stepArea_1010.append("Langkah " + stepCount_1010++ + ": Salin sisa kiri\n");
                return;
            } else if (j_1010 <= right_1010) {
                temp_1010[k_1010++] = array_1010[j_1010++];
                stepArea_1010.append("Langkah " + stepCount_1010++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying_1010 = true;
                k_1010 = 0;
                return;
            }
        }
        
        if (copying_1010 && k_1010 < temp_1010.length) {
            array_1010[left_1010 + k_1010] = temp_1010[k_1010];
            labelArray_1010[left_1010 + k_1010].setText(String.valueOf(temp_1010[k_1010]));
            labelArray_1010[left_1010 + k_1010].setBackground(Color.GREEN);
            k_1010++;
            stepArea_1010.append("Langkah " + stepCount_1010++ + ": Tempelkan ke array utama\n");
            return;
        }
        
        if (copying_1010 && k_1010 == temp_1010.length) {
            isMerging_1010 = false;
            copying_1010 = false;
        }
        
        if (mergeQueue_1010.isEmpty() && !isMerging_1010) {
            stepArea_1010.append("Selesai.\n");
            stepButton_1010.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights() {
        if (labelArray_1010 == null) return;
        for (JLabel label_1010 : labelArray_1010) {
            label_1010.setBackground(Color.WHITE);
        }
    }

    private void reset() {
        inputField_1010.setText("");
        panelArray_1010.removeAll();
        panelArray_1010.revalidate();
        panelArray_1010.repaint();
        stepArea_1010.setText("");
        stepButton_1010.setEnabled(false);
        mergeQueue_1010.clear();
        isMerging_1010 = false;
        stepCount_1010 = 1;
    }

    public static void main(String[] args_1010) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511531010 gui_1010 = new MergeSortGUI_2511531010();
            gui_1010.setVisible(true);
        });
    }
}