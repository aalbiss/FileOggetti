import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainScrittura {
    public static void main(String[] args) {

        File fileAlunni = new File("objectalunni.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fileAlunni);
            oos= new ObjectOutputStream(fos);

            for (int i = 1; i < 3; i++) {
                Alunno al = new Alunno("Cog " + i, "Nom " + i, 1947+(int)(Math.random()*20));
                System.out.println("Scrittura: " + al);
                oos.writeObject(al);
            }

        } catch (IOException e) {
            e.printStackTrace();
        //ALTRI CATCH
        }finally {
            try {
                oos.flush();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
