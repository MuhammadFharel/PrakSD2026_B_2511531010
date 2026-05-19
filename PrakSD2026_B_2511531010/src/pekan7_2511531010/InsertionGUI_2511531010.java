package pekan7_2511531010;

import java.awt.EventQueue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511531010 extends JFrame {
	private static final long serialVersionUID = 1L;
    private int[] array_1010;
    private JLabel[] labelArray_1010;
    private JButton stepButton_1010, resetButton_1010, setButton_1010;
    private JTextField inputField_1010;
    private JPanel panelArray_1010;
    private JTextArea stepArea_1010;
    
    private int i_1010 = 1, j_1010;
    private boolean sorting_1010 = false;
    private int stepCount_1010 = 1;


	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511531010() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
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
        stepArea_1010 = new JTextArea(8, 60);
        stepArea_1010.setEditable(false);
        stepArea_1010.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_1010 = new JScrollPane(stepArea_1010);

        // Tambahkan panel ke frame
        add(inputPanel_1010, BorderLayout.NORTH);
        add(panelArray_1010, BorderLayout.CENTER);
        add(controlPanel_1010, BorderLayout.SOUTH);
        add(scrollPane_1010, BorderLayout.EAST);

        // Event Set Array
        setButton_1010.addActionListener(e_1010 -> setArrayFromInput());

        // Event Langkah Selanjutnya
        stepButton_1010.addActionListener(e_1010 -> performStep());

        // Event Reset
        resetButton_1010.addActionListener(e_1010 -> reset());
	}
	private void setArrayFromInput() {
        String text_1010 = inputField_1010.getText().trim();
        if (text_1010.isEmpty()) return;
        
        String[] parts_1010 = text_1010.split(",");
        array_1010 = new int[parts_1010.length];
        
        try {
            for (int k_1010 = 0; k_1010 < parts_1010.length; k_1010++) {
                array_1010[k_1010] = Integer.parseInt(parts_1010[k_1010].trim());
            }
        } catch (NumberFormatException e_1010) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan\n"
                    + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_1010 = 1;
        stepCount_1010 = 1;
        sorting_1010 = true;
        stepButton_1010.setEnabled(true);
        stepArea_1010.setText("");
        panelArray_1010.removeAll();
        
        labelArray_1010 = new JLabel[array_1010.length];
        for (int k_1010 = 0; k_1010 < array_1010.length; k_1010++) {
            labelArray_1010[k_1010] = new JLabel(String.valueOf(array_1010[k_1010]));
            labelArray_1010[k_1010].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_1010[k_1010].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_1010[k_1010].setPreferredSize(new Dimension(50, 50));
            labelArray_1010[k_1010].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_1010.add(labelArray_1010[k_1010]);
        }
        panelArray_1010.revalidate();
        panelArray_1010.repaint();
    }
	private void performStep() {
		if (i_1010 < array_1010.length && sorting_1010) {
            int key_1010 = array_1010[i_1010];
            j_1010 = i_1010 - 1;
            
            StringBuilder stepLog_1010 = new StringBuilder();
            stepLog_1010.append("Langkah ").append(stepCount_1010)
                        .append(": Memasukkan ").append(key_1010).append("\n");
            
            while (j_1010 >= 0 && array_1010[j_1010] > key_1010) {
                array_1010[j_1010 + 1] = array_1010[j_1010];
                j_1010--;
            }
            
            array_1010[j_1010 + 1] = key_1010;
            
            updateLabels();
            stepLog_1010.append("Hasil: ").append(arrayToString(array_1010)).append("\n\n");
            stepArea_1010.append(stepLog_1010.toString());
            
            i_1010++;
            stepCount_1010++;
            
            if (i_1010 == array_1010.length) {
                sorting_1010 = false;
                stepButton_1010.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting selesai!");
            }
        }
	}
	private void updateLabels() {
        for (int k_1010 = 0; k_1010 < array_1010.length; k_1010++) {
            labelArray_1010[k_1010].setText(String.valueOf(array_1010[k_1010]));
        }
    }

    private void reset() {
        inputField_1010.setText("");
        panelArray_1010.removeAll();
        panelArray_1010.revalidate();
        panelArray_1010.repaint();
        stepArea_1010.setText("");
        stepButton_1010.setEnabled(false);
        sorting_1010 = false;
        i_1010 = 1;
        stepCount_1010 = 1;
    }

    private String arrayToString(int[] arr_1010) {
        StringBuilder sb_1010 = new StringBuilder();
        for (int k_1010 = 0; k_1010 < arr_1010.length; k_1010++) {
            sb_1010.append(arr_1010[k_1010]);
            if (k_1010 < arr_1010.length - 1) {
                sb_1010.append(", ");
            }
        }
        return sb_1010.toString();
    }

    public static void main(String[] args_1010) {
        SwingUtilities.invokeLater(() -> {
            InsertionGUI_2511531010 gui_1010 = new InsertionGUI_2511531010();
            gui_1010.setVisible(true);
        });
    }

}
