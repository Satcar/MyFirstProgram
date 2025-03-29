import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double x, y, result;
        x = Double.parseDouble(JOptionPane.showInputDialog("Enter x"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Enter y"));
        result = Math.sqrt((x*x + y*y));
        System.out.println(result);

    }
}