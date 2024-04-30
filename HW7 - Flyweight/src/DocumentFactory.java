import java.util.HashMap;

public class DocumentFactory {
    private static final HashMap<String, DocumentSkeleton> documentContainer =
            new HashMap<String, DocumentSkeleton>();

    public static DocumentSkeleton getDocument(String document) {
        DocumentSkeleton docSkeleton = null;

        if(documentContainer.containsKey(document)) {
            docSkeleton = documentContainer.get(document);
        }
        else {
            docSkeleton = new Document();
            documentContainer.put(document, docSkeleton);
        }
        return docSkeleton;
    }
}
