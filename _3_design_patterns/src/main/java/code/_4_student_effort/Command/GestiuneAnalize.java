package code._4_student_effort.Command;

import java.util.Stack;

public class GestiuneAnalize {
    Stack<LaboratorSange> stivaAnalize = new Stack<>();

    public void inregistrareAnalizaNoua(String pacient, String mailPacient, TipAnaliza tipAnaliza) {
        LaboratorSange laboratorComanda = new LaboratorSange();
        laboratorComanda.setPacient(pacient);
        laboratorComanda.setTipAnaliza(tipAnaliza);
        laboratorComanda.setMailPacient(mailPacient);

        if(tipAnaliza == TipAnaliza.COVID)
            stivaAnalize.push(laboratorComanda);
        else
            stivaAnalize.add(laboratorComanda);

    }

    public void executaAnaliza() {
        if(!stivaAnalize.isEmpty()) {
            boolean foundCovid = false;
            LaboratorSange laboratorCovid = null;
            for(LaboratorSange lab: stivaAnalize) {
                if(lab.getTipAnaliza() == TipAnaliza.COVID) {
                    foundCovid = true;
                    laboratorCovid = lab;
                }
            }
            if(!foundCovid) {
                LaboratorSange laborator = stivaAnalize.pop();
                laborator.analizeazaProba();
            }else {
                stivaAnalize.remove(laboratorCovid);
                laboratorCovid.analizeazaProba();
            }
        }
        else {
            System.out.println("Nu exista analize");
        }
    }
}
