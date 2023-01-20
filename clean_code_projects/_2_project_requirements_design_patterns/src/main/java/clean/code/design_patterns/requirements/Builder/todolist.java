package clean.code.design_patterns.requirements.Builder;

import java.util.ArrayList;
import java.util.List;

public class todolist {
    private List<Task> tasks;
    public todolist(){
        tasks = new ArrayList<Task>();
    }
    public void addTask(Task task){
        tasks.add(task);
    }
    void changeCompleteStatus(int i, boolean status) { tasks.get(i).modifyCompleteStatus(status);
    }
    public void display(){
        for(Task task:tasks) {
            System.out.println("● " + task.toString());
        }
    }

}

