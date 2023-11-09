public class Inventario {
    private ArrayList<Giocattolo> giocattoli;

    public void addGiocattolo(Giocattolo g){
        giocattoli.add(g);
    }
    public void removeGiocattolo(Giocattolo g){
        giocattoli.remove(g);
    }

    public void stampaInventario(){
        for(Giocattolo g : giocattoli){
            System.out.println(g);
        }
    }
}
