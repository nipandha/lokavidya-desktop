package com.iitb.lokavidya.core.data;



import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.iitb.lokavidya.core.utils.GeneralUtils;

import java.util.Objects;

/**
 * A Segment.
 */

public class Segment implements Serializable {

	public Segment()
	{
		this.id= GeneralUtils.generateRandomNumber(11).intValue();
	}
	
	
    private Slide slide;

    private Video video;

    private Set<LayeringObject> layeringObjects = new HashSet<LayeringObject>();

    private Set<Reference> references = new HashSet<Reference>();

    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Slide getSlide() {
        return slide;
    }

    public void setSlide(Slide slide) {
        this.slide = slide;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public Set<LayeringObject> getLayeringObjects() {
        return layeringObjects;
    }

    public void setLayeringObjects(Set<LayeringObject> layeringObjects) {
        this.layeringObjects = layeringObjects;
    }

    public Set<Reference> getReferences() {
        return references;
    }

    public void setReferences(Set<Reference> references) {
        this.references = references;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Segment segment = (Segment) o;
        return Objects.equals(id, segment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Segment{" +
            "id=" + id +
            '}';
    }
}
