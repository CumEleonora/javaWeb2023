import java.util.Scanner;

public class Vendita {
    private ArrayList<Giocattolo> giocattoli; 
    private ArrayList<Cliente> clienti;

    //metodo "scontrino" ??
    
    //creare un nuovo cliente
    public void nuovoCliente(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("inserire nome cliente:  ");
        String nuovoNome =  s.nextLine();

        System.out.println("inserire email cliente:  ");
        String nuovaEmail =  s.nextLine();

        Cliente c = new Cliente(nuovoNome, nuovaEmail);

        clienti.add(c);

    }

    //creare un nuovo giocattolo
    public void nuovoGiocattolo(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("inserire nome giocattolo:  ");
        String nuovoNome =  s.nextLine();

        System.out.println("inserire :  ");
        String nuovaEmail =  s.nextLine();

        Cliente c = new Cliente(nuovoNome, nuovaEmail);

    }

}
