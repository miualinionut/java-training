package clean.code.design_patterns.requirements.factory;

public class PhoneFactory {
    public static Phone getPhone(String type){
        if("Samsung S20 Ultra".equalsIgnoreCase(type))
            return new SamsungPhone();
        else if("Huawei P30".equalsIgnoreCase(type))
            return new HuaweiPhone();
        else if("iPhone 11".equalsIgnoreCase(type))
            return new ApplePhone();
        return null;
    }
}
