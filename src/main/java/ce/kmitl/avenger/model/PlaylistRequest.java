package ce.kmitl.avenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Jo on 1/11/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistRequest {
    @JsonProperty("items")
    private List<PlaylistSong> itemList;
}
