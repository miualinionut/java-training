package code._4_student_effort.Command;

public class LaboratorSange implements ISolicitareAnaliza {
    private IDepartament departament;
    private String pacient;
    private String mailPacient;
    private TipAnaliza tipAnaliza;

    public LaboratorSange() {

    }

    public LaboratorSange(IDepartament departament) {
        super();
        this.departament = departament;
    }




    public IDepartament getDepartament() {
        return departament;
    }

    public void setDepartament(IDepartament departament) {
        this.departament = departament;
    }

    public String getPacient() {
        return pacient;
    }

    public void setPacient(String pacient) {
        this.pacient = pacient;
    }

    public TipAnaliza getTipAnaliza() {
        return tipAnaliza;
    }

    public void setTipAnaliza(TipAnaliza tipAnaliza) {
        this.tipAnaliza = tipAnaliza;
    }

    public String getMailPacient() {
        return mailPacient;
    }

    public void setMailPacient(String mailPacient) {
        this.mailPacient = mailPacient;
    }

    @Override
    public void analizaProba(TipAnaliza tip, String pacient) {
        switch(tip) {
            case COLESTEROL:
                this.departament = new DepartamentColesterol();
                break;
            case COVID:
                this.departament = new DepartamentCovid();
                break;
            case DEFICIT_VITAMINE:
                this.departament = new DepartamentDeficitVitamine();
                break;
            default:
                System.out.println("Nu se poate analiza!");
                break;
        }

        if(this.departament != null) {
            this.departament.executaAnaliza(pacient);
            System.out.println("Pacientului "+ pacient +" i-au fost trimise"
                    + " probele catre laborator");
        }
    }

    public void analizeazaProba() {
        this.analizaProba(this.getTipAnaliza(), this.getPacient());
    }
}
