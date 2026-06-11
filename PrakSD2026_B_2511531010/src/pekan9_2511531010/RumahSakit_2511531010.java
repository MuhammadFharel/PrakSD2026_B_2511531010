package pekan9_2511531010;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RumahSakit_2511531010 extends JFrame {

    private JComboBox<String> cmbStart_1010, cmbGoal_1010;
    private JTextArea txtHasil_1010;
    private GraphPanel_1010 graphPanel_1010;

    private Map<String, java.util.List<String>> graph_1010 = new LinkedHashMap<>();
    private Set<String> visited_1010 = new LinkedHashSet<>();
    private String mode_1010 = "";
    
    public void displayGraph_1010() {
        graphPanel_1010.repaint();
    }

    public void displayPath_1010(String hasil_1010) {
        txtHasil_1010.setText(hasil_1010);
    }

    public RumahSakit_2511531010() {
        initGraph_1010();

        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(1200, 850);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS", SwingConstants.CENTER);
        title.setBounds(0, 0, 1200, 60);
        title.setOpaque(true);
        title.setBackground(new Color(25,60,120));
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        add(title);

        add(new JLabel("Lokasi Awal :")).setBounds(30,80,100,25);
        cmbStart_1010 = new JComboBox<>(graph_1010.keySet().toArray(new String[0]));
        cmbStart_1010.setBounds(140,80,220,25);
        add(cmbStart_1010);

        add(new JLabel("Lokasi Tujuan :")).setBounds(30,120,100,25);
        cmbGoal_1010 = new JComboBox<>(graph_1010.keySet().toArray(new String[0]));
        cmbGoal_1010.setBounds(140,120,220,25);
        add(cmbGoal_1010);

        JButton bfs = new JButton("BFS");
        bfs.setBounds(500,80,100,35);
        add(bfs);

        JButton dfs = new JButton("DFS");
        dfs.setBounds(620,80,100,35);
        add(dfs);

        JButton reset = new JButton("RESET");
        reset.setBounds(740,80,100,35);
        add(reset);

        graphPanel_1010 = new GraphPanel_1010();
        graphPanel_1010.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));
        graphPanel_1010.setBounds(30,170,1100,380);
        add(graphPanel_1010);

        txtHasil_1010 = new JTextArea();
        txtHasil_1010.setEditable(false);
        JScrollPane sp = new JScrollPane(txtHasil_1010);
        sp.setBounds(30,580,1100,180);
        add(sp);

        bfs.addActionListener(e -> BFS_1010());
        dfs.addActionListener(e -> DFS_1010());
        reset.addActionListener(e -> resetGraph_1010());
    }

    private void initGraph_1010(){
        addEdge("Parkiran","Administrasi");
        addEdge("Administrasi","Laboratorium");
        addEdge("Laboratorium","Radiologi");
        addEdge("Radiologi","Ruang Operasi");
        addEdge("Ruang Operasi","ICU");
        addEdge("ICU","Rawat Inap");
        addEdge("IGD","Rawat Inap");
        addEdge("IGD","Radiologi");
        addEdge("IGD","Rawat Jalan");
        addEdge("Rawat Jalan","Apotek");
        addEdge("Apotek","Laboratorium");
        addEdge("Rawat Jalan","Parkiran");
        addEdge("Administrasi","Apotek");
        addEdge("Rawat Inap","Radiologi");
        addEdge("ICU","Radiologi");
    }

    private void addEdge(String a,String b){
        graph_1010.putIfAbsent(a,new ArrayList<>());
        graph_1010.putIfAbsent(b,new ArrayList<>());
        graph_1010.get(a).add(b);
        graph_1010.get(b).add(a);
    }

    public void BFS_1010(){ search(true); }
    public void DFS_1010(){ search(false); }

    private void search(boolean bfs){
        String start=(String)cmbStart_1010.getSelectedItem();
        String goal=(String)cmbGoal_1010.getSelectedItem();

        Map<String,String> parent=new LinkedHashMap<>();
        visited_1010.clear();

        if(bfs){
            mode_1010="BFS";
            Queue<String> q=new LinkedList<>();
            q.add(start); visited_1010.add(start);
            while(!q.isEmpty()){
                String c=q.poll();
                if(c.equals(goal)) break;
                for(String n:graph_1010.get(c))
                    if(!visited_1010.contains(n)){
                        visited_1010.add(n); parent.put(n,c); q.add(n);
                    }
            }
        }else{
            mode_1010="DFS";
            Stack<String> s=new Stack<>();
            s.push(start);
            while(!s.isEmpty()){
                String c=s.pop();
                if(!visited_1010.contains(c)){
                    visited_1010.add(c);
                    if(c.equals(goal)) break;
                    for(String n:graph_1010.get(c))
                        if(!visited_1010.contains(n)){
                            parent.put(n,c); s.push(n);
                        }
                }
            }
        }

        ArrayList<String> path=new ArrayList<>();
        String cur=goal;
        while(cur!=null){ path.add(cur); cur=parent.get(cur); }
        Collections.reverse(path);

        displayPath_1010(
        	    "Hasil Pencarian : " + mode_1010 +
        	    "\n\nJalur : " + path +
        	    "\n\nNode Dikunjungi : " + visited_1010 +
        	    "\n\nJumlah Node Dikunjungi : " + visited_1010.size()
        	);

        	displayGraph_1010();
    }

    public void resetGraph_1010(){
        visited_1010.clear();
        mode_1010="";
        txtHasil_1010.setText("");
        graphPanel_1010.repaint();
    }

    class GraphPanel_1010 extends JPanel{
        Map<String,Point> p=new HashMap<>();
        GraphPanel_1010(){
            p.put("Parkiran",new Point(150,60));
            p.put("Administrasi",new Point(450,60));
            p.put("Rawat Jalan",new Point(120,150));
            p.put("Apotek",new Point(300,150));
            p.put("Laboratorium",new Point(500,150));
            p.put("IGD",new Point(180,260));
            p.put("Radiologi",new Point(500,260));
            p.put("Rawat Inap",new Point(150,340));
            p.put("ICU",new Point(320,340));
            p.put("Ruang Operasi",new Point(550,340));
        }
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            for(String a:graph_1010.keySet())
                for(String b:graph_1010.get(a)){
                    Point p1=p.get(a), p2=p.get(b);
                    g.drawLine(p1.x,p1.y,p2.x,p2.y);
                }
            for(String n:p.keySet()){
                Point pt=p.get(n);
                if(visited_1010.contains(n)){
                    g.setColor(mode_1010.equals("DFS")?Color.ORANGE:Color.GREEN);
                } else g.setColor(Color.LIGHT_GRAY);
                g.fillOval(pt.x-25,pt.y-25,50,50);
                g.setColor(Color.BLACK);
                g.drawOval(pt.x-25,pt.y-25,50,50);
                g.drawString(n, pt.x-40, pt.y-30);
            }
        }
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new RumahSakit_2511531010().setVisible(true));
    }
}