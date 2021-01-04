package clean.code.design_patterns.requirements.loop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
    // required parameters
    private String title;
    private int type;
    private int duration;

    // optional parameters
    private List<String> details = new ArrayList<>();
    private Date startingTime;
    private Date endingTime;

    private Task(Builder builder) {
        this.title    = builder.title;
        this.type     = builder.type;
        this.duration = builder.duration;

        this.startingTime = builder.startingTime;
        this.endingTime   = builder.endingTime;
    }

    // getters for required parameters
    public String getTitle()    { return title; }
    public int    getType()     { return type; }
    public int    getDuration() { return duration; }

    public boolean hasDetails() {
        if(details.size() != 0)
            return true;

        return false;
    }

    public boolean hasTimeframe() {
        if(startingTime == null || endingTime == null)
            return false;

        return true;
    }

    // getters for the optional parameters
    public Date getStartingTime() { return startingTime; }
    public Date getEndingTime()   { return endingTime; }

    // builder class
    public static class Builder {
        // required parameters
        private String title;
        private int type;
        private int duration;

        // optional parameters
        private List<String> details = new ArrayList<>();
        private Date startingTime;
        private Date endingTime;

        public Builder(String title, int type, int duration) {
            this.title    = title;
            this.type     = type;
            this.duration = duration;
        }

        public Builder setTimeframe(Date startingTime, Date endingTime) {
            this.startingTime = startingTime;
            this.endingTime   = endingTime;

            return this;
        }

        public Builder startingDetails(String details) {
            this.details.add(details);
            return this;
        }

        public Task build() { return new Task(this); }
    }
}
