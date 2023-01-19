package clean.code.design_patterns.requirements;

public class CandidateFactory {

    public static Candidate makeCandidate(long followers, String name){

        if(followers >= 100000000) {
            return new AListCelebrity(name);
        } else if(followers >= 50000000){
            return new BListCelebrity(name);
        } else if(followers >= 25000000){
            return new CListInfluencer(name);
        } else if(followers >= 10000000){
            return new MiddleClass(name);
        } else {
            throw new IllegalArgumentException("Didn't make the list!");
        }
    }
}
