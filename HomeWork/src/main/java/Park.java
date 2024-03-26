public class Park {
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;
        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Название аттракцина: " + name + "\nВремя работы аттракциона: " + workingHours + "\nСтоимость: " + cost;
        }
    }
}
