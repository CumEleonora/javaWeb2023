public class Cliente {
    private static Integer codiceProgressivo = 1;
    private final int id;
    private String nome;
    private String indirizzoEmail;

    public Cliente(String nome, String indirizzoEmail){
        this.nome = nome;
        this.indirizzoEmail = indirizzoEmail;
        id = codiceProgressivo;
        codiceProgressivo++;
    }


    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getIndirizzoEmail(){
        return indirizzoEmail;
    }

    @Override
    public String toString(){
        String descrizione="";
        descrizione = descrizione + "Cliente: " + this.getNome();
        return descrizione;
    }
}
