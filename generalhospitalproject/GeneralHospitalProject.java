package generalhospitalproject;
import javax.swing.JFrame;

public class GeneralHospitalProject {

    public static void main(String[] args) {
        
         HomePage homepage = new HomePage ();
        homepage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         homepage.pack();
         homepage.setLocationRelativeTo(null);
         homepage.setVisible(true);
    }
    
}
