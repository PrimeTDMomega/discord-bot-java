import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MyBot extends ListenerAdapter {
    public static void main(String[] args) throws Exception {
        // Replace YOUR_BOT_TOKEN with your bot's token
        JDA jda = JDABuilder.createDefault("YOUR_BOT_TOKEN").build();
        jda.addEventListener(new MyBot());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // Get the message and the channel it was sent in
        Message message = event.getMessage();
        MessageChannel channel = event.getChannel();

        // Check if the message starts with the "!hello" command
        if (message.getContentRaw().startsWith("!hello")) {
            // Send a greeting to the channel
            channel.sendMessage("Hello there!").queue();
        }
    }
}
