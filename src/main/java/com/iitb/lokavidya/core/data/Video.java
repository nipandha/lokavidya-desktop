package com.iitb.lokavidya.core.data;



import java.io.Serializable;
import java.util.Objects;

import com.iitb.lokavidya.core.utils.GeneralUtils;

/**
 * A Video.
 */

public class Video implements Serializable {

	public Video() {
		this.id= GeneralUtils.generateRandomNumber(11).intValue();
	}
	
    private String videoURL;

    private String videoResolution;

    private Double videoDuration;

    private Double videoFPS;

    private Double videoSize;

    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getVideoResolution() {
        return videoResolution;
    }

    public void setVideoResolution(String videoResolution) {
        this.videoResolution = videoResolution;
    }

    public Double getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Double videoDuration) {
        this.videoDuration = videoDuration;
    }

    public Double getVideoFPS() {
        return videoFPS;
    }

    public void setVideoFPS(Double videoFPS) {
        this.videoFPS = videoFPS;
    }

    public Double getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Double videoSize) {
        this.videoSize = videoSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Video video = (Video) o;
        return Objects.equals(id, video.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Video{" +
            "id=" + id +
            ", videoURL='" + videoURL + "'" +
            ", videoResolution='" + videoResolution + "'" +
            ", videoDuration='" + videoDuration + "'" +
            ", videoFPS='" + videoFPS + "'" +
            ", videoSize='" + videoSize + "'" +
            '}';
    }
}
