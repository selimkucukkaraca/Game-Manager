package manager;

import Entity.Log;

public class Logger {

    public void add(Log log){
        System.out.println("Log tipi : " + log.getLogType() + "Log : " + log.getLog());

    }
}
