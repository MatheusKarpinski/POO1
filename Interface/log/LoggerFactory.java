package br.univille.log;

public class LoggerFactory {
    public static Logger onConsole(){
        Logger log = new LoggerConsole();
        return log;
    };

    public static Logger onFile(){
        Logger log = new LoggerFile();
        return log;
    };
}