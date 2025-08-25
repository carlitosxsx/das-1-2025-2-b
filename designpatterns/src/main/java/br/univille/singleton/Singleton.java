package br.univille.singleton;

public class Singleton {

    private static Singleton instance;
    private String segredo;

    private Singleton() {
        System.out.println("Instancia criada");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getSegredo() {
        return segredo;
    }
    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }

}