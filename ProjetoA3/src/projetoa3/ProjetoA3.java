//A3 - 2023 PSC
package projetoa3;
import javax.swing.JFrame;

public class ProjetoA3 {
    public static void main(String[] args) {
        
        
        Pokemon pJanela = new Pokemon();
        pJanela.setVisible(true);
        
        DB db = new DB("bancodados.db");
        db.query("SELECT * FROM pokemon");
        
        while(db.next()) {
            int codigo = db.getInt("codigo");
            String nome = db.getString("nome");
            String cor = db.getString("cor");
            String geracao = db.getString("geracao");
            String tipo = db.getString("tipo");
            System.out.println("Informações: " + codigo + " " + nome + " " + cor + " " + geracao + " " + tipo);
        }
        
        
        
        //Fechar DB
        db.closeConnection();
    }    
}
