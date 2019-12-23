package capituloXXIV;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import org.jdom2.*;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class TrabalharXML {
	/* 
	 * Esse primeiro método é estático, o que significa 
	 * que pode ser acionado sem a necessidade de criar um objeto.
	 *  Ele tem a declaração  throws que indica que podem ocorrer 
	 *  esses exceções (JDOMException e IOEXception). A responsabilidade
	 *  de tratá-las fica para a classe e o método que o chamar.
	 * 
	 */
	public static void lerXML() throws  JDOMException, IOException { 
		File f = new File("C:\\Arq.textos\\gera.xml");
		/*
		 * Em seguida, são declarados e instanciados os objetos que
		 * lerão do arquivo XML (raiz e elements) e o Iterator que os
		 * percorrerá 
		 */
		SAXBuilder sb = new SAXBuilder();
		Document d = sb.build(f);
		Element raiz = d.getRootElement();
		List elements = raiz.getChildren();
		Iterator i = elements.iterator();
	
		// Um objeto meuContato é criado para ser populado
		Contato meuContato = null;
		while (i.hasNext()) {
			Element element = (Element) i.next();
			System.out.println("ID: " + element.getAttributeValue("id"));
			System.out.println("Nome: " + element.getAttributeValue("nome"));
			System.out.println("Email: " + element.getAttributeValue("email"));
		
			//Cria o objeto do tipo contato:
			meuContato = new Contato();
			
			// Popula o objeto
			meuContato.setNome(element.getChildTextTrim("nome"));
			meuContato.setEmail(element.getChildTextTrim("email"));
			
			/* Aqui o objeto é adicionado à lista de contatos da aplicação */ 
			Contato.adiciona(meuContato);
		
			//Desfaz o objeto meuContato:
			meuContato = null;
		}
	}
	
	public static void escreverXML() throws IOException {
		/* Declaração dos elementos que irão compor a estrutura do documento */
		Element raiz = new Element("raiz");
		Element contato = null;
		Element nome = null;
		Element email = null;
		int id = 0;
		
		//Passando por todos os contatos e gravando
		List<Contato> listacont = Contato.getMinhaLista();
		
		/* 
		 * Para cada objeto do tipo Contato dentro de listacont:
		 * é criado um elemento contato para o XML e populado
		 * com seu atributo (id --> Autonumérico) mais o nome e o email.
		 */
		
		for (Contato c: listacont) {
			contato = new Element("contato");
			nome = new Element("nome");
			email = new Element("email");
			
			//"Setando" os atributos
			contato.setAttribute("id", String.valueOf(++id));
			nome.addContent(c.getNome());
			contato.addContent(nome);
			email.addContent(c.getEmail());
			contato.addContent(email);
			
			//Aqui é organizada a raiz
			raiz.addContent(contato);
			contato = null;
			nome = null;
			email = null;
		}
		
		Document doc = new Document();
		doc.setRootElement(raiz);
		
		// Configurando a Saída do documento XML
		XMLOutputter xout = new XMLOutputter();
		FileOutputStream fos = new FileOutputStream("C:\\Arq.textos\\gera.xml");
		
		PrintStream ps = new PrintStream(fos);
		
		//Gravando ..
		xout.output(doc, ps);
	}
}
 

