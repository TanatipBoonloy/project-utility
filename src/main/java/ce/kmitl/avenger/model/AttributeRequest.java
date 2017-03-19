package ce.kmitl.avenger.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by Jo on 3/18/2017.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeRequest {
    @JsonProperty("audio_features")
    private List<AudioFeatures> audioFeaturesList;
//    private List<Map<String,Object>> audioFeatures;
}
