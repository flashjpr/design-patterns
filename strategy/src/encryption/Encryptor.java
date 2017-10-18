package encryption;

// this is our Context (usually this is instantiated and initialized by clients)
public class Encryptor {

    private String algorithmName;
    private String plainText;

    public Encryptor (String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void encrypt() {
        if (algorithmName.equals("AES")) {
            System.out.println("Encrypting the information using AES");
            // code omitted
        } else if (algorithmName.equals("MD5")) {
            System.out.println("Encrypting the information using MD5");
            // code ommited
        } // etc etc
    }

    // getters and setters for plaintext
}
