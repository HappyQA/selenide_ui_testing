package test.config;

@org.aeonbits.owner.Config.Sources("classpath:config.properties")
public interface ConfigFile extends org.aeonbits.owner.Config {

    @Key("TestKey")
    String someTestValue();
}
