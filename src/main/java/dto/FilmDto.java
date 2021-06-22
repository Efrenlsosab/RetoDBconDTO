package dto;

import java.util.ArrayList;
import java.util.Date;

public class FilmDto {
    private ArrayList<Short> film_idDTO = new ArrayList<>();
    private ArrayList<String> titleDto = new ArrayList<>();
    private ArrayList<String> descripcion = new ArrayList<>();
    private ArrayList<Date> release_yearDto = new ArrayList<>();
    private ArrayList<Short> lenguaje_idDto = new ArrayList<>();
    private ArrayList<Short> original_lenguaje_idDto = new ArrayList<>();
    private ArrayList<Float> rental_rate = new ArrayList<>();
    private ArrayList<Short> length = new ArrayList<>();
    private ArrayList<Float> replacement_cost = new ArrayList<>();

    public ArrayList<Short> getFilm_idDTO() {
        return film_idDTO;
    }

    public void setFilm_idDTO(ArrayList<Short> film_idDTO) {
        this.film_idDTO = film_idDTO;
    }

    public ArrayList<String> getTitleDto() {
        return titleDto;
    }

    public void setTitleDto(ArrayList<String> titleDto) {
        this.titleDto = titleDto;
    }

    public ArrayList<String> getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(ArrayList<String> descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Date> getRelease_yearDto() {
        return release_yearDto;
    }

    public void setRelease_yearDto(ArrayList<Date> release_yearDto) {
        this.release_yearDto = release_yearDto;
    }

    public ArrayList<Short> getLenguaje_idDto() {
        return lenguaje_idDto;
    }

    public void setLenguaje_idDto(ArrayList<Short> lenguaje_idDto) {
        this.lenguaje_idDto = lenguaje_idDto;
    }

    public ArrayList<Short> getOriginal_lenguaje_idDto() {
        return original_lenguaje_idDto;
    }

    public void setOriginal_lenguaje_idDto(ArrayList<Short> original_lenguaje_idDto) {
        this.original_lenguaje_idDto = original_lenguaje_idDto;
    }

    public ArrayList<Float> getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(ArrayList<Float> rental_rate) {
        this.rental_rate = rental_rate;
    }

    public ArrayList<Short> getLength() {
        return length;
    }

    public void setLength(ArrayList<Short> length) {
        this.length = length;
    }

    public ArrayList<Float> getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(ArrayList<Float> replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    @Override
    public String toString() {
        return "FilmDto{" +
                "film_idDTO=" + film_idDTO +
                ", titleDto=" + titleDto +
                ", descripcion=" + descripcion +
                ", release_yearDto=" + release_yearDto +
                ", lenguaje_idDto=" + lenguaje_idDto +
                ", original_lenguaje_idDto=" + original_lenguaje_idDto +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                '}';
    }
}
