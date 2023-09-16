package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
	@Autowired
	private Rementente rementente;
	@Autowired
	private Destinatario destinatario;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + rementente.getNome()
				+ "\nE-mail:" + rementente.getEmail() + "\nCom telefones para contato: "
				+ rementente.getTelefones());
		System.out.println("Seu cadastro foi aprovado");

		if(rementente.getTelefones().stream().filter(p -> p.toString().startsWith("11")).count() > 0){
			System.out.println("Mensagem recebida por: " + destinatario.getNome()
			+ "\nE-mail:" + destinatario.getEmail() + "\nCom telefones para contato: "
					+ destinatario.getTelefoneDestinatario());
			System.out.println("Cadastrado ciente do sucesso");
		}

		List<Long> mN = Arrays.asList(2178458911L,2198455874L);
		destinatario.settelefoneDestinatario(mN);

		if(destinatario.getTelefoneDestinatario().stream().filter(p -> p.toString().startsWith("15")).count() > 0){
			System.out.println("Destinatário é do interior de São Paulo");
		}
	}
}
