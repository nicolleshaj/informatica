public class Date{

    private int giorno;
    private int mese;
    private int anno;

    public Date(int giorno, int mese, int anno)throws Exception{
        setAnno(anno);
        setMese(mese);
        setGiorno(giorno,mese,anno);
    }

    public void setAnno(int anno) throws Exception{
        if (anno < 0 ){
            throw new Exception("l'anno deve essere maggiore di 0!");
        }else{
            this.anno = anno;
        }
    }
    public void setMese(int mese) throws Exception {
        if(mese < 1 || mese > 12){
            throw new Exception("il mese non è compreso nei 12 mesi dell'anno");
        }else{
            this.mese = mese;
        }
    }
    public void setGiorno(int giorno, int mese, int anno) throws Exception{
        int giorninelMese = giorninelMese(mese, anno);

        if(giorno < 1 || giorno > giorninelMese){
            throw new Exception("il nuemro dei giorni è sbagliato");
        }else{
            this.giorno = giorno;
        }
    }


    public int giorninelMese(int mese, int anno){
        int giorninelMese = 0;
        if(mese == 4 || mese == 6 || mese == 9 || mese == 11){
            giorninelMese = 30;
        }
        if(mese == 2){
            if(anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)){
                giorninelMese = 29;
            }else{
                giorninelMese = 28;
            }
        }else{
            giorninelMese = 31;
        }
        return giorninelMese;
    }


    public int getAnno(){return this.anno;}
    public int getMese(){return this.mese;}
    public int getGiorno(){return this.giorno;}

    public float sommaGiorni(int numGiorni) throws Exception{
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;

        if (numGiorni < 0){
            throw new Exception("il numero dei giorni deve essere positivo per fare la somma");
        }else{
            numGiorni += giorno;
            while(numGiorni != 0) {
                int giorniRimanenti = giorninelMese(mese, anno);
                if (giorniRimanenti >= numGiorni) {
                    giorno = numGiorni;
                    numGiorni = 0;
                } else {
                    numGiorni -= giorniRimanenti;
                    if(mese < 12){
                        mese ++;
                    }else{
                        mese = 1;
                        anno++;
                    }
                }
            }
        }
        return giorno+mese+anno;
    }

    public String differenza(int giorno2, int mese2, int anno2) throws Exception{
        int giorno1 = this.giorno;
        int mese1 = this.mese;
        int anno1 = this.anno;
        int giornoFinale = 0;
        int meseFinale = 0;
        int annoFinale = 0;

        setMese(mese1);
        setAnno(anno1);
        setGiorno(giorno1, mese1, anno1);

        if(this.anno < anno1 || (this.anno == anno1 && ((this.mese < mese1) || this.mese == mese1 && this.giorno <= giorno1))){
            int giorni = giorno1;
            while(giorni != 0){
                if (giorno1 >= this.giorno){
                    giornoFinale = giorno1 - this.giorno;
                    giorni = 0;
                }else{
                    this.giorno -= giorni;
                    mese1--;
                    giorno1 = giorninelMese(anno1, mese1);
                }
            }
            meseFinale = mese1 - this.mese;
            if(meseFinale < 0){
                anno1--;
                meseFinale = 12 + meseFinale;
            }
            annoFinale = anno1 - this.anno;
        }
        else{
            throw new Exception(("La seconda data deve essere più piccola della prima"));
        }
        return "La differenza tra le date è di: "+giornoFinale+"giorni, "+meseFinale+"mesi e "+annoFinale+"anni.";
    }
}
