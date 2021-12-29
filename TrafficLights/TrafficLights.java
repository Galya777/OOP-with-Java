package task2;

    enum TrafficLight {
        RED(3000), YELLOW(1000), GREEN(3000);
        private final long duration;

        private TrafficLight(long duration) {
            this.duration = duration;
        }

        public long getDuration() {
            return duration;
        }
    }

