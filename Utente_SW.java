import java.util.Date;

public class Utente_SW {

    private String nome;
    private String cognome;
    private Date dataNascita;
    private String codiceFiscale;
    private String email;
    private String telefono;
    private String username;
    private char[] password;

    public Utente_SW(String nome, String cognome, Date dataNascita, String codiceFiscale, String email, String telefono,
            String username, char[] password) {
        if (codiceFiscale.length() < 16)
            throw new Exception();

        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.codiceFiscale = codiceFiscale;
        this.email = email;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
    }

}