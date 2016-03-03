package com.iitb.lokavidya.core.data;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.iitb.lokavidya.core.utils.GeneralUtils;

import java.util.Objects;

/**
 * A Slide.
 */

public class Slide implements Serializable {

	public Slide() {
		this.id= GeneralUtils.generateRandomNumber(11).intValue();
	}

    private String imageURL;

    private String pptURL;

    private String imageResolution;

    private Double imageFileSize;

    private Double pptFileSize;

    private Audio audio;

    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPptURL() {
        return pptURL;
    }

    public void setPptURL(String pptURL) {
        this.pptURL = pptURL;
    }

    public String getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public Double getImageFileSize() {
        return imageFileSize;
    }

    public void setImageFileSize(Double imageFileSize) {
        this.imageFileSize = imageFileSize;
    }

    public Double getPptFileSize() {
        return pptFileSize;
    }

    public void setPptFileSize(Double pptFileSize) {
        this.pptFileSize = pptFileSize;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Slide slide = (Slide) o;
        return Objects.equals(id, slide.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Slide{" +
            "id=" + id +
            ", imageURL='" + imageURL + "'" +
            ", pptURL='" + pptURL + "'" +
            ", imageResolution='" + imageResolution + "'" +
            ", imageFileSize='" + imageFileSize + "'" +
            ", pptFileSize='" + pptFileSize + "'" +
            '}';
    }
}
