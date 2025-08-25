package br.univille.observer;

import java.util.ArrayList;

public class Publisher{

    //array list cresce dinâmicamente e é mais fácil de usar enquanto o array tem tamanho fixo
    
    //private Subscriber[] subscribers = new Subscriber[10];
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    //principios solid utilizados na linha acima: segregação de interfaces e responsabilidade única
    private String mainState;

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    public void notifySubscribers() {
        for (var subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }
    public String getMainState() {
        return mainState;
    }
    public void setMainState(String mainState) {
        this.mainState = mainState;
    }
}
