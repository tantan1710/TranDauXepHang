import java.util.ArrayList;

public class SummonRift {
    private static ArrayList<SKT> skt = new ArrayList<>();
    private static ArrayList<G2> g2 = new ArrayList<>();
    public static void addSkt(String name, ArrayList<Figure> figure){
        skt.add(new SKT(name, figure));
    }

    public static void addG2(String name, ArrayList<Figure> figure){
        g2.add(new G2(name, figure));
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "SKT=" + skt +
                "G2=" + g2 +
                '}';
    }
}
