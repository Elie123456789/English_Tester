import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        {
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Dictionnay"))));
            System.out.println("Inserer");

            Mot m = new Mot("Bonjour", "Hello");
            out.writeObject(m);
            System.out.println("Inserer");
            out.writeObject(new Mot("Salut", "Hello"));
            System.out.println("Inserer");
            out.close();
        }
        {
            ObjectInputStream in = null;
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Dictionnay"))));

            for (Mot m : in){
                Mot bo = (Mot) in.readObject();
                System.out.println(m.getFR());
                System.out.println(m.getEN());
            }
            in.close();
        }
    }
}

/*
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        {
//            ObjectOutputStream out = null;
//            out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("Dictionnay"))));
//
//            BigObject bo = new BigObject();
//            bo.bijour = 12;
//            bo.salamalecoum = 37;
//            bo.poulets = new String[]{"salut", "moutmout", "mr nounours", "gronours"};
//            out.writeObject(bo);
//
//            out.close();
        }
        {
            ObjectInputStream in = null;
            in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("Dictionnay"))));

            BigObject bo = (BigObject) in.readObject();
            System.out.println(bo.bijour);
            System.out.println(bo.salamalecoum);
            for(String s : bo.poulets) System.out.println(s);

            in.close();
        }
    }

    public static class BigObject implements Serializable {
        static final long serialVersionUID = 0;

        private int bijour, salamalecoum;

        private String[] poulets;
    }
}
*/