package fr.blooddonbeta;


public class Conv {

    public boolean seen;
    public long timestamp;
    public int notseenCount;




    public Conv(){

    }

    public Conv(boolean seen, long timestamp, int notseenCount ) {
        this.seen = seen;
        this.timestamp = timestamp;
        this.notseenCount = notseenCount;

    }


    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public int getNotseenCount() {
        return notseenCount;
    }

    public void setNotseenCount(int notseenCount) {
        this.notseenCount = notseenCount;
    }

}
