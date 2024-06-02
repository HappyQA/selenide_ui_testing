package cred;

@org.aeonbits.owner.Config.Sources("classpath:config.properties")
public interface ICredentialsFile extends org.aeonbits.owner.Config {

    @Key("TestKey")
    String someTestValue();
}
