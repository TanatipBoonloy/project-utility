package ce.kmitl.avenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by Jo on 3/20/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistSongArtist {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;
}
