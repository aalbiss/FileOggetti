import java.io.*;

public class MainLettura {
    public static void main(String[] args) {
        boolean finito = false;
        File fileAlunni = new File("objectalunni.dat");
        ObjectInputStream ois  = null;
        FileInputStream fis = null;

        try {

            fis = new FileInputStream(fileAlunni);
            ois = new ObjectInputStream(fis);

            while (!finito) {
                Object ob = ois.readObject();
                Alunno al = (Alunno) ob;
                System.out.println("Lettura: " + al);
            }

        } catch (EOFException e) {
            finito = true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
