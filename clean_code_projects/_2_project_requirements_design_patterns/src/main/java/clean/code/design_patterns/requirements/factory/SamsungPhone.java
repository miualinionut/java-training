package clean.code.design_patterns.requirements.factory;

public class SamsungPhone  implements Phone{
    @Override
    public String getManufacturer() {
        return "Samsung";
    }

    @Override
    public String getCameraResolution() {
        return "108mpx";
    }

    @Override
    public String getNumberOfProcessorCores() {
        return "8";
    }

    @Override
    public String getRam() {
        return "8GB";
    }

    @Override
    public String getScreenSize() {
        return "6.5\"";
    }
}
