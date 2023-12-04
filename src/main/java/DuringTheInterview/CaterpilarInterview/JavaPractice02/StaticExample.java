package DuringTheInterview.CaterpilarInterview.JavaPractice02;

class Counter {
        private static int count = 0; // Static variable

        public Counter() {
            count++; // Increment the static count variable in the constructor
        }

        public static int getCount() { // Static method
            System.out.println(count);
            return count;
        }
    }

    public class StaticExample {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();

            System.out.println("Total instances created: " + Counter.getCount()); // Accessing static method
        }
    }


