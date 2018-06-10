package pl.sebastianstrzalkowski.simple_rest_service.model;


import com.fasterxml.jackson.annotation.JsonInclude;

public class Film {
    private String id;
    private String filmName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String director;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productionYear;

    public Film() {

    }

    public Film(String id, String filmName) {
        this.id = id;
        this.filmName = filmName;
    }

    public Film(String id, String filmName, String type, String director, String productionYear) {
        this.id = id;
        this.filmName = filmName;
        this.type = type;
        this.director = director;
        this.productionYear = productionYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }
}
