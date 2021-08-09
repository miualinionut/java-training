package View.ViewsMaterii;

import Business.Models.Materie;
import Business.Views.IViewsMaterii.IViewShowMaterii;

import java.util.List;

public class ViewShowMaterii implements IViewShowMaterii {
    @Override
    public void showMaterii(List<Materie> materii) {
        for (Materie materie : materii) {
            System.out.println(materie);
        }
    }
}
