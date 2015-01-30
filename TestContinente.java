package JavaPraticas.Drafts;

import java.util.*;
 
/**Guilherme 
 * s.f.f  
 * SELECIONA A OPCAO "unlimited buffering" no Options da janela de execucao
 * que surge com os resultados.
 * para poderes ver tudo.
 * Ricardo
 */

/**
 * Esta e a classe de teste das classes Continente e FichaPais 
 * @version 2012
 */

 public class TestContinente {
     public static void main(String[] args) {
         
        Continente ctn = new Continente();
     
        //foi para testar construtores 
        System.out.println("PAIS CONTINENTE POPULACAO");
        /*FichaPais p1 = new FichaPais("india","asia",300000);       
        FichaPais p2 = new FichaPais("noruega","europa",5000);
        FichaPais p3 = new FichaPais("suecia","europa",50000);
        FichaPais p4 = new FichaPais("dinamarca","europa",20000);
        FichaPais p5 = new FichaPais("zambia","africano",20000);
        FichaPais p6 = new FichaPais("gana","africano",20000);
        */
       
        FichaPais p1 = new FichaPais();       
        FichaPais p2 = new FichaPais();
        FichaPais p3 = new FichaPais();
        FichaPais p4 = new FichaPais();
        FichaPais p5 = new FichaPais();
        FichaPais p6 = new FichaPais();
        
        
        //cria pais
        p1. setNome("india");
        p2.setNome("noruega");
        p3.setNome("suecia");
        p4.setNome("dinamarca");
        p5.setNome("zambia");
        p6.setNome("gana");
        
        //cria continente
        p1.setContinente("asia");
        p2.setContinente("europa");
        p3.setContinente("europa");
        p4.setContinente("europa");
        p5.setContinente("africa");
        p6.setContinente("africa");
        
        //cria populacao
        p1.setpopulacao(300000);
        p2.setpopulacao(5000);
        p3.setpopulacao(50000);
        p4.setpopulacao(20000);
        p5.setpopulacao(60000);
        p6.setpopulacao(70000);
        
        
/**
 *Cria pais (insere um pais no arraylist)
 */        
       ctn.adPais(p1);
       ctn.adPais(p2);
       ctn.adPais(p3);
       ctn.adPais(p4);
       ctn.adPais(p5);
       ctn.adPais(p6);

/**
 *Lista todos os paises  (lista arraylist) 
 */ 
       System.out.println(ctn.toString()); 
       System.out.println("\n\n"); 

/**
 *Consulta Pais 
 */
   String x;
   x= "suecia";
   System.out.println("Dado o nome de um pais,devolver a sua ficha completa:[suecia]");
   System.out.println(ctn.coPais("suecia"));   
   System.out.println("\n");
/**
 *Verifica se um pais existe 
 */
       String y;
       y= "Gana"; 
       System.out.println("Verifica se um existe:[gana]");
       System.out.println(ctn.existePais("gana"));
       System.out.println("\n");

/**
 *Numero total de paises 
 */
  System.out.println("Numero total de paises:");
  System.out.println(ctn.getQt());
  System.out.println("\n");
  
  
/** 
 *Lista de todos os paises;
 */
    System.out.println("Lista com todos os paises");
    System.out.println(ctn.listaPaises());   
    System.out.println("\n");
    
/** 
 *Lista todos os continentes;
 */
    System.out.println("Lista com todos os continentes");
    System.out.println(ctn.listaContinente());   
    System.out.println("\n");

    
 /** 
 *Lista todos os paises de um continente;
 */   
    System.out.println("Lista todos os paises de um continente:[europa]");
    System.out.println(ctn.paisesDeCont("europa"));   
    System.out.println("\n");
    
  /**
   * Numero de paises de um continente dado:
   */  
    System.out.println("Numero de paises de um continente dado:[europa]");
    System.out.println(ctn. numPaises("europa"));   
    System.out.println("\n");
    
  /**
   *Determinar o somatorio das populacoes de dado continente 
   */  
    System.out.println("Determinar o somatorio das populacoes de dado continente :[europa]");
    System.out.print("Populacoes:");
    System.out.println(ctn.populacoesDeCont("europa"));
    System.out.println("Total:");
    System.out.print(ctn.somaPopulacaoCont("europa"));
    System.out.println("\n");
    
  /** 
   *lista com os nomes dos paises com uma populacao superior a um valor dado
   */
    System.out.println("Nomes dos paises com uma populacao superior a um valor dado:[20000]");
    System.out.println(ctn.populacaoValor(20000));
    System.out.println("\n");
    
    
  /**
   *nomes dos continentes com paises com populacao superior a dado valor
   */
    System.out.println("nomes dos continentes com paises com populacao superior a dado valor:[20000]");
    System.out.println(ctn.contPopulacaoValor(20000));
    System.out.println("\n");
   
    
  /**
   *Dada uma lista de nomes de paises,remove as suas fichas 
   */
   
   /**criar uma lista de paises que quero remover */
   ArrayList<String> pais = new ArrayList<String>();
  
   pais.add("noruega");
   pais.add("suecia");
   pais.add("dinamarca");      //lista criada

   System.out.println("Dada uma lista de nomes de paises,remove as suas fichas:[noruega,suecia,dinamarca]"); 
   
   ctn.removeListaPaises(pais);
   System.out.println("[ok]");
   System.out.println(ctn.listaPaises()); 
   
   System.out.println("\n");
    
   
    
    
//////////////////////////////////////
        
   }
}
 
 
 ////////////////////////////////////7

   
        
      
        