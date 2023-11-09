import java.util.Scanner;

public class Vendita {
    private static int idProgressivo = 1;
    private ArrayList<Giocattolo> giocattoli; 
    private ArrayList<Cliente> clienti;
    private int idScontrino;
    private int idGiocattolo;
    private int idCliente;

    //metodo "scontrino" ??
    public Vendita(int idGiocattolo, int idCliente){
        this.idScontrino = idProgressivo;
        this.idGiocattolo = idGiocattolo;
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }
    public int getIdGiocattolo() {
        return idGiocattolo;
    }
    public int getIdScontrino() {
        return idScontrino;
    }


    @Override
    public String toString(){
        return "Scontrino numero: " + this.idScontrino + "\n prodotto acquistato: " + this.idGiocattolo + "\n Cliente: " + this.idCliente;
    }


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
