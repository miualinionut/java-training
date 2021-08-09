package View.ViewsNote;

import Business.Models.Nota;
import Business.Views.IViewsNote.IViewShowAllNote;

import java.util.List;

public class ViewShowAllNote implements IViewShowAllNote {
    @Override
    public void showAllNote(List<Nota> note) {
        for (Nota nota : note) {
            System.out.println(nota);
        }
    }
}
