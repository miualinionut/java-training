package code._4_student_effort;

public class FooBarQix {

    public String compute(int i){

        String string="";
        if(i%3==0) string=string+"foo";
        if(i%5==0) string=string+"bar";
        if(i%7==0) string=string+"qix";

        for(char c:(""+i).toCharArray()){
            if(c=='3') string=string+"foo";
            if(c=='5') string=string+"bar";
            if(c=='7') string=string+"qix";
        }
        return string;

    }
    public String compute2(int i){

        String string="";
        if(i%3==0) string=string+"foo";
        if(i%5==0) string=string+"bar";
        if(i%7==0) string=string+"qix";

        for(char c:(""+i).toCharArray()){
            if(c=='0') string=string+"*";
            if(c=='3') string=string+"foo";
            if(c=='5') string=string+"bar";
            if(c=='7') string=string+"qix";
        }
        return string;

    }
}
