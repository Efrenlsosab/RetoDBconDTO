package dto;

import java.util.ArrayList;

public class ActorDto {
    private ArrayList<String> first_nameDto = new ArrayList<>();
    private ArrayList<Short> actor_idDto = new ArrayList<>();
    private ArrayList<String> last_nameDto = new ArrayList<>();

    public ArrayList<String> getFirst_nameDto() {
        return first_nameDto;
    }

    public void setFirst_nameDto(ArrayList<String> first_nameDto) {
        this.first_nameDto = first_nameDto;
    }

    public ArrayList<Short> getActor_idDto() {
        return actor_idDto;
    }

    public void setActor_idDto(ArrayList<Short> actor_idDto) {
        this.actor_idDto = actor_idDto;
    }

    public ArrayList<String> getLast_nameDto() {
        return last_nameDto;
    }

    public void setLast_nameDto(ArrayList<String> last_nameDto) {
        this.last_nameDto = last_nameDto;
    }

    @Override
    public String toString() {
        return "ActorDto{" +
                "first_nameDto=" + first_nameDto +
                ", actor_idDto=" + actor_idDto +
                ", last_nameDto=" + last_nameDto +
                '}';
    }
}
