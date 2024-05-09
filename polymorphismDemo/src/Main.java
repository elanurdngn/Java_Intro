public class Main {
    public static void main(String[] args) {
//        BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(),new ConsoleLogger().,new FileLogger()};
//        for (BaseLogger logger:baseLoggers) {
//            logger.log("Log Mesajı");
//        }

        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }
}