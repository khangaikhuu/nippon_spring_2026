package mn.icode;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	public record Message(int id, String author, String text) {}
    public record CountResponse(int count) {}
    
    private final List<Message> messages = List.of(
    			new Message(1, "Khisgee", "Hello JSON"),
    			new Message(2, "Khongoroo", "Yun Hello JSON"),
    			new Message(3, "Saka", "WTH")
    		);
    
    @GetMapping("/api/messages")
    public List<Message> allMessages(){
    	return messages;
    }
    
    @GetMapping("/api/messages/count")
    public CountResponse countMessages() {
    	return new CountResponse(messages.size());
    }
}
