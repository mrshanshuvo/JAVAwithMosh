package OOProgramming.DependencyInjection;

public class MAIN {
    public static void main(String[] args) {

        // Dependencies
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        // MOTService has dependency on EmailService with Injection
        MOTService motService = new MOTService(emailService);

        // Injection
        CarServices carServices = new CarServices(carDAO, emailService, motService);
    }
}
