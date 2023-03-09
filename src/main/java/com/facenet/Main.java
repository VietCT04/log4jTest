package com.facenet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOG_CONSOLE = LogManager.getLogger("Console");
    private static final Logger LOG_ALL = LogManager.getLogger();
    public static void main(String[] args) {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
        LOG_CONSOLE.trace("trace");
        LOG_CONSOLE.debug("debug");
        LOG_CONSOLE.info("info");
        LOG_CONSOLE.warn("warn");
        LOG_CONSOLE.error("error");
        LOG_CONSOLE.fatal("fatal");


        LOG_ALL.trace("trace");
        LOG_ALL.debug("debug");
        LOG_ALL.info("info");
        LOG_ALL.warn("warn");
        LOG_ALL.error("error");
        LOG_ALL.fatal("fatal");
    }
}