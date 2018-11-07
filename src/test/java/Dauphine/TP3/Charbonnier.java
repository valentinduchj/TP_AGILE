package Dauphine.TP3;

public class Charbonnier {
    
	private String name;
	private int Charbon;
    private int NombreHeuredispo;
    private String Etat;
	private int Etat2;
  
    

    /**
     * Constructeur d'objets de classe Charbonnier
     */
    public Charbonnier(String name)
    {
        this.name = name;
        this.Charbon = 0;
        this.NombreHeuredispo = 72;
        this.Etat = "Content";
        this.Etat2 = 0;

    }

    public String AppelleNom(){
    return "Je m'appelle " + this.name + "";  
    }
    
    public String EtreAffecte(Mine p){
    	
    	if(this.Etat == "Content") {
    		this.Etat = "Affecte " + p.getName() + " .";
    		this.Etat2 = 1;
    		return this.Etat;
    	}else {
    		this.Etat2 = 0;
    		this.Etat = "Pas Content";
    		return Etat; 
    	}
    }
    
    public int Travailler(Mine p) {	
    	if(Etat2 == 1) {
        	this.Charbon = this.Charbon + 10;
    		this.NombreHeuredispo = this.NombreHeuredispo - 14;
    		this.Etat2 = 2;
    		return this.Charbon;
    	}else {
        	return this.Charbon ;
    		
    	}
    }
   
    public String Pause() {
    	if(Etat2 == 2) {
    		this.Etat2 = 0;
    		return Etat = "Content";
    	}else {
    		return Etat;
    	}
    }
    
    public String getName(){
        return name;
    }

    public int getCharbon() {
		return Charbon;
	}

	public void setCharbon(int charbon) {
		Charbon = charbon;
	}

	public int getNombreHeuredispo() {
		return NombreHeuredispo;
	}

	public void setNombreHeuredispo(int nombreHeuredispo) {
		NombreHeuredispo = nombreHeuredispo;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public void setName(String name) {
		this.name = name;
	}

	  public int getEtat2() {
			return Etat2;
		}

		public void setEtat2(int etat2) {
			Etat2 = etat2;
		}

}
