import java.io.*;

class souris extends Animal {
    public souris(String nom) {
        super(nom);
    }

    public souris(String nom, int age) {
        super(nom, age);
    }

    public souris(String nom, int age, boolean boule) {
        super(nom, age, boule);
    }

    public souris() {
        super();
    }

    public void affiche() {
        System.out.println("\n...Koouikkk (bruit de souris)");
        super.affiche();
    }

    public void save(BufferedWriter buff)throws IOException{
        buff.write("SOURIS");
        buff.write(";");
        super.save(buff);
    }
}