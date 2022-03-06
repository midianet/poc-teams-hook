package poc.teams;

import poc.teams.api.Card;
import poc.teams.api.Section;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Card card = new Card("Test card", "0078D7", "Avisos do dia");

        List<Section> sections = new ArrayList<>();
        Section sectionOne = new Section(
                "Marcos Fernando",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:SS")),
                "https://lh3.googleusercontent.com/a-/AOh14GjlnllbwyngZBr2FtREL-itw4i256c375uaQ30LjQ=s120-c-rg-br100");
        sectionOne.setText("Fiquem atentos para as notícias do dia. teremos muitas novidades esta semana, sua participação no processo de inovação e fundamental.");
        sections.add(sectionOne);
        card.setSections(sections);
        new TeamsClient("https://monitoratechnology.webhook.office.com/webhookb2/de4a4d4d-0214-4041-8cb2-029bb2c31921@0c7b39e2-956c-4818-9177-2e246d67c6db/IncomingWebhook/d8c868cc55824bc8936aaa3fae369812/9f8a8bc7-a0a5-4390-a80c-412468f1f6da").sendMessage(card);


    }
}
