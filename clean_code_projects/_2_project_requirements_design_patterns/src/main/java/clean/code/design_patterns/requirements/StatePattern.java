package clean_code_projects._2_project_requirements_design_patterns.src.main.java.clean.code.design_patterns.requirements;

public class StatePattern
{
    static class FanWallControl
    {
        private SpeedLevel current;
        public FanWallControl()
        {
            current = new Off();
        }
        public void setState(SpeedLevel state)
        {
            current = state;
        }
        public void press()
        {
            current.press(this);
        }
        @Override
        public String toString()
        {
            return String.format("Fan Wall Control is [current = %s]", current);
        }
    }

    interface SpeedLevel
    {
        void press(FanWallControl fanWallControl);
    }
    static class Off implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new SpeedLevel1());
        }
    }
    static class SpeedLevel1 implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new SpeedLevel2());
        }
    }
    static class SpeedLevel2 implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new SpeedLevel3());
        }
    }
    static class SpeedLevel3 implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new SpeedLevel4());
        }
    }
    static class SpeedLevel4 implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new SpeedLevel5());
        }
    }
    static class SpeedLevel5 implements SpeedLevel
    {
        public void press(FanWallControl fanWallControl)
        {
            fanWallControl.setState(new Off());
        }
    }
}
