/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.soa.midtermjersey;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author lendle
 */
@Path("note")
public class NoteResource {
    

    static List<Note> getNotes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Note.getNote();
    }
    //2. (18%) return the corresponding note with the given id
    //remember to add the required annotations
    
    public Note getNote(long id){
        return NoteRepository.getNote(id);
    }
    
    //3. (18%) remove the corresponding note with the given id
    //remember to add the required annotations
    @Path("{id}")
    public void removeNote(@PathParam("id") long id){
        NoteRepository.removeNote(id);
    }
    
    //4. (18%) add a new note to the repository
    //remember to add the required annotations
    public void addNote(Note note){
        NoteRepository.addNote(note);
    }
    
    //5. (18%) update the corresponding note
    //remember to add the required annotations
    public void updateNote(Note note){
        NoteRepository.removeNotes(note.getId());
        NoteRepository.addNote(note);
    }
}
