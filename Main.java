package Observer;



public class Main
{
    public static void main(String[] args)
    {
    PhoneData phoneData = new PhoneData();

    Cliente1 cliente1 = new Cliente1(phoneData);
    Cliente2 cliente2 = new Cliente2(phoneData);
    Cliente3 cliente3 = new Cliente3(phoneData);

    phoneData.setValues(3);
    System.out.println("Después de 3 días ----");
    phoneData.setValues(1);
    System.out.println("Después de 1 semana ----");
    phoneData.setValues(0);



    }
}

