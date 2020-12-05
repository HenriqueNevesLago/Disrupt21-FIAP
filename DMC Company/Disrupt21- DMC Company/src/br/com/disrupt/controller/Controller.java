package br.com.disrupt.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;
import javax.websocket.SessionException;

import br.com.disrupt.bean.Acontecimento;
import br.com.disrupt.bean.Participacao;
import br.com.disrupt.bean.Personagem;
import br.com.disrupt.bean.Usuario;
import br.com.disrupt.bo.PersonagemBO;
import br.com.disrupt.bo.UsuarioBO;
import br.com.disrupt.session.Session;


@WebServlet("/controllerPrincipal")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String language = request.getParameter("lingua");
		String local = request.getParameter("local");
		if (language == null) {
			doGet(request, response);
		} else {
			Locale locale = new Locale(language);
		
			Config.set(request.getSession(), Config.FMT_LOCALE, locale);
			Config.set(request.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
		
			response.sendRedirect(local);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String acao2 = request.getParameter("acao2");
		if (acao2 == null) {
			doPost(request, response);
		}else {
			
		switch (acao2) {
			case "quemSomos":
				response.sendRedirect("quemSomos.jsp");
				break;
			case "download":
				response.sendRedirect("downloads.jsp");
				break;
			case "ajuda":
				response.sendRedirect("ajuda.jsp");
				break;
			case "galeria":
				response.sendRedirect("galeria.jsp");
				break;
			case "machine":
				response.sendRedirect("machineLearning.jsp");
				break;
			case "index":
				response.sendRedirect("index.jsp");
				break;
		}
	}
}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String acao = request.getParameter("acao");
		
		Acontecimento acontecimento = new Acontecimento();
		Participacao participacao = new Participacao();
		Personagem personagem = new Personagem();
		
		List<Personagem> listaPersonagemRetornado = null;
		
		switch (acao) {
			case "inserir":
				
				try {
					insertUsuario(request, response);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case "ano1955":
			    acontecimento.setAno(1955);
			    participacao.setCd_versao(1);
				request.setAttribute("ano", acontecimento.getAno());
				request.setAttribute("versao", participacao.getCd_versao());
				//Singleton
					try {
						Session.endSession();
						Session.getInstance(personagem, acontecimento, participacao);
					} catch (SessionException e) {
						e.printStackTrace();
					}
				 
				try {
					buscarPorAno(request, response, personagem, listaPersonagemRetornado);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case "ano1955v2":
			    acontecimento.setAno(1955);
			    participacao.setCd_versao(2);
				request.setAttribute("ano", acontecimento.getAno());
				request.setAttribute("versao", participacao.getCd_versao());
				//Singleton
					try {
						Session.endSession();
						Session.getInstance(personagem, acontecimento, participacao);
					} catch (SessionException e) {
						e.printStackTrace();
					}
				 
				try {
					buscarPorAno(request, response, personagem, listaPersonagemRetornado);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				break;
			case "ano1985":
				acontecimento.setAno(1985);
				participacao.setCd_versao(1);
				request.setAttribute("ano", acontecimento.getAno());
				request.setAttribute("versao", participacao.getCd_versao());
				//Singleton
					try {
						Session.endSession();
						Session.getInstance(personagem, acontecimento, participacao);
					} catch (SessionException e) {
						e.printStackTrace();
					}
					
				try {
					buscarPorAno(request, response, personagem, listaPersonagemRetornado);

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "ano1985v2":
				acontecimento.setAno(1985);
				participacao.setCd_versao(2);
				request.setAttribute("ano", acontecimento.getAno());
				request.setAttribute("versao", participacao.getCd_versao());
				//Singleton
					try {
						Session.endSession();
						Session.getInstance(personagem, acontecimento, participacao);
					} catch (SessionException e) {
						e.printStackTrace();
					}
					
				try {
					buscarPorAno(request, response, personagem, listaPersonagemRetornado);

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case "personagem":
				//Session com singleton
				String nome = request.getParameter("nome");
				Acontecimento acontecimentoSession = Session.getAcontecimento();
				Participacao participacaoSession = Session.getParticipacao();
				
				//Obtendo Persoangem
				Personagem nomeRetornado = new Personagem();
				nomeRetornado.setNome(nome);
				
				try {
					Personagem personagemRetornado = PersonagemBO.listarPersonagemPorNome(nomeRetornado);
					List<Acontecimento> retornoAcontecimento = PersonagemBO.listaAcontecimento(acontecimentoSession, nomeRetornado, participacaoSession);
					//Retorno
					request.setAttribute("retornoAcontecimento", retornoAcontecimento);
					request.setAttribute("personagemRetornado", personagemRetornado);
					request.setAttribute("ano", acontecimentoSession.getAno());
					request.setAttribute("versao", participacaoSession.getCd_versao());
					request.getRequestDispatcher("personagem.jsp").forward(request, response);
				
				} catch (SQLException e) {
					e.printStackTrace();
			}
				break;
		}
	}
	public void insertUsuario(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException{
	
		Usuario usuario = new Usuario();

		usuario.setNome(request.getParameter("nome"));
		usuario.setEmail(request.getParameter("email"));
		usuario.setCpf(request.getParameter("cpf"));
		usuario.setDescricao(request.getParameter("descricao"));

		UsuarioBO usuarioBo = new UsuarioBO();
		try {
			usuarioBo.insert(usuario);
			request.setAttribute("msg", "Mensagem enviada");
			request.getRequestDispatcher("ajuda.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("msg", e);
			request.getRequestDispatcher("ajuda.jsp").forward(request, response);
			e.printStackTrace();
		}
	}
	
	public void buscarPorAno(HttpServletRequest request, HttpServletResponse response, Personagem personagem, List<Personagem> listaPersonagemRetornado) throws SQLException, IOException, ServletException {
		try {
			listaPersonagemRetornado = PersonagemBO.listarTodos(personagem);
			
			request.setAttribute("listaPersonagemRetornado", listaPersonagemRetornado);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}