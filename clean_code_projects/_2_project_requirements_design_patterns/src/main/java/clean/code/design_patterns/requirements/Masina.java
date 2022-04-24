package clean.code.design_patterns.requirements;

import java.util.Locale;

public class Masina {

    private String brand;
    private String model;
    private String motor;
    private String culoare;

    private String incalzireScaune;
    private String bluetooth;

    public Masina(String brand, String model, String motor, String culoare, String incalzireScaune, String bluetooth) {
        this.brand = brand;
        this.model = model;
        this.motor = motor;
        this.culoare = culoare;
        this.incalzireScaune = incalzireScaune;
        this.bluetooth = bluetooth;
    }

    public static class MasinaBuilder {
        private String brand;
        private String model;
        private String motor;
        private String culoare;

        private String incalzireScaune;
        private String bluetooth;

        public MasinaBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public MasinaBuilder model(String model) {
            this.model = model;
            return this;
        }

        public MasinaBuilder motor(String motor) {
            this.motor = motor;
            return this;
        }

        public MasinaBuilder culoare(String culoare) {
            this.culoare = culoare;
            return this;
        }

        public MasinaBuilder incalzireScaune(String incalzireScaune) {
            this.incalzireScaune = incalzireScaune;
            return this;
        }

        public MasinaBuilder bluetooth(String bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Masina build() {
            return new Masina(brand, model, motor, culoare, incalzireScaune, bluetooth);
        }

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getMotor() {
        return motor;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getIncalzireScaune() {
        return incalzireScaune;
    }

    public String getBluetooth() {
        return bluetooth;
    }

}
