import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainScrittura {
    public static void main(String[] args) {

        try {
            FileOutputStream fo= new FileOutputStream("objectalunni.dat");
            ObjectOutputStream oos= new ObjectOutputStream(fo);

            for (int i = 1; i < 3; i++) {
                Alunno al = new Alunno("Cog " + i, "Nom " + i, 1947+(int)(Math.random()*20));
                System.out.println("Scrittura: " + al);
                oos.writeObject(al);
            }
            oos.flush();
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
