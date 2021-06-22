package dto;

import java.util.ArrayList;

public class FilmCategory {
    private ArrayList<Short> film_idDto = new ArrayList<>();
    private ArrayList<Short> category_idDto = new ArrayList<>();

    public ArrayList<Short> getFilm_idDto() {
        return film_idDto;
    }

    public void setFilm_idDto(ArrayList<Short> film_idDto) {
        this.film_idDto = film_idDto;
    }

    public ArrayList<Short> getCategory_idDto() {
        return category_idDto;
    }

    public void setCategory_idDto(ArrayList<Short> category_idDto) {
        this.category_idDto = category_idDto;
    }
}
