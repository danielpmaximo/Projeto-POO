import java.util.ArrayList;

public class Amigos {
    private static ArrayList<String> amigos = new ArrayList<>();
    private static ArrayList<String> mensagens = new ArrayList<>();
    
    public static void addAmigo(String login){
        boolean existe = false;
        
        existe = Rede.checarLogin(login);
        
        if(existe){
             System.out.print("\nPedido de amizade enviado");
             Amg(login);
        }
        else System.out.print("\nO usuário digitado não existe");
    }
    
    public static void addMsg(String login){
        boolean existe = false;
        
        existe = Rede.checarLogin(login);
        
        if(existe){
            System.out.print("\nDigite sua mensagem\n>>>");
        }
        else System.out.print("\nO usuário digitado não existe");
    }
    
    public static void Msg(String mensagem){
        mensagens.add(mensagem);
    }
    
    public static void Amg(String login){
        amigos.add(login);
    }
}
