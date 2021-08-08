package clean.code.design_patterns.requirements.Business;

import clean.code.design_patterns.requirements.Data.Person;
import clean.code.design_patterns.requirements.Presentation.ClientGUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Order implements Serializable {

    private Integer ID;
    private ArrayList<MenuItem> menuItems;
    private Person client;
    private GregorianCalendar gregorianCalendar;

    public Order(Integer ID, ArrayList<MenuItem> menuItems, Person client, GregorianCalendar gregorianCalendar) {
        this.ID = ID;
        this.menuItems = menuItems;
        this.client = client;
        this.gregorianCalendar = gregorianCalendar;
    }

    public Integer getID() {
        return ID;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Person getClient() {
        return client;
    }

    public GregorianCalendar getGregorianCalendar() {
        return gregorianCalendar;
    }

    public boolean verifyHour(Integer startHour, Integer endHour){
        if(this.gregorianCalendar.get(Calendar.HOUR_OF_DAY) > startHour && this.gregorianCalendar.get(Calendar.HOUR_OF_DAY) < endHour){
            return true;
        }
        else return false;

    }

    @Override
    public int hashCode(){
        MenuItem firstItem = menuItems.get(0);

        return (86017*ID + 86027*firstItem.getRating().intValue() + 86029* firstItem.getCalories() +
                86069* firstItem.getProtein() + 86077* firstItem.getFat() + 86083* firstItem.getSodium()
                +86161*firstItem.getPrice())%1260277;
    }
}
