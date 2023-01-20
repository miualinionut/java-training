package clean.code.design_patterns.requirements.Builder;

public class Task {
    //required parameter
    private String taskDescription;
    private boolean completeStatus;
    //optional parameter
    private String dueDate;
    private boolean priority;

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean getCompleteStatus() {
        return completeStatus;
    }

    public boolean getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }
    void modifyCompleteStatus(boolean status){completeStatus = status;}
    private Task(TaskBuilder builder) {
        this.taskDescription = builder.taskDescription;
        this.completeStatus = builder.completeStatus;
        this.dueDate = builder.dueDate;
        this.priority = builder.priority;
    }
    String status(){
        if(completeStatus == false)
        {
            return "not completed";
        }
        else return "completed";

    }
    String importance(){
        if(priority) return "Important!";
        else return "";
    }
    @Override
    public String toString() {
        if(dueDate != null) return taskDescription + " " + importance() + " -> " + status() + " ("+ "due to: " + dueDate + ")";
        else return taskDescription + " " + importance() +" -> " + status() ;
    }
    public static class TaskBuilder {
        private String taskDescription;
        private boolean completeStatus;
        private String dueDate;
        private boolean priority;

        public TaskBuilder(String taskDescription, boolean completeStatus) {
            this.taskDescription = taskDescription;
            this.completeStatus = completeStatus;
        }

        public TaskBuilder setDueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public TaskBuilder setPriority(Boolean priority) {
            this.priority = priority;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }
}

