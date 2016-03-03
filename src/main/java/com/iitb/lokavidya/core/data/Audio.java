package com.iitb.lokavidya.core.data;

import java.io.Serializable;
import java.util.Objects;

import com.iitb.lokavidya.core.utils.GeneralUtils;

/**
 * A Audio.
 */

public class Audio implements Serializable {

	public Audio() {
		this.id= GeneralUtils.generateRandomNumber(11).intValue();
	}
	
    private Double audioDuration;

    private Double audioBitrate;

    private Double audioFileSize;

    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Double audioDuration) {
        this.audioDuration = audioDuration;
    }

    public Double getAudioBitrate() {
        return audioBitrate;
    }

    public void setAudioBitrate(Double audioBitrate) {
        this.audioBitrate = audioBitrate;
    }

    public Double getAudioFileSize() {
        return audioFileSize;
    }

    public void setAudioFileSize(Double audioFileSize) {
        this.audioFileSize = audioFileSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Audio audio = (Audio) o;
        return Objects.equals(id, audio.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Audio{" +
            "id=" + id +
            ", audioDuration='" + audioDuration + "'" +
            ", audioBitrate='" + audioBitrate + "'" +
            ", audioFileSize='" + audioFileSize + "'" +
            '}';
    }
}
