package br.univille.observer;

public class Cliente {
    
    public static void main(String[] args) {
        var publisher = new Publisher();
        
        var subscriber1 = new ConcreteSubscribers();
        var subscriber2 = new ConcreteSubscribers();
        
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        
        publisher.setMainState("VAMOS LEVANTAR 🦭");

        publisher.notifySubscribers();
        
        publisher.unsubscribe(subscriber1);

    }

}