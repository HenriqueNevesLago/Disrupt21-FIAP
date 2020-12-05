package br.com.disrupt.session;

import javax.websocket.SessionException;

import br.com.disrupt.bean.Acontecimento;
import br.com.disrupt.bean.Participacao;
import br.com.disrupt.bean.Personagem;

public class Session {
  private static Session instance = null;
  private static Personagem personagem;
  private static Acontecimento acontecimento;
  private static Participacao participacao;

  private Session() {

  }
  /**
   * Metodo responsavel por checar se existe uma sessão, caso contrario, ele a a adquirido
	 * @return nova sessão aberta ao usuario do sistema
   */
  public static Session getInstance() {
    if (instance == null) {
      instance = new Session();
    }

    return instance;
  }
  /**
   * Metodo responsavel por checar se existe um sessão, caso contrario, ele a a adquiri, e instância o usuario na mesma
   * @throws SessionException caso ja exista um usuario na mesma
   * @return sessão com objeto inserido
   */
  public static Session getInstance(Personagem personagem, Acontecimento acontecimento, Participacao participacao) throws SessionException {
    if (instance == null) {
      instance = new Session();
      instance.setPersonagem(personagem);
      instance.setParticipacao(participacao);
      instance.setAcontecimento(acontecimento);
      
    } else {
      throw new SessionException("Ja existe um usuario na sessao", null, null);
    }
    return instance;
  }
  
  /**
   * Metodo responsavel por verificar se o usuario já existe no sistema
   * @return true caso usuario esteja logado na sessão existente ou false caso não esteja na sessão
   */
  public static boolean isLogged() {
    return instance == null ? false : true;
  }
  /**
   * Metodo responsavel por encerrar a sessão atribuindo a instancia como nula
   */
  public static void endSession() {
    instance = null;
  }

  public static Personagem getPersonagem() {
	return personagem;
  }
  public void setPersonagem(Personagem personagem) {
	Session.personagem = personagem;
  }
  public static Acontecimento getAcontecimento() {
	return acontecimento;
  }
  public void setAcontecimento(Acontecimento acontecimento) {
	Session.acontecimento = acontecimento;
  }
  public static Participacao getParticipacao() {
	return participacao;
  }
  public void setParticipacao(Participacao participacao) {
	Session.participacao = participacao;
  }


}
