package clean.code.design_patterns.requirements;

    public abstract class User {
        private String firstName, lastName;
        public User(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public User() {
        }

        public String toString(){
            return firstName +" "+ lastName;
        }

        public boolean equals(User o) {
            if (this.getFirstName().equals(o.getFirstName()) && this.getLastName().equals(o.getLastName())) {
                return true;
            } else {
                return false;
            }
        }
    }
