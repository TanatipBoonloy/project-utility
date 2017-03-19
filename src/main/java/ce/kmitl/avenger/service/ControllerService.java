package ce.kmitl.avenger.service;

import ce.kmitl.avenger.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 1/11/2017.
 */
@Service
public class ControllerService {
    public List<String> getIdsFromPlayList(PlaylistRequest request) {
        List<PlaylistSong> playlistSongs = request.getItemList();
        List<String> songIdList = new ArrayList<>();
        for (PlaylistSong playlistSong : playlistSongs) {
            PlaylistSongTrack playlistSongTrack = playlistSong.getTrack();
            songIdList.add(playlistSongTrack.getId());
        }
        return songIdList;
    }

    public String getCSVSongName(PlaylistRequest request,String genre){
        List<PlaylistSong> playlistSongs = request.getItemList();

        String[] songs = new String[playlistSongs.size()];

        for(int i = 0 ; i < playlistSongs.size() ; i++) {
            PlaylistSongTrack track = playlistSongs.get(i).getTrack();
            songs[i] = track.getId() + "," + track.getName() + "," + track.getArtist().get(0).getName() + "," + genre;
        }

        return String.join("\n",songs);
    }

    public String getCSVFormatFromAttributes(AttributeRequest request) {
        List<AudioFeatures> audioFeatures = request.getAudioFeaturesList();

        String[] attributes = new String[audioFeatures.size()];


        for (int i = 0; i < audioFeatures.size(); i++) {
            AudioFeatures selected = audioFeatures.get(i);
            attributes[i] = selected.getId() + "," + selected.getDanceability() + "," + selected.getEnergy() + "," + selected.getKey()
                    + "," + selected.getLoudness() + "," + selected.getMode() + "," + selected.getSpeechiness() + "," + selected.getAcousticness()
                    + "," + selected.getIntrumentalness() + "," + selected.getLiveness() + "," + selected.getValence() + "," + selected.getTempo()
                    + "," + selected.getDurationMs() + "," + selected.getTimeSignature();
        }

        String attributesCSVFormat = String.join("\n", attributes);
        String columnCSVFormat = "id,danceability,energy,key,loudness,mode,speechiness,acousticness,instrumentalness,liveness," +
                "valence,tempo,duration_ms,time_signature";
        return columnCSVFormat + "\n" + attributesCSVFormat;
//        String[] keys = new String[13];
//        Set<String> key = audioFeatures.get(0).keySet();
//
//        for(String eachKey : key) {
//
//            keyCSVFormat = keyCSVFormat + "," + eachKey;
//        }
//        String keyCSVFormat = String.join(",",keys);
//
//        for( Map<String,Object> eachAudioFeatures : audioFeatures) {
//        }
    }
}
