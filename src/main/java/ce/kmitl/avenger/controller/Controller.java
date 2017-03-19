package ce.kmitl.avenger.controller;

import ce.kmitl.avenger.model.AttributeRequest;
import ce.kmitl.avenger.model.PlaylistRequest;
import ce.kmitl.avenger.service.ControllerService;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Jo on 1/11/2017.
 */
@RestController
@RequestMapping(value = "/api")
public class Controller {
    @Inject
    private ControllerService controllerService;

    @RequestMapping(value = "playlist",method = RequestMethod.POST)
    public List<String> getSongIdList(@RequestBody PlaylistRequest request) {
        return controllerService.getIdsFromPlayList(request);
    }

    @RequestMapping(value = "playlist/map/name/{genre}", method = RequestMethod.POST)
    public String getPlaylistMapName(
            @PathVariable String genre,
            @RequestBody PlaylistRequest request){
        return controllerService.getCSVSongName(request,genre);
    }

    @RequestMapping(value = "attribute", method = RequestMethod.POST)
    public String getSpotifyAttrubute(@RequestBody AttributeRequest request){
        return controllerService.getCSVFormatFromAttributes(request);
    }
}
