package clean.code.design_patterns.requirements;

public class VolunteerBuilder {
    private String wrappingGifts;
    private String takingPhotosWithSanta;
    private String sittingAtTheDonationBoxes;
    private String participatingInTheChristmasFlashmob;
    private String organisingTheChildrenPlayground;
    private String joiningTheCarolChoir;
    private String beingSantasReindeer;
    private String decoratingTheTree;

    public VolunteerBuilder(String wrappingGifts, String takingPhotosWithSanta, String sittingAtTheDonationBoxes, String participatingInTheChristmasFlashmob, String organisingTheChildrenPlayground) {
        this.wrappingGifts = wrappingGifts;
        this.takingPhotosWithSanta = takingPhotosWithSanta;
        this.sittingAtTheDonationBoxes = sittingAtTheDonationBoxes;
        this.participatingInTheChristmasFlashmob = participatingInTheChristmasFlashmob;
        this.organisingTheChildrenPlayground = organisingTheChildrenPlayground;
    }

    public VolunteerBuilder setJoiningTheCarolChoir(String joiningTheCarolChoir) {
        this.joiningTheCarolChoir = joiningTheCarolChoir;
        return this;
    }

    public VolunteerBuilder setBeingSantasReindeer(String beingSantasReindeer) {
        this.beingSantasReindeer = beingSantasReindeer;
        return this;
    }

    public VolunteerBuilder setDecoratingTheTree(String decoratingTheTree) {
        this.decoratingTheTree = decoratingTheTree;
        return this;
    }

    public Volunteer build() {
        return new Volunteer(wrappingGifts, takingPhotosWithSanta, sittingAtTheDonationBoxes, participatingInTheChristmasFlashmob, organisingTheChildrenPlayground, joiningTheCarolChoir, beingSantasReindeer, decoratingTheTree);
    }
}