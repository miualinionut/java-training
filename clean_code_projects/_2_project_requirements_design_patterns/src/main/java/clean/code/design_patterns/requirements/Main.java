package clean.code.design_patterns.requirements;


public class Main {

    public static void main(String[] args) {
        Memo memo = Memo.theInstance();
        memo.addMember(new Memo.Member("Rebecca","Smith","rebeccasmith@gmail.com"));
        memo.addMember(new Memo.Member("Denise","Ro","denisero@gmail.com"));
        memo.addMember(new Memo.Member("Andrew","Gill","andrewgill@gmail.com"));
        memo.addMember(new Memo.Member("Mariah","Carey","mariahcarey@gmail.com"));

        memo.postMessage("Offer available for 3 days! Hurry!");
        memo.postMessage("Today only there's a discount for summer dresses as well 50% !");

        memo.removeMember("mariahcarey@gmail.com");

        memo.postMessage("Hurry!");
    }
}
