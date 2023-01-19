package clean.code.design_patterns.requirements;

public class Volunteer {
    private String wrappingGifts;
    private String takingPhotosWithSanta;
    private String sittingAtTheDonationBoxes;
    private String participatingInTheChristmasFlashmob;
    private String organisingTheChildrenPlayground;
    private String joiningTheCarolChoir;
    private String beingSantasReindeer;
    private String decoratingTheTree;

    public Volunteer(String wrappingGifts, String takingPhotosWithSanta, String sittingAtTheDonationBoxes, String participatingInTheChristmasFlashmob, String organisingTheChildrenPlayground, String joiningTheCarolChoir, String beingSantasReindeer, String decoratingTheTree) {
        this.wrappingGifts = wrappingGifts;
        this.takingPhotosWithSanta = takingPhotosWithSanta;
        this.sittingAtTheDonationBoxes = sittingAtTheDonationBoxes;
        this.participatingInTheChristmasFlashmob = participatingInTheChristmasFlashmob;
        this.organisingTheChildrenPlayground = organisingTheChildrenPlayground;
        this.joiningTheCarolChoir = joiningTheCarolChoir;
        this.beingSantasReindeer = beingSantasReindeer;
        this.decoratingTheTree = decoratingTheTree;
    }

    public String getJoiningTheCarolChoir() {
        return joiningTheCarolChoir;
    }

    public String getBeingSantasReindeer() {
        return beingSantasReindeer;
    }

    public String getDecoratingTheTree() {
        return decoratingTheTree;
    }
}
