package example.validation.support;

public class FakeRequestObject {

    public String alienNumber;
    public int docTypeID;
    public String accessMethod;
    public String clientSoftwareVersion;

    public FakeRequestObject(String alienNumber, int docTypeID, String accessMethod, String clientSoftwareVersion) {
        this.alienNumber = alienNumber;
        this.docTypeID = docTypeID;
        this.accessMethod = accessMethod;
        this.clientSoftwareVersion = clientSoftwareVersion;
    }
}
