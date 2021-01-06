public class Principale {

    private Date d;
    private CLInput cli;
    private int giorno1;
    private int mese1;
    private int anno1;
    private int giorno2;
    private int mese2;
    private int anno2;

    public Principale() throws Exception {
        cli = new CLInput();
        d = new Date(giorno1,mese1,anno1);
        giorno1 = cli.readInt("inserire il giorno: ");
        mese1 = cli.readInt("inserire il mese: ");
        anno1 = cli.readInt("inserire l'anno: ");
    }

    public float Scelta(){
        float scelta;
        scelta = cli.readFloat("inserire 1 se si vuole fare la differenza di date, 2 se si vuole sommare un numero di giorni ad una data: ");
        return scelta;
    }

    public float Somma() throws Exception {
        float somma = 0;
        int numGiorni = cli.readInt("inserire il numero di giorni da sommare: ");
        somma = Date.sommaGiorni(numGiorni);
        return somma;
    }
    public String Differenza() throws Exception {
        giorno2 = cli.readInt("inserire il giorno: ");
        mese2 = cli.readInt("inserire il mese: ");
        anno2 = cli.readInt("inserire l'anno: ");
        String differenza = "";
        differenza = Date.differenza(giorno2, mese2, anno2);
        return differenza;
    }

    public static void main(String[] args) throws Exception{
        float scelta ;
        String differenza;
        float somma;
         Principale p;
         p = new Principale();
         p.Scelta();
         scelta = p.Scelta();
         if (scelta == 1){
            p.Differenza();
            differenza = p.Differenza();
            System.out.println("la differenza delle date è: "+ differenza);
         }if(scelta == 2){
            p.Somma();
            somma = p.Somma();
            System.out.println("la somma di giorni ad una data è: "+ somma);
         }
         else{
             System.out.println("ERRORE NELL'INSERIMENTO DELL'INPUT!!!...");
        }
    }
}
