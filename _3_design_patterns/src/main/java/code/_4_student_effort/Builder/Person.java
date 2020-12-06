package code._4_student_effort.Builder;
//Challenge 6 - Builder
public class Person {
        private String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public static class Builder{
            private String name;
            private String job;
            private String university;
            private String drivingLicense;
            private boolean isMarried;

            public Builder (String name){
                this.name = name;
            }
            public Builder job (String job){
                this.job = job;
                return this;
            }
            public Builder university (String university){
                this.university = university;
                return this;
            }
            public Builder drivingLicense (String drivingLicense){
                this.drivingLicense = drivingLicense;
                return this;
            }
            public Builder isMarried (Boolean isMarried){
                this.isMarried = isMarried;
                return this;
            }

            public Person build() {
                return new Person();
            }
        }
}

