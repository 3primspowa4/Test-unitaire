import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cuisine {
    ArrayList<Commande> commandes=new ArrayList<>();
    public void ajoutCommande(Commande commande){
        if(commande.nourriture==true)
            commandes.add(commande);
    }
}
