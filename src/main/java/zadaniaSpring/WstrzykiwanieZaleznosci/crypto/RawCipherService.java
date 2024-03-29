package zadaniaSpring.WstrzykiwanieZaleznosci.crypto;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zadaniaSpring.WstrzykiwanieZaleznosci.crypto.CipherService;

@Service
@Profile("dev")
class RawCipherService implements CipherService {
    @Override
    public String encrypt(String text) {
        return text;
    }

    @Override
    public String decrypt(String cipher) {
        return cipher;
    }
}
