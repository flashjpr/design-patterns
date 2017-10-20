package encryption;

import encryption.algorithms.AesEncryptionStrategy;
import encryption.algorithms.BlowfishEncryptionStrategy;
import org.junit.Test;

/**
 * Created by mihai-mbp on 20/10/2017.
 */
public class EncryptorTest {

    @Test
    public void encrypt() {

        EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("I believe that XRP will rise to 50 cents by December.");
        aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("If SUB goes to 50 cents, I will retire.");
        blowfishEncryptor.encrypt();
    }

}