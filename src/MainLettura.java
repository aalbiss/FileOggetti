import java.io.*;

public class MainLettura {
        public static void main(String[] args) {
            boolean finito = false;

            while(!finito) {
                try {

                    FileInputStream fis = new FileInputStream("objectalunni.dat");
                    ObjectInputStream ois = new ObjectInputStream(fis);

                    Object ob = ois.readObject();
                    Alunno al = (Alunno) ob;
                    System.out.println("Lettura: " + al);

                    ois.close();

                } catch (EOFException e) {
                    finito = true;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
