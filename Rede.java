import java.util.ArrayList;

// Métodos estáticos
public class Rede {

  // Lista de usuários da rede iFace
  private static ArrayList<Usuario> usuarios = new ArrayList<>();

  public static boolean cadastrarUsuario(String nome, String login, String senha) {

    boolean resultado = false, existe = false;

    for (int i = 0; i < usuarios.size(); i++) {
      existe = usuarios.get(i).verificarUsuario(nome, login, senha);
      if (existe == true)  break;
    }

    if (!existe) {
      Usuario usuario = new Usuario(nome, login, senha);
      usuarios.add(usuario);
      resultado = true;
    }

    return resultado;
    
  }

  public static int efetuarLogin(String login, String senha) {

    int id = -1;

    for (int i = 0; i < usuarios.size(); i++) {
      if(usuarios.get(i).verificarLogin(login, senha)) {
        id = i;
        break;
      }
    }

    return id;
    
  }

  public static String visualizarPerfil(int idUsuario) {

    return usuarios.get(idUsuario).resgatarDadosUsuario();
    
  }
  
    public static boolean checarLogin(String login) {
    
        boolean existe = false;

        for (int i = 0; i < usuarios.size(); i++) {
          if(usuarios.get(i).verificarLogin2(login)) {
            existe = true;
            break;
          }
        }
        return existe;
  }

  public static void editarPerfil(int idUsuario, int codigoPerfil, String dado) {

    if(codigoPerfil == 1) usuarios.get(idUsuario).setNome(dado);
    else if(codigoPerfil == 2) usuarios.get(idUsuario).setLogin(dado);
    else if(codigoPerfil == 3) usuarios.get(idUsuario).setSenha(dado);
    else if(codigoPerfil == 4) usuarios.get(idUsuario).setDataNascimento(dado);
    else if(codigoPerfil == 5) usuarios.get(idUsuario).setCelular(dado);    
    
  }
  
}