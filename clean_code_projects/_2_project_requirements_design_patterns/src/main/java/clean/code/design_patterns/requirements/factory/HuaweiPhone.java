package clean.code.design_patterns.requirements.factory;

public class HuaweiPhone implements Phone {
    @Override
    public String getManufacturer() {
        return "Huawei";
    }

    @Override
    public String getCameraResolution() {
        return "64mpx";
    }

    @Override
    public String getNumberOfProcessorCores() {
        return "8";
    }

    @Override
    public String getRam() {
        return "6GB";
    }

    @Override
    public String getScreenSize() {
        return "6.2\"";
    }
}
