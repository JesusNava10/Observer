package Observer;

import java.util.ArrayList;

public class PhoneData implements Subject {
    private ArrayList observers;
    private int phones;


    public PhoneData(){
        observers = new ArrayList();

    }
    public void registerObserver (Observer o){

        observers.add(o);
    }
    public void remove (Observer o)
    {
        int i = observers.indexOf(o);
        if(i>=0)
        {
            observers.remove(i);
        }

    }
    public void notifyObservers()
    {
        for ( int i=0; i<observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(phones);
        }
    }
    public void valuesChanged(){
        notifyObservers();
    }

    public void setValues (int phones){
        this.phones = phones;
        valuesChanged();

    }




}
