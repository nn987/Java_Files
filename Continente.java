package JavaPraticas.Drafts;

import java.util.*;

/**
 * Esta classe serve para gerir um continente com muitos paises
 * implementa varias operacoes sobre a classe pais.
 * 
 * @version 2012
 */

public class Continente {
    //variaveis de instancia
    private ArrayList<FichaPais> paisList;
    
    //Construtores
   /**
    *construtor vazio
    */
    public Continente(){
       this.paisList=new ArrayList<FichaPais>();
    }
    
   /**
    *construtor das partes
    */
    public Continente(ArrayList<FichaPais> pais){
      this();  //chama o construtor vazio
      for (FichaPais po : pais)
        this.paisList.add(po.clone());      
   }
   
   /**
    *construtor de copia
    */
   public Continente(Continente pais){
     paisList = new ArrayList<FichaPais>();
      for (FichaPais po : pais.getFichaPais())
        paisList.add(po);
    }
   
   
  //METODOS DE INSTANCIA 
  //os metodos usuais : inserir/listar/procurar/remover/consultar/
    
  /**
   *obter uma lista de paises 
   */
  public List<FichaPais> getFichaPais(){
   List<FichaPais> res = new ArrayList<FichaPais>();
     for (FichaPais po : this.paisList) 
         res.add(po.clone());
   return res;      
  }
  
    
  /**
   *Adicionar um pais 
   */
  public void adPais(FichaPais po){
    this.paisList.add(po.clone());
  }
  
     
  /**
   *Verifica se um pais existe  
   */  
   public boolean existePais(String cod) { 
      boolean existe = false; 
      Iterator<FichaPais> it = paisList.iterator(); 
      while(it.hasNext() && !existe) { 
          if(it.next().getNomePais().equals(cod)) existe = true; 
      } 
      return existe; 
    }   
    
    
  /**
   *Dado o nome de um pais, devolver a sua ficha completa, caso exista
   */     
   public FichaPais coPais(String cod) {
    FichaPais po = null;
    boolean enc = false;
     Iterator<FichaPais> it = paisList.iterator();
     
      while (it.hasNext() && !enc) {
         po = it.next();
           if(po.getNomePais().equals(cod)) enc=true;
         }  
       return po.clone();
   }  
    
    
 /**
  *Remover um pais //ainda nao tenho uma precondicao
  *remove todas as ocorrencias 
  */   
    public void removePais(String cod){
       FichaPais po = null;
       boolean existe = false; 
       Iterator<FichaPais> it = paisList.iterator(); //iterador 
       
         while(it.hasNext() ) {
           po = it.next();
           if (po.getNomePais().equals(cod)) {
               existe=true; it.remove();                                    
            }
         }      
    }       
      
   
   /**outros METODOS 
   *que implementam as operacoes necessarias do problema
   */
   
  /**
   *Obter numero total de paises 
   */
    public int getQt(){
     return paisList.size();
    }
  
   
  /** 
   *lista todos os continentes 
   */ 
   public ArrayList<FichaPais> listaContinente() {      
    ArrayList paisesList = new ArrayList();
    String continente = "";
     for(Iterator it = paisList.iterator(); it.hasNext();) {
          continente = ((FichaPais) it.next()).getContinente();
          paisesList.add(continente);
        }
        return paisesList;
    }
    
  
   
   /**
    * lista todos os paises de um continente
    */
     public ArrayList<FichaPais> paisesDeCont(String nome) {
       String continente="";
       ArrayList<FichaPais> res = new ArrayList<FichaPais>();
        for(FichaPais m : paisList) 
       //   if(m.paisContinente(nome).equals(nome))  //tambem da !
            if(m.getContinente().equals(nome)) 
             res.add(m.clone());            
        return res;
    }
    
    /**
    * lista todas as populacoes de um continente
    */
     public ArrayList<FichaPais> populacoesDeCont(String nome) {
       int populacao=0;
       ArrayList res = new ArrayList();        
         for(FichaPais m : paisList)            
            if(m.getContinente().equals(nome)) 
              res.add(m.getPopulacao()); 
        return res;
      }
       
   
   /**
    * Determinar o numero de paises de um continente dado
    */
      public int numPaises(String nome) {
        String continente="";
        ArrayList<FichaPais> res = new ArrayList<FichaPais>();
         for(FichaPais m : paisList) 
           if(m.getContinente().equals(nome)) 
             res.add(m.clone());
             return res.size();
      }
          
  
  /**
   * lista com todos os paises
   */
   public ArrayList<FichaPais> listaPaises() {      
    ArrayList paisesList = new ArrayList();
    String pais = "";
     for(Iterator it = paisList.iterator(); it.hasNext();) {
          pais = ((FichaPais) it.next()).getNomePais();
          paisesList.add(pais);
        }
        return paisesList;
    }
    
  
  /**
   * Determinar o somatorio das populacoes de dado continente 
   */
   public int somaPopulacaoCont(String nome){
    String continente="";
    int total=0;
     ArrayList<FichaPais> res = new ArrayList<FichaPais>();
       for(FichaPais m : paisList)
           if(m.getContinente().equals(nome)) 
              total+= m.getPopulacao(); 
           return total;
   }
             
             
  /** 
   *lista com os nomes dos paises com uma populacao superior a um valor dado
   */
   public ArrayList<FichaPais> populacaoValor(int valor) {
       FichaPais po; 
       String pais = "";
       ArrayList paisesList = new ArrayList();

        for(Iterator it = paisList.iterator(); it.hasNext();) {
            po = (FichaPais) it.next();
             if (po.getPopulacao() > valor ) {
                 pais=po.getNomePais();
                 paisesList.add(pais);
             }
         }
        return paisesList;
    }
        
   
  /** 
   *nomes dos continentes com paises com populacao superior a dado valor
   */
  public ArrayList<FichaPais> contPopulacaoValor(int valor) {
       FichaPais po; 
       String continente = "";
       ArrayList paisesList = new ArrayList();

        for(Iterator it = paisList.iterator(); it.hasNext();) {
            po = (FichaPais) it.next();
             if (po.getPopulacao() > valor ) {
                 continente=po.getContinente();
                 paisesList.add(continente);
             }
         }
        return paisesList;
    }
  
    
  /**
   *Dada uma lista de nomes de paises,remover as suas fichas 
   */
    public void removeListaPaises(List<String> pais){
       FichaPais po;      
       Iterator<String> i;
       boolean contem = false; 
           
       Iterator<FichaPais> it = paisList.iterator();    
        
        po = (FichaPais)it.next(); 
        i=pais.iterator();
           while (i.hasNext() ) {     
             po=it.next();
             
             contem=po.contemPais(i.next());
             contem=true; 
             it.remove();
            }
          }
          
      
    
  //METODOS COMPLEMENTARES
    
  /** 
   *Representacao como texto 
   */  
    public String toString() {
     StringBuilder s = new StringBuilder();      
      for(FichaPais m : paisList) 
         s.append(m.toString()); 
      return s.toString();
     }  
     
         
  /** 
   *Clone 
   */
   public Continente clone() { return new Continente(this); }
    
    
    
    
    
    
    
    
    
    
    
    
}
