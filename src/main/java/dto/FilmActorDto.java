package dto;

import java.util.ArrayList;

public class FilmActorDto {
    private ArrayList<Short> actor_idDto = new ArrayList<>();
    private ArrayList<Short> film_idDto = new ArrayList<>();


    public ArrayList<Short> getActor_idDto() {
        return actor_idDto;
    }

    public void setActor_idDto(ArrayList<Short> actor_idDto) {
        this.actor_idDto = actor_idDto;
    }

    public ArrayList<Short> getFilm_idDto() {
        return film_idDto;
    }

    public void setFilm_idDto(ArrayList<Short> film_idDto) {
        this.film_idDto = film_idDto;
    }
}
