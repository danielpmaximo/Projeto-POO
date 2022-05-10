
public class Usuario {

  private String nome;
  private String login;
  private String senha;
  
  /////////////////////
  private String dataNascimento;
  private String celular;

  /////////////////////
  
  public Usuario(String nome, String login, String senha) {
    this.nome = nome;
    this.login = login;
    this.senha = senha;
    this.dataNascimento = "";
    this.celular = "";
  }

  /////////////////////

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getLogin() {
    return this.login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getSenha() {
    return this.senha;
  }

  public void setSenha(String Senha) {
    this.senha = Senha;
  }

  public String getDataNascimento() {
    return this.dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getCelular() {
    return this.celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  /////////////////////

  public boolean verificarUsuario(String nome, String login, String senha) {
    return this.nome.equals(nome) && this.login.equals(login) && this.senha.equals(senha);
  }

  public boolean verificarLogin(String login, String senha) {
    return this.login.equals(login) && this.senha.equals(senha);
  }
  
  public boolean verificarLogin2(String login) {
    return this.login.equals(login);
  }

  /////////////////////
  public String resgatarDadosUsuario() {
    
    String string = "";

    string += "1. Usuário: " + this.nome;
    string += "\n2. Login: " + this.login;
    string += "\n3. Senha: " + this.senha;

    if(!this.dataNascimento.equals(""))
      string += "\n4. Data de nascimento: " + this.dataNascimento;
    else
      string += "\n4. Data de nascimento:";

    if(!this.celular.equals(""))
      string += "\n5. celular: " + this.celular;
    else
      string += "\n5. celular:";
    
    return string + "\n";
  }
}
