package com.iitb.lokavidya.core.data;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iitb.lokavidya.core.utils.GeneralUtils;

import java.util.Objects;

/**
 * A Project.
 */

public class Project implements Serializable {

	public Project() {
		this.id= GeneralUtils.generateRandomNumber(11).intValue();
	}
	
    private Double projectSize;

    private Map<Integer,Segment> segments = new HashMap<Integer,Segment>();

    private Integer id;
    
    private List<Integer> orderingSequence;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getProjectSize() {
        return projectSize;
    }

    public void setProjectSize(Double projectSize) {
        this.projectSize = projectSize;
    }
    
    //TODO 
    public List<Segment> getSegments() {
    	List<Segment> segmentList = new ArrayList<Segment>();
        return segmentList;
    }

    //TODO
    public void setSegments(List<Segment> segments) {
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Project project = (Project) o;
        return Objects.equals(id, project.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Project{" +
            "id=" + id +
            ", projectSize='" + projectSize + "'" +
            '}';
    }
    
    public void addSegment(Segment segment)
    {
    	
    }
    
    public void deleteSegment(Segment segment)
    {
    	
    }
    
    
    public void swapSegment(Segment segment1,Segment segment2)
    {
    	
    }
    
    
    
    public static Project getInstance(String pathToProjectJson)
    {
    	System.out.println("Retrieving instance from JSON: Start");
    	Project project = null;
        Gson gson = new Gson();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToProjectJson));
            project = gson.fromJson(bufferedReader, new TypeToken<Project>() {
            }.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Retrieving instance from JSON:END");
        return project;
    }
    
    public static void persist()
    {
    	
    }
    
    
    
}
