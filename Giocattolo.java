public class Giocattolo {
    private static Integer codiceProgressivo = 1;
    private final int id;
    private String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(String nome, double prezzo, int etaConsigliata){
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
        id = codiceProgressivo;
        codiceProgressivo++;
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
