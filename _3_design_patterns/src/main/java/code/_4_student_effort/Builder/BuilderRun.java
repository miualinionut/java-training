package code._4_student_effort.Builder;



public class BuilderRun {
    public static void main(String[] args) {

        Person person01 = new Builder("Popescu")
                .job("java developer")
                .university("FMI")
                .isMarried(false)
                .build();

        Person person02 = new Builder("Ionescu")
                .drivingLicense("B")
                .isMarried(true)
                .build();
    }
}
