package _2_project_requirements_design_patterns.car;

public class CarFactory {
    public static Car getCar(String type)
    {
        if("Ford Focus".equalsIgnoreCase(type))
            return new Ford();
         else if ("Volskwagen Golf".equalsIgnoreCase(type))
             return new Volkswagen();
         return null;
    }
}
