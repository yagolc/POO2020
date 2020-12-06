
package bmw;

public class carro {
    int vaga = 0;
    int tanque;
    int maxtanque;
    int quilometragem;
    int km;
    public carro(){
        maxtanque = 100;
        
    }
    
    
    public void entrar(){
         if(this.vaga < 2){
             this.vaga += 1;
             System.out.println("Uma pessoa entrou no carro "+this.vaga);
         }
         else{
             System.out.println("O carro ta lotado");
         }
    }
    void sair(){
        
        if (vaga > 0 ){
            System.out.println("Uma pessoa saiu do carro");
            vaga -=1;
        }
        else{
            System.out.println("O carro esta vazio ");
        }
    }
    void abastecer(int qtd){
        tanque += qtd;
        if(tanque > maxtanque){
            int aux = tanque;
            aux -= maxtanque; 

            tanque = maxtanque;
            System.out.println("O tanque ta cheio voce colocou "+aux+" a mais e acabou vazando");
        }else{
            System.out.println("Encheu "+ tanque);
        }
    }
    void dirigir(int km){
        int litro = tanque;
        if(vaga > 0){
            if(litro == 0){
                System.out.println("Você esta sem combustivel");
            }
            if(km <= litro){
                tanque -= km;
                System.out.println("Vc chegou no seu destino percoreu "+km+"km sobrou "+tanque+"L de combustivel");
            }

            if(km > litro && litro > 0){
                tanque -= km;

                System.out.println("A gasolina acabou vc apenas percorreu "+tanque+"km");// Nao consigo deixar esse valor positivo
                tanque = 0;

            }
        }
        else{
            System.out.println("Tem ngm no carro");
        }
    }
}
