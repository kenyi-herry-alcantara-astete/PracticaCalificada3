package Solid.LSP;

public class GuestUserPayment implements NewPayment{
    public String name;
    public GuestUserPayment() {
        this.name = "guest";
    }
    @Override
    public void newPayment(){
        System.out.println("Procesando de "+name+ "pago actual request.");
    }
}

