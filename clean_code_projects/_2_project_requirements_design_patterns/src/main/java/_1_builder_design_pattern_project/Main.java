package _1_builder_design_pattern_project;

public class Main {
    public static void main(String[] args) {
        PC pc1 = new PC.Builder("GamingPC")
                .setMotherboard("ASRock B450 PRO4")
                .setCPU("AMD Ryzen 7 3700X 3.6GHz")
                .setPSU("GIGABYTE P750GM (80+ Gold, 750W)")
                .setRAM("HyperX Fury Black 16GB DDR4 3200MHz CL16 (x2)")
                .setStorage("Samsung 970 EVO Plus 500GB PCIExpress 3.0 x4 M.2 2280 (SSD), 500GB Seagate BarraCuda 2TB SATA-III 7200RPM 256MB (HDD)")
                .setGPU("GIGABYTE NVIDIA GeForce RTX 3070 GAMING OC 8GB GDDR6 256-bit")
                .setExtras("Creative Sound BlasterX AE-5 Plus (SoundCard)")
                .build();

        PC pc2 = new PC.Builder("OfficePC")
                .setMotherboard("ASUS ExpertCenter X5 X500MA")
                .setCPU("AMD Ryzen 7 4700G 3.6GHz")
                .setPSU("300 W, 80+%")
                .setRAM("16 GB DDR4")
                .setStorage("512GB M.2 NVMe (SSD), DVD-RW (ODD)")
                .setGPU("AMD Radeon Graphics")
                .setExtras("None")
                .build();

        pc1.printInfo();
        pc2.printInfo();
    }
}
