
package bmw;
import javax.swing.JOptionPane;
public class BMW {


    public static void main(String[] args) {
        carro c = new carro();
        
        while(true){
        String acao = JOptionPane.showInputDialog("Comandos: (entrar); (sair); (abastecer 20); (Exibir); (Dirigir 30);(fechar");
        String[] ui = acao.split(" ");
        if(acao.equals("entrar")){
            c.entrar();
        }
        if(acao.equals("sair")){
            c.sair();
        }
        if(ui[0].equals("abastecer")){
            c.abastecer(Integer.parseInt(ui[1]));
        }
        if(ui[0].equals("Dirigir")){
            c.dirigir(Integer.parseInt(ui[1]));
        }
        if(acao.equals("fechar")){
            break;
        }


        }
        

    }
    
}
