package zadaniaSpring.WstrzykiwanieZaleznosci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zadaniaSpring.WstrzykiwanieZaleznosci.formatter.TextFormatter;

@Service
public class ConsoleOutputWriter{
    private final TextFormatter textFormatter;

    @Autowired
    ConsoleOutputWriter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    void println(String text) {
        System.out.println(textFormatter.upperCaseTextFormatter(text));
    }

}
