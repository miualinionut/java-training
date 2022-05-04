package clean_code_projects._2_project_requirements_design_patterns.src;

public class House {
    private String location; // mandatory
    private int noFloors; // mandatory
    private int pool; // optional
    private int securityCameras; // optional
    private int chimney; // optional


    private House(HouseBuilder builder) {
        this.location = builder.location;
        this.noFloors = builder.noFloors;
        this.pool = builder.pool;
        this.securityCameras = builder.securityCameras;
        this.chimney = builder.chimney;
    }

    public String getLocation() {
        return location;
    }

    public int getNoFloors() {
        return noFloors;
    }

    public int getPool() {
        return pool;
    }

    public int getSecurityCameras() {
        return securityCameras;
    }

    public int getChimney() {
        return chimney;
    }


    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", noFloors=" + noFloors +
                ", pool=" + pool +
                ", securityCameras=" + securityCameras +
                ", chimney=" + chimney +
                '}';
    }

    public static class HouseBuilder {
        private String location; // mandatory
        private int noFloors; // mandatory
        private int pool = 0; // optional
        private int securityCameras = 0; // optional
        private int chimney = 0; // optional

        public HouseBuilder(String location, int noFloors) {
            this.location = location;
            this.noFloors = noFloors;
        }

        public HouseBuilder pool(int pool) {
            this.pool = pool;
            return this;
        }

        public HouseBuilder securityCameras(int securityCameras) {
            this.securityCameras = securityCameras;
            return this;
        }

        public HouseBuilder chimney(int chimney) {
            this.chimney = chimney;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

