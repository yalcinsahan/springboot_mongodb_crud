package springbootmongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Tutorial veri modeli, MongoDB içinde tutulan "tutorials" koleksiyonuna karşılık gelir.
//Document annotation'ı ile koleksiyonun ismi ayarlanıyor.
@Document(collection = "tutorials")
public class Tutorial {

    //Modelin; id, title, description ve published olmak üzere dört tane özelliği var.

    @Id
    private String id;

    private String title;
    private String description;
    private boolean published;

    public Tutorial(){

    }

    public Tutorial(String title,String description,boolean published){
        this.title=title;
        this.description=description;
        this.published=published;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}
