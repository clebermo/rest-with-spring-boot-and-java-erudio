package br.com.oliver.projects;

public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * get field
     *
     * @return id
     */
    public long getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * get field
     *
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * set field
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}
