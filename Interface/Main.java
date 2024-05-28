import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "debug");
        LoggerFactory.onConsole().log(Level.WARNING, "warning");
        LoggerFactory.onConsole().log(Level.ERROR, "error");

        LoggerFactory.onFile().log(Level.DEBUG, " debug");
        LoggerFactory.onFile().log(Level.WARNING, " warning");
        LoggerFactory.onFile().log(Level.ERROR, "error");
    }
}