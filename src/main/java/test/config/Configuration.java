package configuration;

public class Configuration {

    public static ICredentialsFile cfg = ConfigFactory.create(ICredentialsFile.class);

    public static String baseUrl = "https://base.url/";

    protected SomeLoginSteps someLoginSteps;

    public void initialStepsClasses() {
        someLoginSteps = new SomeLoginSteps();
    }

    @BeforeAll
    public static void settingUpBrowser() {
        String getRemoteProperty = System.getProperty("remote");
        ChromeOptions options = (ChromeOptions) new ChromeOptions()
                .addArguments("--lang=en_US")
                .addArguments("--remote-allow-origins=*")
                .setEnableDownloads(true);
        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.holdBrowserOpen = false;
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        Configuration.headless = false;
        Configuration.baseUrl = baseUrl;
        if (getRemoteProperty.equals("true")) {
            Configuration.remote = "http://selenium4.test.hub/wd/hub";
        }

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(false)
        );

        SomeLoginSteps someLoginSteps = new SomeLoginSteps();
        someLoginSteps.clickOnButtonSignIn()
                .fillInputUserEmail(cfg.user())
                .clickOnButtonSubmit()
                .fillInputUserPassword(cfg.password())
                .clickOnButtonSubmit()
                .clickOnButtonSubmit();
        someLoginSteps.checkPageTitle("Test Title");
    }

    @BeforeEach
    public void startTest() {
        initialStepsClasses();
    }

    @AfterEach
    public void endTest() {
        Selenide.open(baseUrl);
    }

    @AfterAll
    public static void closeDownBrowser() {
        Selenide.closeWebDriver();
    }
}
