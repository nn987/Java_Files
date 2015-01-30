package JavaPraticas.Drafts;


/**
 * Ficha4. Esta classe descreve tudo sobre um pais.
 * 
 * @version 2012
 */
public class FichaPais {
    
//Variaveis de instancia
private String nome;
private String continente;
private int populacao;

//CONSTRUTORES
  /**
   * construtor vazio
   */
  public FichaPais() {
        this("","",0);
  }
  

 /**
  * construtor das partes
  */   
  public FichaPais(String nm,String continent,int popul) {
     this.nome = nm; 
     this.continente= continent;
     this.populacao = popul; 
   }

   
 /**
  * construtor de copia
  */  
 public FichaPais(FichaPais p) {
    this(p.getNomePais(),p.getContinente(),p.getPopulacao());
 }  


//METODOS DE INSTANCIA

 public String getNomePais() { return this.nome; }
 public String getContinente() { return this.continente; }
 public int getPopulacao() { return this.populacao; }

 
//metodos modificadores
 //cria nome pais
 public void setNome(String nm) { this.nome=nm; }
 //cria nome continente
 public void setContinente(String contin) { this.continente=contin; }
 //cria populacao
 public void setpopulacao(int popul) { this.populacao=popul; }

 
 public boolean existePais(String pais) {
        return this.nome.equals(pais);
 }
 
  public boolean contemPais(String pais) {
        return this.nome.contains(pais);
 }
 
 

 //METODOS COMPLEMENTARES
 
/**
 *equals
 */
 public boolean equals(Object obj) {
   if ( this == obj ) return true;  
   if ( (obj == null) || (this.getClass() != obj.getClass()) ) return false;
        FichaPais p = (FichaPais) obj; 
        return this.nome.equals(p.getNomePais()) && 
               this.continente.equals(p.getContinente()) &&  
                this.populacao == p.getPopulacao();
    }
  
    
/**
 * toString
 */
 public String toString() {
    StringBuilder s = new StringBuilder();        
     s.append("\n"); //s.append("");
     s.append("");s.append("    ");
     s.append(this.nome); s.append("  ");
     s.append(this.continente); s.append("  ");
     s.append(this.populacao);  s.append("  ");
   return s.toString();

 }
  
  /** 
   * clone pais
   */
  public FichaPais clone() { return new FichaPais(this); }
  
 
 }
 
 

