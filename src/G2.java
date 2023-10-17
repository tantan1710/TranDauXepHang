import java.util.ArrayList;

public class G2 {
    private String name;
    private ArrayList<Figure> figures = new ArrayList<>();

    public G2(String name, ArrayList<Figure> figures) {
        this.name = name;
        this.figures = figures;
    }
    public static void add(G2 g2) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "G2{" +
                "name='" + name + '\'' +
                ", figures=" + figures +
                '}';
    }
}
