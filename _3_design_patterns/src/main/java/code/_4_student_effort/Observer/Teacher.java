package code._4_student_effort.Observer;

public class Teacher implements ObservedSubject {

    Observer[] observer=new Observer[0];

    void teach(String topic)
    {
 for(int i=0;i<observer.length;i++)
     observer[i].update(topic);
    }

    @Override
    public void register(Observer obj) {
        increaseSize(observer);
        observer[observer.length-1]=obj;
    }

    @Override
    public void unregistred(Observer obj) {
        Observer[] temp=new Observer[observer.length-1];
        for(int i=0;i<observer.length;i++)
        {
            if(observer[i]==obj)
            {
                for(int j=0;j<observer.length-1;j++)
                {
                    if(j==i)
                        continue;
                    temp[j]=observer[j];
                }
            }
        }

    }

    @Override
    public void notifyObservers(String message) {
     for(int i=0;i<observer.length;i++)
     {
         observer[i].update(message);
     }
    }

    public void increaseSize(Observer[] observer1) {
        Observer[] temp = new Observer[observer1.length + 1];

        for (int i = 0; i < observer1.length; i++){
            temp[i] = observer1[i];
        }
        observer = temp;
    }
}
