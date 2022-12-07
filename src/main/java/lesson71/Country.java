package lesson71;

public enum Country {
    UKRAINE("grivna","UKRAINIAN",15),
    GB("FS","ENGLISH",10),
    USA("Dollar","ENGLISH",3),
    CHINA("UAN","CHINASIMPLY",5),
    FRANCE("EURO","FARNCES",8);

    Country( String valuta, String language,int t) {
        this.t = t;
        this.valuta = valuta;
        this.language = language;
    }

    private int t;

    private String valuta;
    private String language;

    public String getValuta() {
        return valuta;
    }

    public String getLanguage() {
        return language;
    }

    public int getT() {
        return t;
    }
}
