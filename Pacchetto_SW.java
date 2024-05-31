import java.util.Date;

public class Pacchetto_SW{
    private Date dataInizio = new Date();
    private Date dataFine = new Date();
    private string postoAlloggio;
    private int numPersone;

    public Pacchetto_SW(Date dataInizio, Date dataFine, string postoAlloggio, int numPersone){
        if(dataInizio.after(dataFine))
            throw new Exception();
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.postoAlloggio = postoAlloggio;
        this.numPersone = numPersone;
    }
}