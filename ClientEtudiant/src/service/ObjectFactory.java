
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ModifierEtudiantResponse_QNAME = new QName("http://service/", "ModifierEtudiantResponse");
    private final static QName _SupprimerEtudiant_QNAME = new QName("http://service/", "SupprimerEtudiant");
    private final static QName _GetEudiantResponse_QNAME = new QName("http://service/", "GetEudiantResponse");
    private final static QName _AjouterEtudiant_QNAME = new QName("http://service/", "AjouterEtudiant");
    private final static QName _GetEudiant_QNAME = new QName("http://service/", "GetEudiant");
    private final static QName _SupprimerEtudiantResponse_QNAME = new QName("http://service/", "SupprimerEtudiantResponse");
    private final static QName _ModifierEtudiant_QNAME = new QName("http://service/", "ModifierEtudiant");
    private final static QName _AjouterEtudiantResponse_QNAME = new QName("http://service/", "AjouterEtudiantResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEudiant }
     * 
     */
    public GetEudiant createGetEudiant() {
        return new GetEudiant();
    }

    /**
     * Create an instance of {@link AjouterEtudiant }
     * 
     */
    public AjouterEtudiant createAjouterEtudiant() {
        return new AjouterEtudiant();
    }

    /**
     * Create an instance of {@link GetEudiantResponse }
     * 
     */
    public GetEudiantResponse createGetEudiantResponse() {
        return new GetEudiantResponse();
    }

    /**
     * Create an instance of {@link ModifierEtudiantResponse }
     * 
     */
    public ModifierEtudiantResponse createModifierEtudiantResponse() {
        return new ModifierEtudiantResponse();
    }

    /**
     * Create an instance of {@link SupprimerEtudiant }
     * 
     */
    public SupprimerEtudiant createSupprimerEtudiant() {
        return new SupprimerEtudiant();
    }

    /**
     * Create an instance of {@link AjouterEtudiantResponse }
     * 
     */
    public AjouterEtudiantResponse createAjouterEtudiantResponse() {
        return new AjouterEtudiantResponse();
    }

    /**
     * Create an instance of {@link ModifierEtudiant }
     * 
     */
    public ModifierEtudiant createModifierEtudiant() {
        return new ModifierEtudiant();
    }

    /**
     * Create an instance of {@link SupprimerEtudiantResponse }
     * 
     */
    public SupprimerEtudiantResponse createSupprimerEtudiantResponse() {
        return new SupprimerEtudiantResponse();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ModifierEtudiantResponse")
    public JAXBElement<ModifierEtudiantResponse> createModifierEtudiantResponse(ModifierEtudiantResponse value) {
        return new JAXBElement<ModifierEtudiantResponse>(_ModifierEtudiantResponse_QNAME, ModifierEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SupprimerEtudiant")
    public JAXBElement<SupprimerEtudiant> createSupprimerEtudiant(SupprimerEtudiant value) {
        return new JAXBElement<SupprimerEtudiant>(_SupprimerEtudiant_QNAME, SupprimerEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetEudiantResponse")
    public JAXBElement<GetEudiantResponse> createGetEudiantResponse(GetEudiantResponse value) {
        return new JAXBElement<GetEudiantResponse>(_GetEudiantResponse_QNAME, GetEudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterEtudiant")
    public JAXBElement<AjouterEtudiant> createAjouterEtudiant(AjouterEtudiant value) {
        return new JAXBElement<AjouterEtudiant>(_AjouterEtudiant_QNAME, AjouterEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "GetEudiant")
    public JAXBElement<GetEudiant> createGetEudiant(GetEudiant value) {
        return new JAXBElement<GetEudiant>(_GetEudiant_QNAME, GetEudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "SupprimerEtudiantResponse")
    public JAXBElement<SupprimerEtudiantResponse> createSupprimerEtudiantResponse(SupprimerEtudiantResponse value) {
        return new JAXBElement<SupprimerEtudiantResponse>(_SupprimerEtudiantResponse_QNAME, SupprimerEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "ModifierEtudiant")
    public JAXBElement<ModifierEtudiant> createModifierEtudiant(ModifierEtudiant value) {
        return new JAXBElement<ModifierEtudiant>(_ModifierEtudiant_QNAME, ModifierEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "AjouterEtudiantResponse")
    public JAXBElement<AjouterEtudiantResponse> createAjouterEtudiantResponse(AjouterEtudiantResponse value) {
        return new JAXBElement<AjouterEtudiantResponse>(_AjouterEtudiantResponse_QNAME, AjouterEtudiantResponse.class, null, value);
    }

}
