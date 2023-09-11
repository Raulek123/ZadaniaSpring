package zadaniaSpring.WstrzykiwanieZaleznosci;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UpperCaseFormatter implements TextFormatter{
    @Override
    public String upperCaseTextFormatter(String text) {
        return text.toUpperCase();
    }
}
