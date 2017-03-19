package ce.kmitl.avenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Data;

/**
 * Created by Jo on 3/18/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AudioFeatures {
    @JsonProperty("id")
    private String id;

    @JsonProperty("danceability")
    private Double danceability;

    @JsonProperty("energy")
    private Double energy;

    @JsonProperty("key")
    private Integer key;

    @JsonProperty("loudness")
    private Double loudness;

    @JsonProperty("mode")
    private Integer mode;

    @JsonProperty("speechiness")
    private Double speechiness;

    @JsonProperty("acousticness")
    private Double acousticness;

    @JsonProperty("instrumentalness")
    private Double intrumentalness;

    @JsonProperty("liveness")
    private Double liveness;

    @JsonProperty("valence")
    private Double valence;

    @JsonProperty("tempo")
    private Double tempo;

    @JsonProperty("duration_ms")
    private Integer durationMs;

    @JsonProperty("time_signature")
    private Integer timeSignature;
}
