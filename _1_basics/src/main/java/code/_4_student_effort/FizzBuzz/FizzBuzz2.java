package code._4_student_effort.FizzBuzz;

public class FizzBuzz2 {
    String str = "";
    public void print(int number) {
        boolean wasFizzRizz = false;
        boolean wasFizzBuzz = false;
        boolean wasFizzJazz = false;
        boolean wasBuzzRizz = false;
        boolean wasBuzzJazz = false;
        boolean wasRizzJazz = false;
        boolean isNumber = true;
        if(number % 3 == 0) {
            if (number % 7 == 0 && !wasFizzBuzz && !wasFizzJazz) {
                str += "FizzRizz ";
                wasFizzRizz = true;
            }
            if ((number % 5 == 0) && !wasFizzJazz && !wasFizzRizz) {
                str += "FizzBuzz ";
                wasFizzBuzz = true;
            }
            if ((number % 11 == 0) && !wasFizzBuzz && !wasFizzRizz) {
                str += "FizzJazz ";
                wasFizzJazz = true;
            }
            if(!wasFizzBuzz && !wasFizzRizz && !wasFizzJazz) {
                str += "Fizz ";
            }
            isNumber = false;
        }
        if((number % 5 == 0) && !wasFizzBuzz) {
            if((number % 7 == 0) && !wasBuzzJazz) {
                str += "BuzzRizz ";
                wasBuzzRizz = true;
            }
            if((number % 11 == 0) && !wasBuzzRizz) {
                str += "BuzzJazz ";
                wasBuzzJazz = true;
            }
            if(!wasBuzzJazz && !wasBuzzRizz) {
                str += "Buzz ";
            }
            isNumber = false;

        }
        if((number % 7 == 0) && !wasFizzRizz && !wasBuzzRizz) {
            if(number % 11 == 0) {
                str += "RizzJazz ";
                wasRizzJazz = true;
            } else {
                str += "Rizz ";
            }
            isNumber = false;
        }
        if((number % 11 == 0) && !wasFizzJazz && !wasFizzBuzz && !wasRizzJazz) {
            str += "Jazz ";
            isNumber = false;
        }
        if(isNumber) {
            str += number + " ";
        }
        if(number == 100){
            System.out.println(str);
        }

    }

}
