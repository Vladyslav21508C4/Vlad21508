
    class Human {
        private String name;

        public Human(String name) {
            this.name = name;
        }

        public Human() {

        }

        public String getName() {
            return name;
        }
    }

    class Elf extends Human {
        private String name;

        public Elf(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class Dwarf extends Human {
        private String name;

        public Dwarf(String name) {
            super();
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }


