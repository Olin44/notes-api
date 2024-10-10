package application;

import com.example.notes.api.NotesApi;
import com.example.notes.model.Note;
import com.example.notes.model.NoteCreateRequest;
import com.example.notes.model.NotePage;
import com.example.notes.model.NoteUpdateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class NotesController implements NotesApi {

    @Override
    public ResponseEntity<NotePage> notesGet(Integer page, Integer size, String sort, String direction) {
        return null;
    }

    @Override
    public ResponseEntity<Void> notesIdDelete(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Note> notesIdGet(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Note> notesIdPut(Integer id, NoteUpdateRequest noteUpdateRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Note> notesPost(NoteCreateRequest noteCreateRequest) {
        return null;
    }
}
