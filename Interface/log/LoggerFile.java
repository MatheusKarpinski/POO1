package br.univille.log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    @Override
    public void log(Level level, String message) {
        String filename = "log.txt";

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String text = "[" + timestamp + "] [" + level + "] "  + message + "\n";

        try {
            Files.write(Paths.get(filename), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}