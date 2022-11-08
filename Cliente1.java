package Observer;

public class Cliente1 implements Observer, DisplayElement {

    private int phones;
    private Subject phoneData;

    public Cliente1(Subject phoneData){
        this.phoneData = phoneData;
        phoneData.registerObserver(this);

    }
    public void update(int phones)
    {
        this.phones = phones;
        display();

    }

    public void display()
    {
        if(phones == 0)
        {
            System.out.println("*Email Cliente 1* Hola! Te informamos que ya no tenemos teléfonos disponibles");
        }
        if(phones ==1)
        {
            System.out.println("*Email Cliente 1* Hola! Tenemos solo: " + phones + " teléfono disponible, te esperamos!");
        }else if(phones >=2)
        {
            System.out.println("*Email Cliente 1* Hola! Tenemos disponibles: " + phones + " teléfonos, te esperamos!");
        }

    }


}
