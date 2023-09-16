package dio.springboot.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "destinatario")
public class Destinatario {

    private String nome;
    private String email;
    private List<Long> telefoneDestinatario;

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public List<Long> getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    public void settelefoneDestinatario(List<Long> telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }
}
