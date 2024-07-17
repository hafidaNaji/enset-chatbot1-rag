package net.naji.ensetchatbot1rag.web;

import net.naji.ensetchatbot1rag.Services.ChatAiService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatRestController {
    private ChatAiService chatAiService;


    public ChatRestController(ChatAiService chatAiService) {
        this.chatAiService = chatAiService;
    }
    @GetMapping(value = "/ask",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public String ask(String question){
        return chatAiService.ragChat(question);

    }
}
