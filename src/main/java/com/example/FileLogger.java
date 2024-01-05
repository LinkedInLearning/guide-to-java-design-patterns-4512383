package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger extends Logger {

    public FileLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest request) {
        if (request.getLoggerType() == LoggerRequest.LoggerType.FILE) {
            try {
                var writer = new BufferedWriter(new FileWriter("src/main/resources/log.txt", true));
                writer.write(request.getMessage() + "\n");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }

    }
}
