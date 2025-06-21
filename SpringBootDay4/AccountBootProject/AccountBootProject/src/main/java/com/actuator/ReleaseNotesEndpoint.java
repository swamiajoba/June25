package com.actuator;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import com.bean.ReleaseNote;

@Component
@Endpoint(id="releaseNotes")
public class ReleaseNotesEndpoint {
	List<ReleaseNote> noteList;
	
	public ReleaseNotesEndpoint(){
		noteList=new ArrayList<>();
		noteList.add(new ReleaseNote(
					"1.0",
					LocalDateTime.of(2015,Month.APRIL,1,10,30),
					"v1.0 changelog") );
		noteList.add(new ReleaseNote(
				"1.1",
				LocalDateTime.of(2020,Month.JUNE,1,10,30),
				"v1.1 changelog") );
	}
   
    @ReadOperation
    public List<ReleaseNote> getReleaseNotes() {
        return noteList;
    }

    @WriteOperation
    public ReleaseNote addReleaseNote(String version, String changeLogData) {
        ReleaseNote releaseNote = new ReleaseNote(version, LocalDateTime.now(), changeLogData);
        noteList.add(releaseNote);
        return releaseNote;
    }

    @DeleteOperation
    public void deleteReleaseNote(@Selector String version) {
    	Iterator<ReleaseNote> it= noteList.iterator();
    	while(it.hasNext()) {
    		ReleaseNote note=it.next();
    		if(note.getVersion().equals(version)) {
    			it.remove();
    		}
    	}
        
    }
}
