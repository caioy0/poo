import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        var menu = "1-Cadastrar\n2-Listar\n3-Atualizar\n4-Apagar\n5-Listar com letra\n0-Sair\n";
        int op = 0;
        do{
          op = Integer.parseInt(
            JOptionPane.showInputDialog(menu)
          );
          switch(op){
            case 1:{
              var nome = JOptionPane.showInputDialog("Nome?");
              var fone = JOptionPane.showInputDialog("Fone?");
              var email = JOptionPane.showInputDialog("E-mail?");
              var p = new Pessoa(0, nome, fone, email);
              var dao = new PessoaDAO();
              dao.cadastrar(p);
              JOptionPane.showMessageDialog(null,"Cadastro OK!");
              break;
            }
            case 2:{
              var pessoas = new PessoaDAO().listar();
              JOptionPane.showMessageDialog(null, pessoas);
              break;
            }
            case 3:{ //Professor Troquei a senha do postgresql!!!!!!!
              //capturar codigo, nome fone e e-mail
              //atualizar nome, fone e e-mail pessoa cujo codigo foi especificado
              try {
                var codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa a atualizar?")); // Captura do codigo
                var nome = JOptionPane.showInputDialog("Novo Nome?");
                var fone = JOptionPane.showInputDialog("Novo Fone?");
                var email = JOptionPane.showInputDialog("Novo E-mail?");
                var p = new Pessoa(codigo, nome, fone, email);
                // Atualização no banco de dados
                var dao = new PessoaDAO();
                dao.atualizar(p);
                JOptionPane.showMessageDialog(null, "Atualização concluída!");
              } 
              catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
              }
              break;
            }
            case 4: {
              var codigo = Integer.parseInt(
                JOptionPane.showInputDialog("Código?")
              );
              var p = new Pessoa(codigo);
              var dao = new PessoaDAO();
              dao.apagar(p);
              JOptionPane.showMessageDialog(null, "Apagou!");
              break;
            }
            case 5:{
              //capturar uma letra
              //listar todas as pessoas cujo nome começa com essa letra
              var letra = JOptionPane.showInputDialog("Informe a letra inicial do nome da pessoa que deseja realizar a busca: ");
              if (letra == null || letra.isBlank() || letra.length() != 1) {
                JOptionPane.showMessageDialog(null, "Letra inválida!");
                break;
              }
              var pessoas = new PessoaDAO().listarLetra(letra.charAt(0));
              if (pessoas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nenhuma pessoa encontrada com a letra: " + letra);
              }
              else {
                JOptionPane.showMessageDialog(null, pessoas);
              }
              break;
            }
            case 0:{
              JOptionPane.showMessageDialog(null, "Até!");
            }
          }
        }while(op != 0);
      }
} //Professor Troquei a senha do postgresql
