package person.model;
//        SocialMedia(id, name)
public class SocialMedia {
    private static Long counter =1L;
    private Long id;
    private String name;


    public SocialMedia(String name) {
        this.id = counter++;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
