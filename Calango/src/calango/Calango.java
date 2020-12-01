/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calango;




public class Calango {
    int bucho; //atributos
    int maxBucho;
    int nPatas;
    int vida;
    //mesmo nome da classe = sombreamento de variavel
    Calango(int bucho, int maxBucho, int nPatas){ //parametros
        this.bucho = bucho;
        this.maxBucho = 20;
        this.nPatas = nPatas;
        this.vida = 10;
    }

    void comer(int qtd){
        bucho += qtd;
        if(bucho > maxBucho){
            bucho = maxBucho;
            System.out.println("to cheioo");
        }else{
            System.out.println("nham nham");
        }
    }

    void andar(){
        if(nPatas < 2){
            System.out.println("Estou impossibilitado de tal tarefa");
            return;
        }
        if(bucho > 0){
            bucho -= 1;
            System.out.println("Que passeio agradavel");
            return;
        }
        System.out.println("Estou muito cansado");
        
    }

    void acidentar(){
        if(nPatas > 0){
            nPatas -= 1;
            System.out.println("Ouch! Perdi uma pata");
        }
        if(vida == 0){
            System.out.println("Morri ;-;");
            System.exit( 0 );
        }
        else if(nPatas == 0) {
            vida -=1;
            System.out.println("Minha vida diminuiu!!!");
        }
    }

    void regenerar(){
        if(vida == 10 & nPatas == 4){
            System.out.println("Estou perfeito");
        
        }
        else if(vida < 10 & nPatas == 4){
            System.out.println("ganhei um ponto de vida");
            vida += 1;
        
        
        }else if (bucho > 0){
            nPatas += 1;
            bucho -= 1;
            System.out.println("Opa! Recuperei uma pata!");
        }else{
            System.out.println("Nao tenho energia suficiente para me recuperar");
        }
    }

    @Override
    public String toString() {
        return "Bucho: " + bucho + "/" + maxBucho + " Patas: " + nPatas + " vida:" + vida ;
    }

    public static void main(String[] args) {
        //referencia      = criando objeto
        Calango deadlango = new Calango(0, 20, 4);
        System.out.println(deadlango);

        
        for(int i = 0; i < 22; i++)
            deadlango.comer(1);
        System.out.println(deadlango);
        
        for(int i = 0; i < 1; i++)
        deadlango.acidentar();
        System.out.println(deadlango);

        for(int i = 0; i < 2; i++)
            deadlango.andar();
        System.out.println(deadlango);
        
        for(int i = 0; i < 5; i++)
            deadlango.regenerar();
        
        
        System.out.println(deadlango);


    }
}


