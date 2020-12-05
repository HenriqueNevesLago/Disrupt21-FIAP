package br.com.disrupt.bo;


import br.com.disrupt.bean.Usuario;
import br.com.disruptCrud.dao.UsuarioDAO;

public class UsuarioBO {
	
	public void insert(Usuario usuario) throws Exception{
		validateUsuario(usuario);
		UsuarioDAO ud = new UsuarioDAO();
		
		ud.insert(usuario);
	} 

//	Valida se o campo "nome" e "email" estão vazios ou se apresentam menos de 50 caracteres . 
//	Alem de verificar se o campo "CPF" é válido
public static void validateUsuario(Usuario usuario) throws Exception {

    if ((usuario.getNome().isEmpty() || usuario.getNome().length() > 50)) {
      throw new Exception("Nome do usuário inválido ou maior que 50 caracteres");
    }
    if (usuario.getCpf().isEmpty() || !validateCpf(usuario.getCpf())) {
      throw new Exception("CPF do usuário inválido");
    }
    if (usuario.getEmail().isEmpty() || usuario.getEmail().length() > 50) {
      throw new Exception("Email do usuário inválido ou maior que 50 caracteres");
    }
}
// Validador de CPF a partir de parâmetros
public static boolean validateCpf(String CPF) {
    if (CPF.equals("00000000000") || CPF.equals("11111111111") || CPF.equals("22222222222") || CPF.equals("33333333333")
        || CPF.equals("44444444444") || CPF.equals("55555555555") || CPF.equals("66666666666")
        || CPF.equals("77777777777") || CPF.equals("88888888888") || CPF.equals("99999999999") || (CPF.length() != 11))
      return (false);

    char dig10, dig11;
    int sm, i, r, num, peso;

    try {
      sm = 0;
      peso = 10;
      for (i = 0; i < 9; i++) {
        num = (int) (CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
        dig10 = '0';
      else
        dig10 = (char) (r + 48);

      sm = 0;
      peso = 11;
      for (i = 0; i < 10; i++) {
        num = (int) (CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
        dig11 = '0';
      else
        dig11 = (char) (r + 48);

      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
        return (true);
      else
        return (false);
    } catch (Exception erro) {
      return (false);
    }
  }
}