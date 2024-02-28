package exercise;

public enum LogLevel {
    NONE(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int level;

    LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
