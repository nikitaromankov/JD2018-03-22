//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0-b170531.0717 
//         See <a href="https://jaxb.java.net/">https://jaxb.java.net/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.05.30 at 11:08:32 PM MSK 
//


package by.it.lyukovich.jd_02_09;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the by.it_academy.lyukovich package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: by.it_academy.lyukovich
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Books }
     * 
     */
    public Books createBooks() {
        return new Books();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link BookSysInfo }
     * 
     */
    public BookSysInfo createBookSysInfo() {
        return new BookSysInfo();
    }

    /**
     * Create an instance of {@link BookBuyInfo }
     * 
     */
    public BookBuyInfo createBookBuyInfo() {
        return new BookBuyInfo();
    }

    /**
     * Create an instance of {@link BookPrice }
     * 
     */
    public BookPrice createBookPrice() {
        return new BookPrice();
    }

    /**
     * Create an instance of {@link BookAuthors }
     * 
     */
    public BookAuthors createBookAuthors() {
        return new BookAuthors();
    }

    /**
     * Create an instance of {@link BookAuthor }
     * 
     */
    public BookAuthor createBookAuthor() {
        return new BookAuthor();
    }

}