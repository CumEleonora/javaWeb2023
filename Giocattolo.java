public class Giocattolo {
    private int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(String nome, double prezzo, int etaConsigliata){
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public double prezzo(){
        return prezzo;
    }
    public int etaConsigliata(){
        return etaConsigliata;
    }

    @Override
    public String toString(){
        String descrizione="";
        descrizione = descrizione + "Giocattolo: " + this.getNome();
        return descrizione;
    }


}
