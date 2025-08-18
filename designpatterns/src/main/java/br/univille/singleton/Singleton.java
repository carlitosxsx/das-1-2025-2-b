package br.univille.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar instanciamento externo
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Fazendo algo com a instância singleton.");
    }

}