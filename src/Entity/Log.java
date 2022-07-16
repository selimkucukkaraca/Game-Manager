package Entity;

public class Log {
    private LogType logType;
    private String log;

    public Log(LogType logType, String log) {
        this.logType = logType;
        this.log = log;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
