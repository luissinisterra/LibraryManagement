package models.interfaces;

public interface IBook {
    int getId();
    void setId(int id);

    String getTitle();
    void setTitle(String title);

    String getAuthor();
    void setAuthor(String author);

    String getGenre();
    void setGenre(String genre);

    int getPublicationYear();
    void setPublicationYear(int publicationYear);

    String getPublisher();
    void setPublisher(String publisher);

    String getIsbn();
    void setIsbn(String isbn);

    String getLanguage();
    void setLanguage(String language);

    int getPageCount();
    void setPageCount(int pageCount);

    String getDescription();
    void setDescription(String description);

    String getAvailability();
    void setAvailability(String availability);

    int getPrice();
    void setPrice(int price);
}

