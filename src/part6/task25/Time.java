package part6.task25;

public final class Time {
    private final int hrs;
    private final int min;
    private final int sec;
    int fullSec;

    public Time(int hrs, int min, int sec) {
        this.hrs = hrs;
        this.min = min;
        this.sec = sec;
    }

    public Time(int sec) {
        hrs = 0;
        min = 0;
        this.sec = sec;
    }

    public int getHrs() {
        if (hrs != 0 && min != 0) {
            return hrs;
        } else {
            int second;
            int m;
            int mins, h;
            second = sec % 60;
            m = (sec - second) / 60;
            mins = m % 60;
            h = (m - mins) / 60;
            return h;
        }
    }

    public int getMinute() {
        if (hrs != 0 && min != 0) {
            return min;
        } else {
            int second;
            int m, mins;
            second = sec % 60;
            m = (sec - second) / 60;
            mins = m % 60;
            return mins;
        }
    }

    public int getSecond() {
        if (hrs != 0 && min != 0) {
            return sec;
        } else {
            int second;
            second = sec % 60;
            return sec;
        }
    }
        public void getTime() {
            if (hrs != 0 && min != 0) {
                System.out.println(hrs + " часов " + min + " минут " + sec + " секунд ");
            } else {
                int second;
                int m;
                int mins, h;
                second = sec % 60;
                m = (sec - second) / 60;
                mins = m % 60;
                h = (m - mins) / 60;
                System.out.println(h + " часов " + mins + " минут " + second + " секунд ");
            }
        }
        public int compareTo (Time time){
            return Integer.compare((this.hrs * 60 + this.min) * 60 + this.sec, (time.getHrs() * 60 + time.getMinute()) * 60 + time.getSecond());
        }
}
