# Advanced Discord Bot
To create an advanced Discord bot in Java, you will need to use a library called JDA (Java Discord API). Here are the steps you can follow to create your bot:
1. Install the Java Development Kit (JDK) and the Integrated Development Environment (IDE) of your choice (e.g. Eclipse or IntelliJ IDEA).
2. Create a new Java project in your IDE and add the JDA dependency to your project. You can do this by adding the following to your build.gradle file:
  ```
  repositories {
    mavenCentral()
}

dependencies {
    implementation 'net.dv8tion:JDA:4.2.0_214'
}
```
3. Create a new Discord bot by going to the Discord Developer Portal (https://discordapp.com/developers/applications/) and clicking "New Application". Give your bot a name and click "Create".
4. In the "Settings" tab, click on "Create a Bot" and then click "Yes, do it!". This will generate a token for your bot, which you will use to authenticate the bot with the Discord API.
5. Go to the "OAuth2" tab and select the "bot" scope. Then, select the permissions your bot will need (e.g. "Send Messages", "Read Message History", etc.). Click "Copy" to copy the OAuth2 URL and then paste it into your browser to invite the bot to your Discord server.
6. In your Java project, create a new class and import the necessary JDA classes. Then, use the JDABuilder class to build and authenticate the bot with your token:
  ```
  JDA jda = new JDABuilder(TOKEN)
                .addEventListeners(new MyEventListener())
                .build();
```
7. Create a class for your event listener, which will be responsible for handling events such as messages being sent in a channel. You can do this by extending the EventAdapter class and overriding the methods for the events you want to handle:
  ```
  public class MyEventListener extends EventAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // handle the event here
    }
}
```
8. Use the JDA instance to send messages, react to messages, and perform other actions as needed.

## MEME BOT
I have a meme bot template over on the [`meme`](https://github.com/PrimeTDMomega/discord-bot-java/tree/meme/) branch.
