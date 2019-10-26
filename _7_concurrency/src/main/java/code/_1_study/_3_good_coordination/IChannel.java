package code._1_study._3_good_coordination;

public interface IChannel {

  String take();

  void put(String message);
}
