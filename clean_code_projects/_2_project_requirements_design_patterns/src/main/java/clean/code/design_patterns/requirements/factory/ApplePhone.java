package clean.code.design_patterns.requirements.factory;

public class ApplePhone implements Phone {
    @Override
    public String getManufacturer() {
        return "Apple";
    }

    @Override
    public String getCameraResolution() {
        return "12mpx";
    }

    @Override
    public String getNumberOfProcessorCores() {
        return "6";
    }

    @Override
    public String getRam() {
        return "4GB";
    }

    @Override
    public String getScreenSize() {
        return "5.8\"";
    }
}
