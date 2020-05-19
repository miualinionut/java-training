package code._4_student_effort.code_challenge_leaders;

public class LeaderListTest {

    public static void main(String[] args) {
        LeaderList leaderList = new LeaderList();

        leaderList.add(3);
        leaderList.add(4);
        leaderList.add(10);
        leaderList.add(4);
        leaderList.add(5);
        leaderList.add(4);
        leaderList.add(3);
        leaderList.add(2);
        leaderList.add(1);

        leaderList.printLeaders();
    }
}
