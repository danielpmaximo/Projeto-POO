import java.util.ArrayList;
import java.util.Scanner;

public class Comunidade {
    private static ArrayList<String> membros = new ArrayList<>();
    private static ArrayList<String> coms = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    static String usuario, cmd;
    static boolean existe;
    
    public static void CriarComunidade(String comunidade){
        coms.add(comunidade);
        
        while(true){
            System.out.print("\nDigite 1 para adicionar um membro na comunidade");
            System.out.print("\nDigite 0 para sair");
            System.out.print("\n>>>");
            cmd = in.nextLine();
            
            if(cmd.equals("0")) break;
            else{
            System.out.print("\nDigite o usuário que você quer adicionar: ");
            usuario = in.nextLine();

            existe = Rede.checarLogin(usuario);

            if(existe){
                membros.add(usuario);
                System.out.printf("\nUsuário adicionado na comunidade");
            }
            else System.out.print("\nO usuário não existe...");
            }
        }
    }
}
