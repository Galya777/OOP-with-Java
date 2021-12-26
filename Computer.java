package zad2;

import java.util.Arrays;

public class Computer {
    private String type;
    private int procSpeed;
    private String[] files;

    public Computer(String[] files, int procSpeed, String type) {
        setFiles(files);
        setProcSpeed(procSpeed);
        setType(type);
    }

    public Computer() {
        files= new String[]{"", ""};
        setProcSpeed(0);
        setType("");
    }

    public Computer(Computer other) {
        setFiles(other.files);
        setProcSpeed(other.procSpeed);
        setType(other.type);
    }
    public String[] getFiles() {
        return files;
    }

    public void setFiles(String[] files) {
        this.files = files;
    }

    public int getProcSpeed() {
        return procSpeed;
    }

    public void setProcSpeed(int procSpeed) {
        this.procSpeed = procSpeed>0?procSpeed:1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", procSpeed=" + procSpeed +
                ", files=" + Arrays.toString(files) +
                '}';
    }
}
